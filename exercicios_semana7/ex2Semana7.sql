SELECT * FROM pessoa ORDER BY nome ASC;

--CREATE
CREATE table pessoa (
	pk_id_pessoa serial PRIMARY KEY UNIQUE,
	nome VARCHAR(500) NOT NULL,
	telefone VARCHAR(16),
	dataNascimento DATE NOT NULL,
	cpf VARCHAR(11) NOT NULL UNIQUE
);

CREATE TABLE funcionario (
	pk_id_funcionario SERIAL PRIMARY KEY UNIQUE,
	matricula VARCHAR(45),
	salario FLOAT8,
	fk_id_pessoa INT NOT NULL,
	FOREIGN KEY(fk_id_pessoa) REFERENCES pessoa(pk_id_pessoa)
);

--ALTER
ALTER TABLE pessoa
ADD COLUMN dataCadastro DATE;

ALTER TABLE funcionario DROP COLUMN  matricula;

ALTER TABLE funcionario
ADD COLUMN matricula VARCHAR(50);

--DROP

DROP TABLE pessoa;
DROP TABLE funcionario;

SELECT * FROM pessoa;
SELECT * FROM funcionario;




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	