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
SELECT pedidos.*, productos.descripción, repventas.nombre, clientes.empresa
FROM pedidos 
JOIN productos ON pedidos.producto = productos.id_producto
JOIN repventas ON pedidos.rep = repventas.num_empl
JOIN clientes ON pedidos.clie = clientes.num_clie
WHERE pedidos.importe > 20000;

-- Ejercicio 6
SELECT pedidos.num_pedido, productos.descripción,
productos.precio AS precio_original, 
ROUND(pedidos.importe/pedidos.cant, 0) AS precio_compra
FROM productos 
JOIN pedidos ON productos.id_producto = pedidos.producto
WHERE productos.precio != ROUND(pedidos.importe/pedidos.cant);

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



