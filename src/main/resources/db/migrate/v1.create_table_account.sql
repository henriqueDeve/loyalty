CREATE TABLE IF NOT EXISTS Account (
    id SERIAL PRIMARY KEY,
    customerId BIGINT NOT NULL,
    socialNetwork VARCHAR(50),  -- Considerando socialNetwork como uma string
    idUser VARCHAR(255),
    nameUser VARCHAR(255),
    FOREIGN KEY (customerId) REFERENCES customer(id)
);