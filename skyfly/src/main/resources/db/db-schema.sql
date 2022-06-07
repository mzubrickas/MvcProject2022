DROP TABLE IF EXISTS PRODUCT;

CREATE TABLE PRODUCT (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_id UUID NOT NULL,
    origin VARCHAR(20) NOT NULL,
    destination VARCHAR(20) NOT NULL,
    departureDate VARCHAR(20) NOT NULL,
    returnDate VARCHAR(20) NOT NULL,
    travelClass VARCHAR(20) NOT NULL,
    adults INT NOT NULL,
    children INT NOT NULL,
    infants INT NOT NULL
);
