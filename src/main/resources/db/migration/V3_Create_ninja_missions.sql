-- Criação da tabela NinjaMissions --
CREATE TABLE ninja_missions (
    id BIGSERIAL PRIMARY KEY,
    ninja_id BIGINT NOT NULL,
    mission_id BIGINT NOT NULL,
    start_at TIMESTAMP,
    end_at TIMESTAMP,
    CONSTRAINT fk_ninja FOREIGN KEY (ninja_id) REFERENCES ninjas(id) ON DELETE CASCADE,
    CONSTRAINT fk_mission FOREIGN KEY (mission_id) REFERENCES missions(id) ON DELETE CASCADE,
    CONSTRAINT uq_ninja_mission UNIQUE (ninja_id, mission_id)
);