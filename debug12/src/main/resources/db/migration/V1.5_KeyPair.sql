Alter table pet
Add constraint pet_pk PRIMARY KEY (id);

Alter table shelter
Add constraint shelter_pk PRIMARY KEY (id);

Alter table adopter
Add constraint adopter_pk PRIMARY KEY (id);

Alter table pet
    add constraint shelter_pk FOREIGN KEY (shelter)
        REFERENCES pet(id);

