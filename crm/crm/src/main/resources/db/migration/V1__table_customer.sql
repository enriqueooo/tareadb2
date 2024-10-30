CREATE TABLE IF NOT EXISTS customer(
    id SERIAL,
    full_name VARCHAR(255) NOT NULL,
    adress VARCHAR(255),
    email VARCHAR(255),
    age INT,
    PRIMARY KEY (id)
);