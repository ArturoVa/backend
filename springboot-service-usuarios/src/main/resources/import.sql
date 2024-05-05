INSERT INTO usuarios (username, password, enabled, nombre , apellido, email) VALUES ('artu','12345', 1, 'Arturo', 'Vazquez','artva@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre , apellido, email) VALUES ('migueeel','12345', 1, 'Miguel', 'Lopez','milop@gmail.com');


INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles(user_id, rooles_id) VALUES (1,1);
INSERT INTO usuarios_to_roles(user_id, rooles_id) VALUES (2,2);
INSERT INTO usuarios_to_roles(user_id, rooles_id) VALUES (2,1);