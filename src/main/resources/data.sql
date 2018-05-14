DROP TABLE IF EXISTS PUBLIC.users;
CREATE TABLE PUBLIC.users
(
  id        integer      not null,
  user_name VARCHAR(80)  not null,
  password  VARCHAR(200) not null,
  enabled BOOLEAN
);

DROP TABLE IF EXISTS PUBLIC.cities;
CREATE TABLE PUBLIC.cities
(
  id        integer      not null,
  city_name VARCHAR(100) not null
);

INSERT INTO PUBLIC.users
(id, user_name, password, enabled) VALUES
  (1, 'user', 'password', true);

INSERT INTO PUBLIC.cities
(id, city_name) VALUES
  (1, 'Абаза'),
  (2, 'Абакан'),
  (3, 'Алапаевск'),
  (4, 'Алатырь'),
  (5, 'Александров'),
  (6, 'Александровск'),
  (7, 'hooita')