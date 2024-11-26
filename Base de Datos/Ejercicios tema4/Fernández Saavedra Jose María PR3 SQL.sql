-- PRÁCTICA 2



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



