DROP TABLE IF EXISTS books;

CREATE TABLE books
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    author   VARCHAR(250) NOT NULL,
    title    VARCHAR(250) NOT NULL,
    priceOld VARCHAR(250) DEFAULT NULL,
    price    VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS authors;
CREATE TABLE authors
(
    id         INT NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name  VARCHAR(50) NOT NULL
);