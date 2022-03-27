use boot;

create table `user`(
                       id int(10) not null auto_increment primary key comment '用户id',
                       username varchar(15) not null comment '用户名',
                       password varchar(20) not null comment '密码'
)engine = innodb default charset=utf8;
insert into `boot`.user (id, username, password, admin) VALUES (1476378219, '姜涵文', 'Justholdway521');