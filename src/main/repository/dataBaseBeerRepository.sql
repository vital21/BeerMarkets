--
--     private String nameBeer;
--     private String containerType;
--     private int volumeContainerBeer;
--     private String typeBeer;
--     private double percentageOfAlcoholBeer;
--     private int bitternessOfBeer;
--     private int  quantityOfBeer;
-- Table beer
CREATE TABLE beer (
                       id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                       nameBeer VARCHAR(255) NOT NULL ,
                       container_type VARCHAR(255) NOT NULL ,
                       volume_container_beer FLOAT NOT NULL ,
                       type_beer VARCHAR(255) NOT NULL ,
                       percentage_of_alcohol_beer FLOAT NOT NULL ,
                       bitterness_of_beer INT NOT NULL ,
                       quantity_of_beer INT NOT NULL

)
    ENGINE = innoDB;
INSERT INTO beer VALUES (1,'Andechser Vollbier Hell','бутылка',0.5,'эль',4.8,20,400);
INSERT INTO beer VALUES (2,'Andechser Spezial Hell ','бутылка',0.5,'эль',5.8,30,400);
INSERT INTO beer VALUES (3,'Andechser Bergbock Hell','бутылка',0.5,'эль',7.0,45,400);