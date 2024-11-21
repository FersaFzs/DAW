-- PRACTICA 2
-- Ejercicio 1
SELECT CONCAT(descripción, ' vale ', precio, ' euros') AS producto_detallado 
FROM productos;

-- Ejercicio 2
SELECT num_pedido, MONTH(fecha_pedido) AS mes
FROM pedidos
WHERE DAY(fecha_pedido) = 2;

-- Ejercicio 3
SELECT num_pedido, producto, cant 
FROM pedidos
WHERE cant > 30 OR cant < 5;

-- Ejercicio 4
SELECT * FROM repventas
WHERE título != 'Rep. Ventas' AND título != 'Dir. Ventas' AND director IS NULL;

-- Ejercicio 5
SELECT * FROM repventas
 