-- Criação da tabela de cadastro de ninjas
CREATE TABLE  ninjas (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    idade INTEGER NOT NULL CHECK (idade > 0)
);
