-- cria localizacao
INSERT INTO localizacao VALUES (1, 'Rua domingos de meira', '92', '', 'Jardim Maria Duarte', 'São Paulo', 'SP'), (2, 'Avenida Paulista', '1500', '', 'Bela Vista', 'São Paulo', 'SP');
-- cria loja
INSERT INTO lojas VALUES (1, 'Extra Taboão da Serra', 1);
INSERT INTO lojas VALUES (2, 'Pub da Paulista', 2);


-- cadastra produtos
INSERT INTO produtos (id, nome, foto, descricao, preco, estoque) VALUES
    (1, 'Cerveja Skol 267ml'        ,'img/produtos/skol_267.jpg', 'descricao', '1.99', 1000),
    (2, 'Cerveja Brahma 267ml'      ,'img/produtos/skol_267.jpg', 'descricao', '1.99', 1000),
    (3, 'Cerveja Colorado 479ml'    ,'img/produtos/skol_267.jpg', 'descricao', '5.99', 1000)
;