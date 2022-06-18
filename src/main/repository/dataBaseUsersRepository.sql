-- Table: users
CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    username VARCHAR(255) NOT NULL ,
    password VARCHAR(255) NOT NULL ,
    gmail VARCHAR(255) NOT NULL,
    token VARCHAR(255) NOT NULL
)
ENGINE = innoDB;
-- Table roles
CREATE TABLE roles(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(255) NOT NULL
)
ENGINE = innoDB;
-- Table for mapping user and roles: user_roles
CREATE TABLE user_roles(
user_id INT NOT NULL ,
role_id INT NOT NULL ,
FOREIGN KEY (user_id) REFERENCES users(id),
FOREIGN KEY (role_id) REFERENCES roles(id),
UNIQUE (user_id,role_id)
)
ENGINE = InnoDB;
-- Insert data
INSERT INTO users VALUES (1,'vital','1337','vitaliysaydak@gmail.com','sdfasdfas');
INSERT INTO users VALUES (2,'vitaliy','228','vitaliysaydak2001@gmail.com','asdfasdf');
INSERT INTO roles VALUES (1,'ROLE_ADMIN');
INSERT INTO roles VALUES (2,'ROLE_USER');
INSERT INTO user_roles VALUES (1,1);
INSERT INTO user_roles VALUES (2,2);