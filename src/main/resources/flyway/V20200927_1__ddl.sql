 create table fond (
id serial PRIMARY KEY ,
fond_number varchar (255),
created_timestamp int,
created_by int,
updated_timestamp int,
updated_by int
);


create table temp_files (
id serial PRIMARY KEY ,
file_binary int,
file_binary_byte bytea
);

create table company (
id serial PRIMARY KEY ,
name_ru varchar (128),
name_kz varchar (128),
name_en varchar (128),
bin varchar (32),
parent_id int,
fond_id int,
created_timestamp int,
created_by int,
updated_timestamp int,
updated_by int
);
create table company_unit (
id serial PRIMARY KEY ,
name_ru varchar (128),
name_kz varchar (128),
name_en varchar (128),
parent_id int,
year int,
company_id int,
code_index varchar (16),
created_timestamp int,
created_by int,
updated_timestamp int,
updated_by int
);
create table users (
id serial PRIMARY KEY ,
auth_id int,
name varchar(128),
full_name varchar(128),
surname varchar(128),
second_name varchar(128),
status varchar(128),
company_unit_id int,
password varchar(128),
last_login_timestamp int,
iin varchar (32),
is_active boolean,
is_activated boolean,
created_timestamp int,
created_by int,
updated_timestamp int,
updated_by int
);

create table authorizations (
id serial PRIMARY KEY ,
username varchar (255),
email varchar (255),
password varchar (128),
role varchar(255),
forgot_password_key varchar(128),
forgot_password_key_timestamp int,
company_unit_id int
);

create table record (
id serial PRIMARY KEY ,
number varchar (128),
type varchar (128),
company_unit_id int,
created_timestamp int,
created_by int,
updated_timestamp int,
updated_by int
);

 create table case_index (
id serial PRIMARY KEY ,
 case_index varchar (128),
 title_ru varchar (128),
 title_kz varchar (128),
 title_en varchar (128),
 storage_type int,
 storage_year int,
 note varchar (128),
 company_unit_id int,
 nomenclature_id int,
created_timestamp int,
created_by int,
updated_timestamp int,
updated_by int
 );

 create table nomenclature (
id serial PRIMARY KEY ,
 nomenclature_number varchar (128),
 year int,
 nomenclature_summary_id int,
 company_unit_id int,
 created_timestamp int,
 created_by int,
 updated_timestamp int,
 updated_by int
 );

 create table cases (
id serial PRIMARY KEY ,
 case_number varchar (128),
 tom_number varchar (128),
 title_ru varchar (128),
 title_kz varchar (128),
 title_en varchar (128),
 start_timestamp int,
 final_timestamp int,
 page_count int,
 eds_signed boolean,
 eds_signature text,
 naf_sent boolean,
 is_deleted boolean,
 is_limited boolean,
 hash varchar (128),
 version int,
 version_id varchar (128),
 is_active boolean,
 note varchar (128),
 location_id int,
 case_index_id int,
 record_id int,
 remove_id int,
 company_unit_id int,
 case_address_blockchain varchar (128),
 add_blockchain_timestamp int,
 created_timestamp int,
 created_by int,
 updated_timestamp int,
 updated_by int
 );

 create table request (
id serial PRIMARY KEY , request_user_id int,
 response_user_id int,
 case_id int,
 case_index_id int,
 created_type varchar (128),
 comment varchar (128),
 status varchar (128),
 timestamp int,
 share_start int,
 share_finish int,
 favourite boolean,
 update_timestamp int,
 update_by int,
 decline_note varchar (128),
 company_unit_id int,
 from_request_id int
 );
  create table catalog_case (
id serial PRIMARY KEY ,
  case_id int,
  catalog_id int,
  company_unit_id int,
  created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int
  );

  create table request_status (
id serial PRIMARY KEY ,
  request_id int,
  status varchar(64),
  created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int
  );

  create table share (
id serial PRIMARY KEY ,
  request_id int,
  note varchar (255),
  sender_id int,
  receiver_id int,
  share_timestamp int
  );

  create table catalog (
id serial PRIMARY KEY ,
  name_ru varchar (128),
  name_kz varchar (128),
  name_en varchar (128),
  parent_id int,
  company_unit_id int,
  created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int
  );

  create table activity_journal (
id serial PRIMARY KEY ,
  event_type varchar (128),
  object_type varchar (255),
  object_id int,
  created_timestamp int,
  created_by int,
  message_level varchar (128),
  message varchar (255)
  );

  create table location (
id serial PRIMARY KEY ,
  row varchar (64),
  line varchar (64),
  columns varchar (64),
  box varchar (64),
  company_unit_id int,
  created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int
  );

create table notification(
id serial PRIMARY KEY ,
  object_type varchar (128),
  object_id int,
  company_unit_id int,
  user_id int,
  created_timestamp int,
  viewed_timestamp int,
  is_viewed boolean,
  title varchar (255),
  text varchar (255),
  company_id int
  );

  create table file_routing (
id serial PRIMARY KEY ,
  file_id int,
  table_name varchar (128),
  table_id int,
  type varchar (128)
  );

  create table file (
id serial PRIMARY KEY ,
  name varchar (128),
  type varchar (128),
  size int,
  page_count int,
  hash varchar (128),
  is_deleted boolean,
  file_binary_id int,
  created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int
  );

   create table search_key (
id serial PRIMARY KEY ,
   name  varchar (128),
   company_unit_id int,
   created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int
   );

   create table search_key_routing (
id serial PRIMARY KEY ,
   search_key_id int,
   table_name varchar (128),
  table_id int,
  type varchar (128)
   );

   create table remove_act (
id serial PRIMARY KEY ,
   act_number varchar (128),
   description varchar (256),
   company_unit_id int,
   created_timestamp int,
  created_by int,
  updated_timestamp int,
  updated_by int

   );