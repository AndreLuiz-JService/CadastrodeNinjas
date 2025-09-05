-- Criação da tabela de cadastro de ninjas
CREATE TABLE IF NOT EXISTS tb_cadastro (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    idade INTEGER NOT NULL CHECK (idade > 0)
);

-- Comentários nas colunas
COMMENT ON TABLE tb_cadastro IS 'Tabela para cadastro de ninjas';
COMMENT ON COLUMN tb_cadastro.id IS 'Identificador único do ninja';
COMMENT ON COLUMN tb_cadastro.nome IS 'Nome do ninja';
COMMENT ON COLUMN tb_cadastro.email IS 'Email único do ninja';
COMMENT ON COLUMN tb_cadastro.idade IS 'Idade do ninja (deve ser maior que 0)';

-- Índice para melhorar performance na busca por email
CREATE INDEX IF NOT EXISTS idx_tb_cadastro_email ON tb_cadastro(email);
