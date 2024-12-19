-- Ejercicio 1
SELECT descripción, precio, precio * 0.2 AS descuento_sugerido 
FROM productos;

-- Ejercicio 2
SELECT * FROM productos  
WHERE precio > 100 AND precio < 500 
AND id_fab LIKE 'A%';

-- Ejercicio 3
SELECT id_fab, COUNT(id_producto) AS productos_disponibles
FROM productos
GROUP BY id_fab
HAVING COUNT(id_producto) > 5;

-- Ejercicio 4
SELECT p.descripción FROM productos p
WHERE p.precio > (
	SELECT AVG(p2.precio) FROM productos p2
    WHERE p.id_fab = p2.id_fab);

-- Ejercicio 5
SELECT cli.empresa, prod.descripción, ped.importe 
FROM clientes cli 
JOIN pedidos ped ON ped.clie = cli.num_clie
JOIN productos prod ON ped.producto = prod.id_producto;

-- Ejercicio 6
SELECT cli.empresa FROM clientes cli 
WHERE EXISTS(
	SELECT * FROM pedidos ped
    WHERE ped.clie = cli.num_clie AND
    ped.fab LIKE '%BIC%');
    
-- Ejercicio 7
SELECT prod.descripción FROM productos prod 
WHERE prod.precio = (
	SELECT MIN(prod2.precio) 
    FROM productos prod2
    WHERE prod2.id_fab = prod.id_fab);
    
-- Ejercicio 8
WITH gasto_cliente AS(
	SELECT ped.clie, SUM(ped.cant * prod.precio) AS total_gasto
    FROM pedidos ped
	JOIN productos prod ON ped.producto = prod.id_producto 
    AND ped.fab = prod.id_fab
    GROUP BY ped.clie
)
SELECT clie.empresa, gc.total_gasto
FROM clientes clie 
JOIN gasto_cliente gc ON gc.clie = clie.num_clie 
WHERE gc.total_gasto > (SELECT MIN(gc2.total_gasto) 
	FROM gasto_cliente gc2); 
    
-- Ejercicio 9
SELECT prod.id_producto     
FROM productos prod
WHERE NOT EXISTS (
	SELECT 1
    FROM pedidos ped
    WHERE ped.producto = prod.id_producto
    GROUP BY ped.clie
    HAVING COUNT(ped.num_pedido) <= 3);
    
-- Ejercicio 10
SELECT prod.id_fab, COUNT(DISTINCT prod.id_producto) AS productos
FROM productos prod
JOIN pedidos ped ON prod.id_producto = ped.producto AND prod.id_fab = ped.fab
GROUP BY prod.id_fab
HAVING SUM(ped.cant) > 100 AND COUNT(DISTINCT prod.id_producto) >= 2;
