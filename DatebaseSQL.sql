CREATE DATABASE IF NOT exists Result;

USE results;

CREATE TABLE results (
		id int auto_increment not null, 
        teamname varchar(150), 
        avResult double, 
        tvResult double,
        exeResult double,
        sensorResult double,
        finalResult double);





