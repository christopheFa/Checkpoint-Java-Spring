create database `carnet_voyages`;

CREATE USER 'usertravel'@'localhost' IDENTIFIED BY 'passwordtravel';

GRANT ALL privileges ON *.* TO 'usertravel'@'localhost';


use carnet_voyages;

INSERT INTO carnet_voyages.destination (id, country, date_end_travel, date_start_travel) VALUES (1, 'Allemagne', '2018-06-13', '2018-08-24');
INSERT INTO carnet_voyages.stage (id, city, date_of_travel_stage, resume_travel, destination_id) VALUES (1, 'Berlin', '2018-06-13', 'blablablablablabla', 1);
INSERT INTO carnet_voyages.stage (id, city, date_of_travel_stage, resume_travel, destination_id) VALUES (2, 'Munich', '2018-06-30', 'dsqdhfsns', 1);
INSERT INTO carnet_voyages.links (id, link, stage_id) VALUES (1, 'https://fr.wikipedia.org/wiki/Berlin', 1);
INSERT INTO carnet_voyages.links (id, link, stage_id) VALUES (2, 'https://fr.wikipedia.org/wiki/Munich', 2);