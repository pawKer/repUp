CREATE TABLE users(
  user_id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  user_name VARCHAR(50),
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  mobile_number CHAR(11),
  card_number VARCHAR(12),
  user_rating FLOAT,
  path_to_profile_photo VARCHAR(50));

CREATE TABLE jobs(
  job_id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  title VARCHAR(50),
  description VARCHAR(250),
  date_posted DATETIME,
  remuneration VARCHAR(100),
  job_owner INTEGER,
  likes INTEGER,
  expected_duration INTEGER,
  categories VARCHAR(100),
  charities VARCHAR(100),
  FOREIGN KEY (job_owner) REFERENCES users(user_id));

CREATE TABLE job_assignments(
  job_id INTEGER,
  factotum INTEGER,
  complete BOOLEAN,
  rating INTEGER,
  FOREIGN KEY (factotum) REFERENCES users(user_id),
  FOREIGN KEY (job_id) REFERENCES jobs(job_id));

CREATE TABLE interests(
  user_id INTEGER,
  gardening BOOLEAN,
  plumbing BOOLEAN,
  electrician BOOLEAN,
  carwashing BOOLEAN,
  housework BOOLEAN,
  FOREIGN KEY (user_id) REFERENCES users(user_id));




