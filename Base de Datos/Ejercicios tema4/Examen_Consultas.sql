-- EXAMEN CONSULTAS SQL
-- José María Fernández Saavedra 1DAW

-- Ejercicio 1
SELECT descripción, precio, precio * 0.85 AS descuento_aplicado 
FROM productos
WHERE precio > 50;

-- Ejercicio 2
SELECT * FROM productos
WHERE precio > 20 AND precio < 100 
AND existencias > 10 
AND id_fab LIKE '%M%';

-- Ejercicio 3
SELECT emp.nombre, emp.ventas, COUNT(ped.num_pedido) AS ventas_realizadas
FROM repventas emp JOIN pedidos ped
ON emp.num_empl = ped.rep
GROUP BY ped.rep
HAVING ventas_realizadas > 5;

-- Ejercicio 4
SELECT p1.* FROM productos p1
WHERE p1.precio > (
	SELECT AVG(p2.precio) FROM productos p2
    WHERE p1.id_fab = p2.id_fab);
    
-- Ejercicio 5
SELECT clie.empresa, emp.nombre, prod.descripción, COUNT(ped.num_pedido) AS pedidos_realizados
FROM clientes clie 
JOIN repventas emp ON clie.rep_clie = emp.num_empl
JOIN pedidos ped ON clie.num_clie = ped.clie
JOIN productos prod ON ped.producto = prod.id_producto
GROUP BY ped.clie;

-- Ejercicio 6
SELECT cli.empresa FROM clientes cli
WHERE EXISTS(
	SELECT 1 FROM pedidos ped
    JOIN productos prod 
    ON ped.producto = prod.id_producto
    WHERE prod.precio > 200
    AND ped.clie = cli.num_clie);

-- Ejercicio 7
-- SELECT prod1.descripción FROM productos
-- WHERE (SELECT 


-- Ejercicio 8
SELECT clie.empresa, COUNT(ped.num_pedido) AS compras_realizadas, SUM(ped.importe) AS total_gastado FROM clientes clie
JOIN pedidos ped ON clie.num_clie = ped.clie
GROUP BY clie.empresa 
HAVING compras_realizadas > 5;

-- Ejercicio 9
SELECT prod.descripción FROM productos prod
WHERE EXISTS (
	SELECT 1 FROM productos prod2
    WHERE prod.id_fab = prod2.id_fab 
    AND prod2.precio > 100);
    
-- Ejercicio 10
SELECT prod.id_fab, COUNT(prod.precio) AS productos FROM productos prod
GROUP BY prod.id_fab
HAVING;



