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
WHERE título != 'Rep. Ventas' AND título != 'Dir. Ventas' ;

-- Ejercicio 5
SELECT * FROM repventas
ORDER BY título DESC, edad ASC; 

-- Ejercicio 6
SELECT num_empl, nombre FROM repventas 
WHERE repventas.director IS NULL;

-- Ejercicio 7 
SELECT id_fab FROM productos
ORDER BY productos.id_fab DESC;

-- Ejercicio 8
SELECT * FROM productos
WHERE productos.descripción LIKE '%Bisagra%';
 
-- Ejercicio 9
SELECT num_clie, empresa FROM clientes
WHERE clientes.num_clie % 10 = 5 OR num_clie % 10 = 7;

-- Ejercicio 10 
SELECT nombre, edad, contrato FROM repventas r
WHERE r.edad >= 40 AND r.edad <= 55 
OR YEAR(contrato) = 1997 AND edad < 30;

 