CREATE TABLE IF NOT EXISTS Customer (
    id SERIAL PRIMARY KEY,
    corporateId BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    age INTEGER,
    phone VARCHAR(20),
    email VARCHAR(255) NOT NULL,
    total BIGINT,
    FOREIGN KEY (corporateId) REFERENCES corporate(id)
);