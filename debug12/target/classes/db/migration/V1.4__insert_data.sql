insert into pet (name, breed, age, shelter, description ) values
('Pepper', 'Domestic Short Hair', '18 months', '1', 'Room 100, 999 Washington Ave. Falls Church, VA'),
('Shadow', 'Domestic Short Hair', '2 years', '1', 'Room 101, 999 Washington Ave. Falls Church, VA'),
('Eva', 'Domestic Medium Hair', '3 years', '2', 'Room 102, 999 Washington Ave. Falls Church, VA'),
('Oki', 'Domestic Long Hair', '12 years', '1', 'Room 103, 999 Washington Ave. Falls Church, VA')
;
commit;

insert into shelter (name, tel, email, location, description, principle ) values
('falls church', '222-444-2213', 'xu9449@gmail.com', 'Room 100, 999 Washington Ave. Falls Church, VA', '1', 'Sean Xu' ),
('Silver Spring', '222-444-2213', 'xu9449@gmail.com', 'Room 101, 999 Washington Ave. Falls Church, VA', '2', 'Nancy Chen'),
('Crystal City', '222-444-2213', 'xu9449@gmail.com', 'Room 102, 999 Washington Ave. Falls Church, VA', '4', 'Eric Liu'),
('Friendship Height', '222-444-2213', 'xu9449@gmail.com', 'Room 103, 999 Washington Ave. Falls Church, VA', '6', 'Fan')
;
commit;

insert into adopter (name, tel, email, location, description, pet_id ) values
('falls church', '222-444-2213', 'xu9449@gmail.com', 'Room 100, 999 Washington Ave. Falls Church, VA', '1', '2' ),
('Silver Spring', '222-444-2213', 'xu9449@gmail.com', 'Room 101, 999 Washington Ave. Falls Church, VA', '2', '3'),
('Crystal City', '222-444-2213', 'xu9449@gmail.com', 'Room 102, 999 Washington Ave. Falls Church, VA', '4', '1'),
('Friendship Height', '222-444-2213', 'xu9449@gmail.com', 'Room 103, 999 Washington Ave. Falls Church, VA', '6', '4')
;
commit;