INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('craigy', 'Craig', 'Johnston', '12345678911', '123456789', 0, 'icons/1.png');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('mj', 'Mihai', 'Johnston', '123456711', '1456789', 0, 'icons/1.png');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('maxineyo', 'Maxine', 'Johnston', '123456711', '1456789', 5, 'icons/3.png');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('mike','Michael', 'Ahari', '12345678911', '123456789', 3.4, 'icons/5.jpg');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('js_guy', 'John', 'Smith', '12345678911', '123456789', 4.1, 'icons/4.png');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('MrJoeBloggs','Joe', 'Bloggs', '12345678911', '123456789', 0, 'icons/2.png');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('rawker', 'Rares', 'Johnston', '123456711', '1456789', 0, 'icons/1.png');

INSERT INTO jobs(title, description, remuneration, job_owner, likes, expected_duration, categories, charities)
VALUES ('Gardening', 'Need a gardener to help with clear out of my overgrown backyard', '£10 per hour', 1, 3, 2, 'gardening, manual labour', 'urban roots');

INSERT INTO jobs(title, description, remuneration, job_owner, likes, expected_duration, categories, charities)
VALUES ('Painting', 'Painting the new community centre', '£100 for the whole job', 2, 0, 1, 'Decorating','Red Cross');

INSERT INTO jobs(title, description, remuneration, job_owner, likes, expected_duration, categories, charities)
VALUES ('Cleaning', 'Cleaner wanted for the holidays', '£20 per day', 3, 1,5, 'Housework', 'Oxfam');

INSERT INTO jobs(title, description, remuneration, job_owner, likes, expected_duration, categories, charities)
            VALUES ('His homework', '1 day job', '5 pounds', 1, 6, 4, 'Schoolwork','charity');

INSERT INTO jobs(title, description, remuneration, job_owner, likes, expected_duration, categories, charities)
            VALUES ('Gardening', '1 day job', '5 pounds', 2, 10, 3, 'Gardening','Gardening4Us');

INSERT INTO job_assignments(job_id, factotum, complete, rating)
            VALUES (0, 4, True, 5);

INSERT INTO job_assignments(job_id, factotum, complete, rating)
            VALUES (1, 2, True, 5);

INSERT INTO job_assignments(job_id, factotum, complete, rating)
VALUES (2, 3, False, 0);
