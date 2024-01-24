CREATE TABLE customers
(
    cust_id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cust_name VARCHAR(255) NOT NULL,
    cust_tel_number INT NOT NULL
);

CREATE TABLE dish
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(45),
    description VARCHAR(45),
    rating DOUBLE(9,2),
    published TINYINT(4),
    created DATE,
    icon LONGBLOB
);

CREATE TABLE marks
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    mark VARCHAR(20)
);