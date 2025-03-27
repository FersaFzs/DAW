DELIMITER //

CREATE TRIGGER trigger_insertar_oficina
AFTER INSERT ON oficinas
FOR EACH ROW
BEGIN
    INSERT INTO auditoria_oficinas (oficina, ciudad)
    VALUES (NEW.oficina, NEW.ciudad);
END;
//

DELIMITER ;

DELIMITER //

CREATE TRIGGER evitar_valores_negativos
BEFORE INSERT INTO oficinas
FOR EACH ROW
BEGIN
	IF NEW.ventas <= 0 THEN
    SIGNAL SQLSTATE '45000'SET MESSAGE_TEXT = 'El valor de la columana "ventas" no es válido';
    END IF;
END;

DELIMITER ;

DELIMITER //

CREATE TRIGGER evitar_actualizar_ventas_negativas
BEFORE UPDATE ON oficinas
FOR EACH ROW
BEGIN 
	IF NEW.ventas <= 0 THEN
    SIGNAL SQLSTATE '45000'SET MESSAGE_TEXT = 'El valor de la columana "ventas" no es válido';
	END IF;
END;

DELIMITER ;

DELIMITER //

CREATE TRIGGER actualizacion_automatica_objetivos
AFTER UPDATE ON oficinas
FOR EACH ROW
BEGIN
	IF ventas > objetivo THEN
    UPDATE oficinas
    SET objetivo = NEW.objetivo * 1.1
    WHERE oficina = NEW.oficina;
END;

DELIMITER ;

CREATE TABLE historial_repventas (
    id SERIAL PRIMARY KEY,
    id_rep INT NOT NULL,
    campo_modificado VARCHAR(45) NOT NULL,
    valor_antiguo VARCHAR(45),
    valor_nuevo VARCHAR(45),
    fecha_cambio TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //

CREATE TRIGGER registro_cambios
BEFORE UPDATE ON repventas
FOR EACH ROW
BEGIN
	IF OLD.num_empl != NEW.num_empl THEN
    INSERT INTO historial_repventas(id_rep, campo_modificado, valor_antiguo, valor_nuevo, fecha_cambio)
    VALUES (
		NEW.num_empl,
        "empleados",
        OLD.num_empl,
        NEW.num_empl,
        NOW());
	IF ELSE ...
	END IF;
END;

DELIMITER ; 

DELIMITER //

ALTER TABLE repventas ADD COLUMN activo TINYINT(1) NOT NULL DEFAULT 1;

CREATE TRIGGER eliminacionLogica
BEFORE DELETE ON repventas 
FOR EACH ROW
BEGIN 
	UPDATE repventas
    
    


