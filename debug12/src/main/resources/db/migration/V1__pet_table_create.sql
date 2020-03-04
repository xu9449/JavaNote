CREATE TABLE pet (
    /*id                INTEGER NOT NULL default nextval('department_id_seq'), */
    id                SERIAL NOT NULL,
    name              VARCHAR(30) not null unique,
    breed             VARCHAR(30),
    age               VARCHAR(30),
    shelter           VARCHAR(100),
    description       VARCHAR(150),
    adoptdate         date default CURRENT_DATE
);