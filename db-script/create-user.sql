DROP table demo_user;
create table DEMO_USER (id bigint not null, 
                   cell_phone varchar(255), 
                   email_address varchar(255), 
                   first_name varchar(255), 
                   home_phone varchar(255), 
                   last_name varchar(255), 
                   primary key (id));
                   
CREATE SEQUENCE DEMO_USER_SEQ START 1;

commit;