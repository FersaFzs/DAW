/*Consulta 1*/

SELECT empresa, límite_crédito 
FROM clientes;

/*Consulta 2*/

SELECT id_producto, precio
FROM productos;

/*Consulta3*/

SELECT id_producto 
FROM productos 
WHERE existencias < '100';

/*Consulta4*/

SELECT precio 
FROM productos
WHERE id_fab = 'REI' AND id_producto = '2A44L';

/*Consulta5*/

SELECT empresa
FROM clientes
WHERE límite_crédito <= '60000' AND límite_crédito >= 40000;

/*Consulta6*/

SELECT empresa, num_clie
FROM clientes
WHERE rep_clie = '102';

/*Consulta7*/

SELECT oficina, ciudad,
objetivo * 1.1
FROM oficinas;

/*Consulta8*/

SELECT ciudad, región, (ventas - objetivo) AS diferencia
FROM oficinas
WHERE (ventas - objetivo) < 0;

/*Consulta9*/

SELECT pedidos.num_pedido, pedidos.producto, productos.precio
FROM pedidos 
INNER JOIN productos ON pedidos.producto = productos.id_producto;


/*Consulta10*/

SELECT DISTINCT YEAR(fecha_pedido) AS año_pedido
FROM pedidos;
