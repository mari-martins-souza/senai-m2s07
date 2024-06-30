CREATE TABLE Funcionario (
    funcionario_id BIGINT PRIMARY KEY,
    matricula VARCHAR(255),
    tempo_de_experiencia INT,
    endereco_id BIGINT
);

CREATE TABLE Nutricionista (
    nutricionista_id BIGINT PRIMARY KEY,
    matricula VARCHAR(255),
    tempo_de_experiencia INT,
    endereco_id BIGINT,
    crn VARCHAR(255),
    especialidade VARCHAR(255)
);

CREATE TABLE Paciente (
    paciente_id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    data_de_nascimento DATE,
    cpf VARCHAR(255),
    telefone VARCHAR(255),
    email VARCHAR(255),
    endereco_id BIGINT
);

CREATE TABLE Consulta (
    consulta_id BIGINT PRIMARY KEY,
    nutricionista_id BIGINT,
    paciente_id BIGINT,
    data_da_consulta DATE,
    observacoes VARCHAR(255)
);

CREATE TABLE Endereco (
    endereco_id BIGINT PRIMARY KEY,
    logradouro VARCHAR(255),
    estado VARCHAR(255),
    cidade VARCHAR(255),
    numero VARCHAR(255),
    cep VARCHAR(255)
);

INSERT INTO Endereco (endereco_id, logradouro, estado, cidade, numero, cep) VALUES
(1, 'Rua das Flores', 'Santa Catarina', 'Palhoça', '123', '88101-500'),
(2, 'Avenida do Sol', 'Santa Catarina', 'São José', '456', '88101-600'),
(3, 'Travessa da Lua', 'Santa Catarina', 'Florianópolis', '789', '88101-700');

INSERT INTO Funcionario (funcionario_id, matricula, tempo_de_experiencia, endereco_id) VALUES
(1, 'F123', 5, 1),
(2, 'F456', 3, 2),
(3, 'F789', 7, 3);

INSERT INTO Nutricionista (nutricionista_id, matricula, tempo_de_experiencia, endereco_id, crn, especialidade) VALUES
(1, 'N123', 5, 1, 'CRN1', 'Esportiva'),
(2, 'N456', 3, 2, 'CRN2', 'Pediátrica'),
(3, 'N789', 7, 3, 'CRN3', 'Clínica');

INSERT INTO Paciente (paciente_id, nome, data_de_nascimento, cpf, telefone, email, endereco_id) VALUES
(1, 'João Silva', '1980-01-01', '111.111.111-11', '(48) 91234-5678', 'joao.silva@email.com', 1),
(2, 'Maria Santos', '1990-02-02', '222.222.222-22', '(48) 92345-6789', 'maria.santos@email.com', 2),
(3, 'Paulo Rocha', '2000-03-03', '333.333.333-33', '(48) 93456-7890', 'paulo.rocha@email.com', 3);

INSERT INTO Consulta (consulta_id, nutricionista_id, paciente_id, data_da_consulta, observacoes) VALUES
(1, 1, 1, '2024-07-01', 'Primeira consulta'),
(2, 2, 2, '2024-07-02', 'Segunda consulta'),
(3, 3, 3, '2024-07-03', 'Terceira consulta');

UPDATE Paciente
SET telefone = '(47) 98888-7777'
WHERE paciente_id = 3;

SELECT * FROM Paciente
WHERE paciente_id = 3;

DELETE FROM Paciente
WHERE paciente_id = 1;

SELECT * FROM Paciente;


