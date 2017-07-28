INSERT INTO users (user_id, first_name, last_name, mobile_number, card_number, user_rating)
           VALUES (1, 'Craig', 'Johnston', '12345678911', '123456789', 4);
     
INSERT INTO users (user_id, first_name, last_name, mobile_number, card_number, user_rating)
           VALUES (2, 'Mihai', 'Johnston', '123456711', '1456789', 3.5);

INSERT INTO jobs(job_id, title, description, remuneration, job_owner)
            VALUES (1, 'His homework', '1 day job', '5 pounds', 1)
            
INSERT INTO jobs(job_id, title, description, remuneration, job_owner)
            VALUES (2, 'Gardening', '1 day job', '5 pounds', 2)
            
INSERT INTO job_assignments(job_id, job_owner, factotum, complete, rating)
            VALUES (1, 1, 1, True, 5)
         
INSERT INTO job_assignments(job_id, job_owner, factotum, complete, rating)
            VALUES (2, 2, 2, True, 5)
