CREATE TABLE IF NOT EXISTS Product (
    id SERIAL PRIMARY KEY,
    corporateId BIGINT NOT NULL,
    customerId BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    code VARCHAR(50) NOT NULL,
    createdDate TIMESTAMP,
    lastUpdate TIMESTAMP,
    count INTEGER,
    value DECIMAL(15, 2),
    FOREIGN KEY (corporateId) REFERENCES corporate(id),
    FOREIGN KEY (customerId) REFERENCES customer(id)
);
