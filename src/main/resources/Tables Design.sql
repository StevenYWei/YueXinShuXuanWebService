SET FOREIGN_KEY_CHECKS=0;

-- Create book category code look up table
DROP TABLE IF EXISTS book_category_cd_lk;
CREATE TABLE book_category_cd_lk (
    category_cd varchar(30) primary key,
    code_desc varchar(100)
);

-- Create book table
DROP TABLE IF EXISTS book;
CREATE TABLE book (
    book_id int auto_increment primary key,
    category_cd varchar(30),
    book_name varchar(100),
    book_time date,
    author varchar(30),
    book_desc varchar(1000),
    price double,
    pic blob,
    foreign key (category_cd)
        references book_category_cd_lk (category_cd)
        on delete set null on update cascade
);

-- --------------------------------------------------------


-- Create user code lookup table
DROP TABLE IF EXISTS user_cd_lk;
CREATE TABLE user_cd_lk (
    user_cd varchar(10) primary key,
    code_desc varchar(100)
);

-- Create users table
DROP TABLE IF EXISTS users;
CREATE TABLE users (
    user_id int auto_increment primary key,
    user_nm varchar(20) not null unique,
    user_pw varchar(50) not null,
    user_cd varchar(10),
    active_fl varchar(1),
    first_nm varchar(30),
    middle_nm varchar(10),
    last_nm varchar(50),
    email_addr varchar(30),
    phone_nb varchar(20),
    dob date,
    addr1 varchar(30),
    addr2 varchar(30),
    city varchar(30),
    state varchar(30),
    country varchar(50),
    zip varchar(10),
    user_creat_dt timestamp,
    foreign key (user_cd)
        references user_cd_lk (user_cd)
        on delete set null on update cascade
);

-- ---------------------------------------------------------

-- Create shopping cart table
DROP TABLE IF EXISTS shpn_cart;
CREATE TABLE shpn_cart (
    shpn_cart_id int auto_increment primary key,
    user_id int,
    book_id int,
    count int,
    stts_cd varchar(15),
    foreign key (user_id)
        references users (user_id)
        on update cascade,
    foreign key (book_id)
        references book (book_id)
        on update cascade
);


-- ---------------------------------------------------------

-- Create items table
-- DROP TABLE IF EXISTS items;
-- CREATE TABLE items (
--     item_id int auto_increment primary key,
--     item_cd varchar(20),
--     item_desc varchar(100),
--     item_price double,
--     item_loc varchar(50)
-- );
-- 
-- describe items;

-- Create item code lookup table
-- DROP TABLE IF EXISTS item_cd_lk;
-- CREATE TusersABLE item_cd_lk (
--     item_cd varchar(10),
--     code_desc varchar(100)
-- );
-- 
-- describe item_cd_lk;

SET FOREIGN_KEY_CHECKS=1;

show tables;
insert into book_category_cd_lk values('HIST', 'Books related to history');
insert into book_category_cd_lk values('ORG', 'Books related to organization');

insert into user_cd_lk values('ADM','Administrator of the application'),('OPR','Operator of the application'),('MBR','Registered member of Yue Xin SHu Xuan'),('GST','Guest of the application'),('OTR','Other user type');

insert into users(user_nm, user_pw, user_cd, active_fl, first_nm, user_creat_dt) values('yuming','123','ADM','Y','Yuming',now());
insert into users(user_nm, user_pw, user_cd, active_fl, first_nm, user_creat_dt) values('ying','123','ADM','Y','Ying',now());

insert into book(category_cd, book_name, author, price) values('ORG', 'YueXinShuXuan', 'Yu Ying', 1000000000);
insert into book(category_cd, book_name, author, price) values('HIST', 'YueXinShuXuanHIST', 'Yuming Wei', 1000000000);


-- ----- Util SQL ------

-- use yuexinshuxuan;
-- select  concat('private ', concat(column_type, concat(' ', concat(column_name, ';')))) from information_schema.columns where table_name='users'

-- SHOW ENGINE INNODB STATUS;

-- Select column as defition
-- select 
--     concat('private ',
--             concat(column_type,
--                     concat(' ', concat(column_name, ';')))) as definition
-- from
--     information_schema.columns
-- where
--     table_name = 'user_cd_lk';
