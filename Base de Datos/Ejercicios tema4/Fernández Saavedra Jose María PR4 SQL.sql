-- PRÁCTICA 4
-- Ejercicio 1
SELECT num_pedido, fecha_pedido FROM pedidos
WHERE fecha_pedido > (
	SELECT rep2.contrato FROM repventas rep2
    WHERE rep2.nombre LIKE '%María García%');

-- Ejercicio 2
SELECT * FROM repventas vend JOIN oficinas ofi
ON vend.oficina_rep = ofi.oficina
WHERE vend.cuota >= (
	SELECT ofi2.objetivo * 0.75 FROM oficinas ofi2
    WHERE ofi2.oficina = vend.oficina_rep);
    
-- Ejercicio 3
SELECT nombre FROM repventas 
WHERE repventas.cuota >= (
	SELECT oficinas.objetivo FROM oficinas
    WHERE repventas.oficina_rep = oficinas.oficina);

-- Ejercicio 4
SELECT empleados.*
FROM repventas empleados
WHERE empleados.ventas >= (
	SELECT SUM(ofi.ventas)
    FROM oficinas ofi
    WHERE ofi.ciudad = 'Alicante'
);

-- Ejercicio 5
SELECT repventas.num_empl, repventas.nombre, repventas.director, repventas.oficina_rep, oficinas.dir, empl.nombre 
FROM repventas 
JOIN repventas empl ON repventas.director = empl.num_empl
JOIN oficinas ON empl.oficina_rep = oficinas.oficina;

-- Ejercicio 6
SELECT repventas.nombre, repventas.num_empl, e.nombre AS nombre_director_empleado, e.oficina_rep, o.dir, d.nombre
FROM repventas
JOIN repventas e ON repventas.director = e.num_empl
JOIN oficinas o ON o.oficina = e.oficina_rep
JOIN repventas d ON o.dir = d.num_empl
WHERE e.num_empl = o.dir;