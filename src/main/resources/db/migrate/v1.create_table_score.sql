CREATE TABLE IF NOT EXISTS Score (
    id SERIAL PRIMARY KEY,
    customerId BIGINT NOT NULL,
    corporateId BIGINT NOT NULL,
    key VARCHAR(255) NOT NULL,
    createdDate TIMESTAMP,
    lastUpdate TIMESTAMP,
    point BIGINT,
    scoreCondition VARCHAR(50),
    FOREIGN KEY (customerId) REFERENCES Customer(id),
    FOREIGN KEY (corporateId) REFERENCES Corporate(id)
);