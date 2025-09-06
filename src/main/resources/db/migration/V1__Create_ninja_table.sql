-- Criação da tabela de cadastro de ninjas
CREATE TABLE  ninjas (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    age SMALLINT NOT NULL CHECK (age > 0)
);
