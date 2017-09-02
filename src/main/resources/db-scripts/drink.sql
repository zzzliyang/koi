
IF OBJECT_ID('drink') IS NOT NULL
  DROP TABLE drink

CREATE TABLE drink (
    id BIGINT IDENTITY(1,1) NOT NULL,
    order_id BIGINT NOT NULL,
    price NUMERIC(4,2) NOT NULL,
    drink_type varchar(255) NOT NULL,
    cup_size varchar(255) NOT NULL,
    suger_level varchar(255) NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL
)


GRANT SELECT, INSERT, UPDATE, DELETE ON drink TO koi

