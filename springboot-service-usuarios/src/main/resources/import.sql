INSERT INTO usuarios (username, password, enabled, nombre , apellido, email) VALUES ('artu','$2a$10$/EXqJGrSnkPj6xuywf0r1uALU6nyovGfU1KTOWz8Mbp9kuoE25ma6', 1, 'Arturo', 'Vazquez','artva@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre , apellido, email) VALUES ('migueeel','$2a$10$W7ejfWXlfJRIBQ.7Ibo.d.KTz9/qWkUhiaDW/.m8OF9J8UwK.R.3K', 1, 'Miguel', 'Lopez','milop@gmail.com');


INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles(user_id, rooles_id) VALUES (1,1);
INSERT INTO usuarios_to_roles(user_id, rooles_id) VALUES (2,2);
INSERT INTO usuarios_to_roles(user_id, rooles_id) VALUES (2,1);