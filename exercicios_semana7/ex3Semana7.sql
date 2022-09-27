SELECT * FROM pessoa ORDER BY nome ASC;
SELECT * FROM funcionario;

--INSERT IN THE TABLE PESSOA
INSERT INTO pessoa(nome, dataNascimento, telefone, cpf)
VALUES('ELL', '2022-09-09', '+55', '031');

INSERT INTO pessoa(nome, dataNascimento, telefone, cpf, dataCadastro)
VALUES('MANUZINHO', '2022-09-09', '+55', '041', '2022-10-01');

INSERT INTO pessoa(nome, dataNascimento, telefone, cpf, dataCadastro)
VALUES('Emanuel', '2022-09-09', '+55', '011', '2022-10-01');

--UPDATE
UPDATE pessoa
SET datanascimento = '28/10/2050' WHERE nome = 'ELL';

UPDATE pessoa
SET nome = 'Lopes' WHERE pk_id_pessoa = 5;

--DELETE
DELETE FROM pessoa
WHERE pk_id_pessoa = 1;

DELETE FROM pessoa
WHERE PK_id_pessoa = 5
RETURNING *;

--INSERT IN THE TABLE FUNCIONARIO

INSERT INTO funcionario(matricula, salario, fk_id_pessoa)
VALUES('ativa', 15000, 6);

INSERT INTO funcionario(matricula, salario, fk_id_pessoa)
VALUES('inativa', 10000, 7);

INSERT INTO funcionario(matricula, salario, fk_id_pessoa)
VALUES('ativa', 20000, 9);

--UPDATE
UPDATE funcionario
SET matricula = 'regular' WHERE pk_id_funcionario = 3;

UPDATE funcionario
SET matricula = 'irregular' WHERE pk_id_funcionario = 2;

--DELETE
DELETE FROM funcionario
WHERE PK_id_funcionario = 2
RETURNING *;

DELETE FROM funcionario
WHERE PK_id_funcionario = 3
RETURNING *;


ADD
































