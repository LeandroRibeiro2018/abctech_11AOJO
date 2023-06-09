CREATE TABLE `assistances` (
                               `id` bigint NOT NULL AUTO_INCREMENT,
                               `description` varchar(255) NOT NULL,
                               `name` varchar(150) NOT NULL,
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO assistances (name, description) VALUES ('Troca de aparelho', 'Troca de aparelho decodificador de sinal');
INSERT INTO assistances (name, description) VALUES ('Troca de cabo interno', 'Troca de cabo interno');
INSERT INTO assistances (name, description) VALUES ('Troca de fiação interna', 'Substituição de fiação interna da residência');
INSERT INTO assistances (name, description) VALUES ('Manutenção em fogão', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em geladeira', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em máquina de lavar', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Troca de aparelho', 'Troca de tambor maquina consul');
INSERT INTO assistances (name, description) VALUES ('Reparo de Gerladeira', 'Verificação do Gaz da Geladeira');
INSERT INTO assistances (name, description) VALUES ('Troca de fio de Maquina', 'Substituição de fiação interna da residência');
INSERT INTO assistances (name, description) VALUES ('Manutenção em Micorondas', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em Forno eletrico', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em máquina de lava e seca ', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Troca de tampa de maquina ', 'Troca de tampa de maquina');
INSERT INTO assistances (name, description) VALUES ('Troca de fiação exterma', 'Substituição de fiação externa da residência');
INSERT INTO assistances (name, description) VALUES ('Manutenção em forno eletrico', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em geladeira Frost-Free', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em máquina de Secar', 'Reparo sem necessidade de compra de peças');