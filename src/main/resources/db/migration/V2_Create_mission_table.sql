-- Criação da tabela Mission --
CREATE TABLE missions (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    ranking VARCHAR(50),
    state VARCHAR(50),
    start_at TIMESTAMP,
    end_at TIMESTAMP
);