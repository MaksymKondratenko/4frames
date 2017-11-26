CREATE table Employees (
    id NUMBER PRIMARY KEY,
    firstName VARCHAR,
    lastName VARCHAR,
    position VARCHAR,
    project NUMBER
);

CREATE table Projects (
    id NUMBER PRIMARY KEY,
    title VARCHAR
);

CREATE table Links (
    id NUMBER PRIMARY KEY,
    name VARCHAR,
    text VARCHAR,
    link VARCHAR
);

CREATE table Content (
    id NUMBER PRIMARY KEY,
    name VARCHAR,
    content VARCHAR
);

CREATE table Frames (
    id NUMBER PRIMARY KEY,
    name VARCHAR
);

