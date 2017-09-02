IF OBJECT_ID ('dbo.users') IS NOT NULL
	DROP TABLE dbo.users
GO

CREATE TABLE dbo.users
	(
	id       BIGINT IDENTITY NOT NULL,
	username VARCHAR (45) NOT NULL,
	password VARCHAR (45) NOT NULL,
	enabled  BIT DEFAULT ((1)) NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL,
	PRIMARY KEY (username)
	)
GO

GRANT SELECT, INSERT, UPDATE, DELETE ON users TO koi

INSERT INTO users (username, password, create_time, update_time)
VALUES ('yuzu', 'yuzu', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)

INSERT INTO users (username, password, create_time, update_time)
VALUES ('apple', 'apple', CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)

