CREATE TABLE IF NOT EXISTS corporate_configuration (
    id SERIAL PRIMARY KEY,
    corporateId BIGINT NOT NULL,
    monthlyExpirationDate INTEGER,
    minimum BOOLEAN,
    maximum BOOLEAN,
    valueMin INTEGER,
    valueMax INTEGER,
    sendEmail BOOLEAN,
    sendWhatsapp BOOLEAN,
    discountMax INTEGER,
    typeScores VARCHAR(1000),
    socialNetworks VARCHAR(1000),
    corporateModel VARCHAR(1000),
    integrations VARCHAR(1000)
    FOREIGN KEY (corporateId) REFERENCES corporate(id)
);