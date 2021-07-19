CREATE DATABASE hotel;
DROP DATABASE hotel;

USE hotel;
CREATE TABLE users (
		userId INTEGER AUTO_INCREMENT PRIMARY KEY,
        userName VARCHAR(30),
        userPassword VARCHAR(20),
        userKeyWord VARCHAR(15),
        isAdmin BOOL DEFAULT false
);
DROP TABLE users;
insert into users(userName, userPassword, userKeyWord, isAdmin) value ('admin', '12345', 'admin', true);
delete from users where userId='1';
select * from users;

CREATE TABLE hotelRoom (
	roomId INTEGER AUTO_INCREMENT PRIMARY KEY,
    roomCapacity INTEGER,
    roomClass VARCHAR(10),
    isFree BOOL DEFAULT false
);
DROP TABLE hotelRoom;

CREATE TABLE request (
	requestId INTEGER AUTO_INCREMENT PRIMARY KEY,
    idUser INTEGER,
    idRoom INTEGER,
    userTimeOfStay DATE,
    requestScore DECIMAL(10,5),
    FOREIGN KEY (idUser) REFERENCES users (userId),
    FOREIGN KEY (idRoom) REFERENCES hotelRoom (roomId)
);
DROP TABLE request;

CREATE TABLE blacklist (
	listId INTEGER AUTO_INCREMENT PRIMARY KEY,
	idUser INTEGER,
    isBlocked BOOL DEFAULT false,
    FOREIGN KEY (idUser) REFERENCES users (userId)
);
DROP TABLE blacklist;