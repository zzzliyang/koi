IF OBJECT_ID ('dbo.user_roles') IS NOT NULL
	DROP TABLE dbo.user_roles
GO

CREATE TABLE dbo.user_roles
	(
	id      BIGINT IDENTITY NOT NULL,
	user_id BIGINT NOT NULL,
	role_id BIGINT NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL,
	CONSTRAINT PK_user_role PRIMARY KEY (user_id, role_id)
	)
GO

GRANT SELECT, INSERT, UPDATE, DELETE ON user_roles TO koi

INSERT INTO user_roles (user_id, role_id, create_time, update_time)
VALUES (1, 1, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)

INSERT INTO user_roles (user_id, role_id, create_time, update_time)
VALUES (1, 2, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)

INSERT INTO user_roles (user_id, role_id, create_time, update_time)
VALUES (2, 1, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP)
