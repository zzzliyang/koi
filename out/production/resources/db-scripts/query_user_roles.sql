SELECT u.username,
       r.role
FROM users u
INNER JOIN user_roles ur
    ON u.id = ur.user_id
INNER JOIN roles r
    ON ur.role_id = r.id
WHERE u.username = 'yuzu'

