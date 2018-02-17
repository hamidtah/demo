DROP table demo_address;
create table DEMO_ADDRESS (id bigint not null,
						   USER_ID bigint not null,
                   		   STREET_NUMBER varchar(10), 
                   		   STREET_NAME varchar(50), 
						   CITY varchar(40), 
                   		   STATE varchar(15), 
                   		   ZIP varchar(10),
                   		   COUNTRY varchar(20),
                   		   primary key (id),
                   		   FOREIGN KEY (USER_ID) REFERENCES DEMO_USER (ID));
                   
CREATE SEQUENCE DEMO_ADDRESS_SEQ START 1;

commit;