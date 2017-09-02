
IF OBJECT_ID('customer') IS NOT NULL
  DROP TABLE customer

CREATE TABLE customer (
    id BIGINT IDENTITY(1,1) NOT NULL,
    name varchar(255) NOT NULL,
    balance numeric(10,2) NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL
)


GRANT SELECT, INSERT, UPDATE, DELETE ON customer TO koi

