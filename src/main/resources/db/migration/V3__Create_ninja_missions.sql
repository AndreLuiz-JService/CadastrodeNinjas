-- Criação da tabela NinjaMissions --
CREATE TABLE ninja_missions (
    id BIGSERIAL PRIMARY KEY,
    joined_at TIMESTAMP,
    finished_at TIMESTAMP,
    ninja_id BIGINT NOT NULL,
    mission_id BIGINT NOT NULL,
    CONSTRAINT fk_ninja FOREIGN KEY (ninja_id) REFERENCES ninjas(id) ON DELETE CASCADE,
    CONSTRAINT fk_mission FOREIGN KEY (mission_id) REFERENCES missions(id) ON DELETE CASCADE,
    CONSTRAINT uq_ninja_mission UNIQUE (ninja_id, mission_id)
);