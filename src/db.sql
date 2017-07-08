create database ambc;

CREATE TABLE `ambc`.`personas` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

INSERT INTO `ambc`.`personas`
(`id`,
`nombre`,
`apellido`,
`direccion`,
`telefono`,
`celular`,
`email`)
VALUES
(1,
"Jhon",
"Doe",
"Alla 4444",
"1111",
"151111",
"jd@mail");


INSERT INTO `ambc`.`personas`
(`id`,
`nombre`,
`apellido`,
`direccion`,
`telefono`,
`celular`,
`email`)
VALUES
(2,
"Jhon",
"Doe",
"Alla 4444",
"1111",
"151111",
"jd@mail");

