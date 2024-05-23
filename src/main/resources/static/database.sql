CREATE TABLE car (
    car_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    brand VARCHAR(100),
    model VARCHAR(100),
    price DECIMAL(10, 2),
    color VARCHAR(50),
    motor_type VARCHAR(100),
    power INT,
    place_number INT,
    status ENUM('Pinned', 'Not Pinned'),
    type VARCHAR(100)
);

CREATE TABLE image (
    image_id INT AUTO_INCREMENT PRIMARY KEY,
    car_id INT REFERENCES car(Car_id),
    url VARCHAR(250) NOT NULL,
);

CREATE TABLE appointment (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    car_id INT REFERENCES car(car_id),
    name VARCHAR(255),
    first_name VARCHAR(255),
    email VARCHAR(255),
    message TEXT,
    contact VARCHAR(100),
    appointment_date DATETIME,
    status ENUM('pending', 'validated', 'rejected', 'archived'),
);

CREATE TABLE users (
    user_id UUID  AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);
