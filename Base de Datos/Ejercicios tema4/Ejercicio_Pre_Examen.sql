-- EJERCICIO PRE EXAMEN
-- Ejercicio 1
SELECT descripción, precio, precio * 0.2 AS descuento_sugerido 
FROM productos;

-- Ejercicio 2
SELECT precio FROM productos 
JOIN pedidos ON productos.id_fab = pedidos.fab
JOIN clientes ON pedidos.rep = clientes.rep_clie
WHERE productos.precio > 100 AND productos.precio < 500 
AND clientes.empresa LIKE 'A%';

-- Ejercicio 3
SELECT id_fab, COUNT(id_producto) AS total_productos
FROM productos
GROUP BY id_fab
HAVING COUNT(id_producto) > 5;

-- Ejercicio 4
SELECT p1.descripción, p1.precio FROM productos p1
WHERE p1.precio > (
SELECT AVG(p2.precio) FROM productos p2
WHERE p2.id_fab = p1.id_fab 
);

-- Ejercicio 5
SELECT clientes.empresa, productos.descripción, pedidos.importe
FROM clientes 
JOIN pedidos ON pedidos.clie = clientes.num_clie
JOIN productos ON pedidos.fab = productos.id_fab;

-- Ejercicio 6
SELECT empresa FROM clientes
WHERE EXISTS(
SELECT 1 FROM pedidos
	JOIN productos ON pedidos.producto = productos.id_producto
    WHERE pedidos.clie = clientes.num_clie 
    AND productos.id_fab = 'BIC'
    );
    
-- Ejercicio 7
SELECT descripción FROM productos 
WHERE productos.precio  > (
	SELECT MIN(p2.precio) 
    FROM productos p2
    WHERE p2.id_fab = productos.id_fab
    );