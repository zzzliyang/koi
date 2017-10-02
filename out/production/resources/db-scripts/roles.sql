IF OBJECT_ID ('dbo.roles') IS NOT NULL
	DROP TABLE dbo.roles
GO

CREATE TABLE dbo.roles
	(
	id          BIGINT IDENTITY NOT NULL,
	role        VARCHAR (45) NOT NULL,
	description VARCHAR (225) NULL,
	create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL,
	PRIMARY KEY (role)
	)
GO

GRANT SELECT, INSERT, UPDATE, DELETE ON roles TO koi

INSERT INTO roles (role, create_time, update_time)
VALUES ('USER', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)

INSERT INTO roles (role, create_time, update_time)
VALUES ('ADMIN', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)

