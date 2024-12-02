-- PRÁCTICA 3
-- Ejercicio 1
SELECT id_producto, precio
FROM productos p
WHERE p.precio < 1000empresa
UNION ALL
SELECT p.id_producto, ped.importe
FROM productos p
JOIN pedidos ped ON p.id_producto = ped.producto;

-- Ejercicio 2
SELECT num_empl FROM repventas
WHERE YEAR(contrato) >= 2000
UNION ALL
SELECT num_empl FROM repventas JOIN clientes 
ON repventas.num_empl = clientes.rep_clie
WHERE clientes.empresa LIKE '%S.L.%' 
ORDER BY num_empl;
 
-- Ejercicio 3
 SELECT num_empl, nombre, título, oficinas.ciudad FROM repventas
 JOIN oficinas ON repventas.oficina_rep = oficinas.oficina;
 
-- Ejercicio 4
 SELECT num_empl, nombre, título, oficinas.ciudad FROM repventas
 JOIN oficinas ON repventas.oficina_rep = oficinas.oficina 
 WHERE oficinas.ciudad = 'Toledo';
 
 -- Ejercicio 5
SELECT p.*, productos.descripción, emp.nombre_empleado, cli.nombre_cliente
FROM pedidos 
JOIN productos ON p.codigo_producto = prod.codigo_producto
JOIN empleados ON p.codigo_empleado = emp.codigo_empleado
JOIN clientes ON p.codigo_cliente = cli.codigo_cliente
WHERE p.importe > 20000;

 
-- Ejercicio 7
SELECT empleados.*
FROM repventas empleados
WHERE empleados.ventas >= (
	SELECT SUM(ofi.ventas)
    FROM oficinas ofi
    WHERE ofi.ciudad = 'Alicante'
);

-- Ejercicio 8
SELECT descripción FROM productos p 
JOIN pedidos ped 
WHERE ped.clie = (
	SELECT num_clie FROM clientes c 
    WHERE empresa = 'EVBE S.A.'
);

SELECT descripción FROM productos p 
JOIN pedidos ped 
JOIN clientes c 
WHERE ped.clie = c.num_clie AND c.empresa = 'EVBE S.A.';



