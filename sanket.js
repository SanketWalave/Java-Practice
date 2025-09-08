let a=[1,2,3,4]; console.log(a);console.log("this is string")
console.log("this is string")
console.log("this is string")




 create table customer (customer_id int(10)primary key auto_increment,customer_Name varchar(100),customer_email varchar(100),phone varchar(20),registor_no date);
 
 create table product(product_id int(10)primary key auto_increment,product_name varchar(100),catagory varchar(100),price int(10),stock_quantity int(10),suplire_id int(10));
 
 create table suplire (suplire_id int primary key auto_increment,suplire_name varchar(100),suplire_number varchar(20),city varchar(100));
 
  create table orders(order_id int primary key auto_increment,customer_id int(10),foreign key(customer_id)references customer(customer_id)on delete set null on update cascade,order_date date ,total_amount decimal(10, 2));
  