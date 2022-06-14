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
INSERT INTO beer VALUES (1,'Корона','бутылка',0.5,'светлое',4.6,120,400);
INSERT INTO beer VALUES (2,'2Корона','2бутылка',0.5,'3светлое',4.6,120,400);
INSERT INTO beer VALUES (3,'3Корона','3бутылка',0.5,'2светлое',4.6,120,400);