-- Create pessoa table
CREATE TABLE public.pessoa (
 id_pessoa SERIAL NOT NULL PRIMARY KEY,
 nm_pessoa VARCHAR(256) NOT NULL,
 nr_documento VARCHAR(15),
 dt_nascimento TIMESTAMP(6) NOT NULL,
 in_sexo VARCHAR(1) NOT NULL,
 ds_email VARCHAR(150),
 in_ativo INT DEFAULT 1 NOT NULL
);


