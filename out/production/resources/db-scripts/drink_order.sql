
IF OBJECT_ID('drink_order') IS NOT NULL
  DROP TABLE drink_order

CREATE TABLE drink_order (
    id BIGINT IDENTITY(1,1) NOT NULL,
    customer_id BIGINT NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL
)


GRANT SELECT, INSERT, UPDATE, DELETE ON drink_order TO koi

