
create table cy_jqjc_data(
    id serial not null,
    time varchar(255) not null,
	address varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	detail varchar(255) not null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_jqjc_data is '警情监测';
comment on column cy_jqjc_data.id is '主键';
comment on column cy_jqjc_data.time is '时间';
comment on column cy_jqjc_data.address is '地址';
comment on column cy_jqjc_data.longitude is '经度';
comment on column cy_jqjc_data.latitude is '纬度';
comment on column cy_jqjc_data.detail is '突发事件描述';
comment on column cy_jqjc_data.rksj is '入库时间';
comment on column cy_jqjc_data.dt is '时间分区';



create table cy_cldwjgj_data(
    id serial not null,
    plateNumber varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	time varchar(255) default null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_cldwjgj_data is '车辆定为及轨迹数据';
comment on column cy_cldwjgj_data.id is '主键';
comment on column cy_cldwjgj_data.plateNumber is '车牌';
comment on column cy_cldwjgj_data.longitude is '经度';
comment on column cy_cldwjgj_data.latitude is '纬度';
comment on column cy_cldwjgj_data.time is '时间';
comment on column cy_cldwjgj_data.rksj is '入库时间';
comment on column cy_cldwjgj_data.dt is '时间分区';



create table cy_pcs_data(
    id serial not null,
    name varchar(255) not null,
	address varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	phone varchar(255) default  null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_pcs_data is '派出所';
comment on column cy_pcs_data.id is '主键';
comment on column cy_pcs_data.name is '派出所名称';
comment on column cy_pcs_data.longitude is '经度';
comment on column cy_pcs_data.latitude is '纬度';
comment on column cy_pcs_data.address is '地址';
comment on column cy_pcs_data.phone is '电话';
comment on column cy_pcs_data.rksj is '入库时间';
comment on column cy_pcs_data.dt is '时间分区';




create table cy_xfll_data(
    id serial not null,
    name varchar(255) not null,
	address varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	phone varchar(255) default  null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_xfll_data is '消防队';
comment on column cy_xfll_data.id is '主键';
comment on column cy_xfll_data.name is '消防队名称';
comment on column cy_xfll_data.longitude is '经度';
comment on column cy_xfll_data.latitude is '纬度';
comment on column cy_xfll_data.latitude is '纬度';
comment on column cy_xfll_data.phone is '电话';
comment on column cy_xfll_data.rksj is '入库时间';
comment on column cy_xfll_data.dt is '时间分区';





create table cy_yy_data(
    id serial not null,
    name varchar(255) not null,
	level varchar(255) not null,
	address varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	phone varchar(255) not null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_yy_data is '医院';
comment on column cy_yy_data.id is '主键';
comment on column cy_yy_data.name is '医院名称';
comment on column cy_yy_data.longitude is '经度';
comment on column cy_yy_data.latitude is '纬度';
comment on column cy_yy_data.address is '地址';
comment on column cy_yy_data.phone is '电话';
comment on column cy_yy_data.rksj is '入库时间';
comment on column cy_xfll_data.dt is '时间分区';





create table cy_hgjy_data(
    id serial not null,
    name varchar(255) not null,
	address varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	phone varchar(255) not null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_hgjy_data is '化工救援力量';
comment on column cy_hgjy_data.id is '主键';
comment on column cy_hgjy_data.name is '化工救援名称';
comment on column cy_hgjy_data.longitude is '经度';
comment on column cy_hgjy_data.latitude is '纬度';
comment on column cy_hgjy_data.address is '地址';
comment on column cy_hgjy_data.phone is '电话';
comment on column cy_hgjy_data.rksj is '入库时间';
comment on column cy_hgjy_data.dt is '时间分区';



create table cy_shyjjy_data(
    id serial not null,
    name varchar(255) not null,
	address varchar(255) not null,
	longitude varchar(255) not null,
	latitude varchar(255) not null,
	phone varchar(255) not null,
	organization varchar(255) not null,
	rksj varchar(255) default null,
	dt varchar(255) default null,
	primary key (id)
);
comment on table cy_shyjjy_data is '社会应急救援力量';
comment on column cy_shyjjy_data.id is '主键';
comment on column cy_shyjjy_data.name is '名称';
comment on column cy_shyjjy_data.longitude is '经度';
comment on column cy_shyjjy_data.latitude is '纬度';
comment on column cy_shyjjy_data.address is '地址';
comment on column cy_shyjjy_data.phone is '电话';
comment on column cy_shyjjy_data.organization is '所属单位/部门';
comment on column cy_shyjjy_data.rksj is '入库时间';
comment on column cy_shyjjy_data.dt is '时间分区';