CREATE TABLE users (
  user_id INTEGER PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  mobile_number CHAR(11),
  card_number VARCHAR(12),
  user_rating FLOAT);

CREATE TABLE jobs (
  job_id INTEGER PRIMARY KEY,
  title VARCHAR(50),
  description VARCHAR(250),
  remuneration VARCHAR(100),
  job_owner INTEGER,
  FOREIGN KEY (job_owner) REFERENCES users(user_id));

CREATE TABLE job_assignments(
  job_id INTEGER,
  job_owner INTEGER,
  factotum INTEGER,
  complete BOOLEAN,
  rating INTEGER,
  FOREIGN KEY (job_owner) REFERENCES users(user_id),
  FOREIGN KEY (factotum) REFERENCES users(user_id),
  FOREIGN KEY (job_id) REFERENCES jobs(job_id));

