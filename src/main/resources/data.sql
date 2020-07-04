-- cria localizacao
INSERT INTO localizacao VALUES (1, 'Rua domingos de meira', '92', '', 'Jardim Maria Duarte', 'São Paulo', 'SP'), (2, 'Avenida Paulista', '1500', '', 'Bela Vista', 'São Paulo', 'SP');
-- cria loja
INSERT INTO lojas VALUES (1, 'Extra Taboão da Serra', 1);
INSERT INTO lojas VALUES (2, 'Pub da Paulista', 2);

-- cria usuarios
INSERT INTO users (id, name, email) VALUES (1, 'Juan Nogueira', 'jsnogueira.web@gmail.com');
INSERT INTO users (id, name, email) VALUES (2, 'Douglas Batista', 'douglas.batista@gmail.com');
INSERT INTO users (id, name, email) VALUES (3, 'Gabriel França', 'gabriel.franca@gmail.com');
INSERT INTO users (id, name, email) VALUES (4, 'Gustavo Rodolfo', 'gustavo.rodolfo@gmail.com');
INSERT INTO users (id, name, email) VALUES (5, 'Gabriela Biserra', 'gabriela.biserra@gmail.com');

-- cadastra produtos
INSERT INTO produtos (id, nome, foto, descricao) VALUES
    (1, 'Cerveja Skol 267ml'        ,'img/produtos/skol_267.jpg', 'descricao'),
    (2, 'Cerveja Brahma 267ml'      ,'img/produtos/skol_267.jpg', 'descricao'),
    (3, 'Cerveja Colorado 479ml'    ,'img/produtos/skol_267.jpg', 'descricao')
;

INSERT INTO store_product (id, store_id, product_id, preco, estoque) VALUES (1, 1, '1.99', 1000);