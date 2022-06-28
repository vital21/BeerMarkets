-- Table: users
CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    username VARCHAR(255) NOT NULL ,
    password VARCHAR(255) NOT NULL ,
    gmail VARCHAR(255) NOT NULL,
    token VARCHAR(255) NOT NULL
)
ENGINE = innoDB;

-- Table for mapping user and buy_beer: user_roles
CREATE TABLE user_buy(
user_id INT NOT NULL ,
beer_id INT NOT NULL ,
quantity INT NOT NULL ,
date DATE not null,

FOREIGN KEY (user_id) REFERENCES users(id),
FOREIGN KEY (beer_id) REFERENCES beer(id)
)
ENGINE = InnoDB;
