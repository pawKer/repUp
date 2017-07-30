INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('craigy', 'Craig', 'Johnston', '12345678911', '123456789', 4, '/path/to/something');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('mj', 'Mihai', 'Johnston', '123456711', '1456789', 3.5, '/path/to/photo');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('maxineyo', 'Maxine', 'Johnston', '123456711', '1456789', 5, 'path_to_photo');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('mike','Michael', 'Ahari', '12345678911', '123456789', 3.4, '/path/to/something');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('js_guy', 'John', 'Smith', '12345678911', '123456789', 4.1, 'path/to/something');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('MrJoeBloggs','Joe', 'Bloggs', '12345678911', '123456789', 3.8, 'path/to/something');

INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)
           VALUES ('rawker', 'Rares', 'Johnston', '123456711', '1456789', 3, 'path/to/photo');

INSERT INTO jobs(title, description, remuneration, job_owner, number_of_pending_applications, expected_duration)
VALUES ('Gardener', 'Need a gardener to help with clear out of my overgrown backyard', '£10 per hour', 1, 3, 2);

INSERT INTO jobs(title, description, remuneration, job_owner, number_of_pending_applications, expected_duration)
VALUES ('Painter', 'Painting the new community centre', '£100 for the whole job', 2, 0, 1);

INSERT INTO jobs(title, description, remuneration, job_owner, number_of_pending_applications, expected_duration)
VALUES ('Cleaning', 'Cleaner wanted for the holidays', '£20 per day', 3, 1,5);

INSERT INTO jobs(title, description, remuneration, job_owner, number_of_pending_applications, expected_duration)
            VALUES ('His homework', '1 day job', '5 pounds', 1, 6, 4)

INSERT INTO jobs(title, description, remuneration, job_owner, number_of_pending_applications, expected_duration)
            VALUES (2, 'Gardening', '1 day job', '5 pounds', 2, 10, 3)

INSERT INTO job_assignments(job_id, job_owner, factotum, complete, rating)
            VALUES (1, 1, 1, True, 5)

INSERT INTO job_assignments(job_id, job_owner, factotum, complete, rating)
            VALUES (2, 2, 2, True, 5)

INSERT INTO job_assignments(job_id, job_owner, factotum, complete, rating)
            VALUES (3, 4, 1, False, 0)
