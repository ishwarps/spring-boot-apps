create table BUSINESS_UNIT
(
   BUSINESS_UNIT_ID integer not null AUTO_INCREMENT,
   UNIT_NAME varchar(255) not null,
   UNIT_DESC varchar(255) not null,
   primary key(BUSINESS_UNIT_ID)
);

INSERT INTO BUSINESS_UNIT (BUSINESS_UNIT_ID, UNIT_NAME, UNIT_DESC) VALUES
  (12, 'Dangote', 'Billionaire Industrialist'),
  (13, 'Gates', 'Billionaire Tech Entrepreneur'),
  (14, 'Alakija', 'Billionaire Oil Magnate');