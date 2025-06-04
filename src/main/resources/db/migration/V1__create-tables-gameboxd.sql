CREATE TABLE usuario (
id_usuario VARCHAR(36) NOT NULL PRIMARY KEY,
nome_completo VARCHAR(90) NOT NULL,
email VARCHAR(45) NOT null UNIQUE,
celular VARCHAR (20) NOT NULL,
senha VARCHAR(255) NOT NULL,
data_de_nascimento DATE,
foto_usuario VARCHAR(300),
nickname VARCHAR(45) NOT NULL UNIQUE,
created_at DATETIME,
updated_at DATETIME
);

CREATE TABLE jogos (
id_jogo INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome_do_jogo VARCHAR(100)NOT NULL,
desenvolvedores LONGTEXT,
ano_de_lancamento YEAR,
imagem_capa VARCHAR(300) NOT NULL,
duracao_media FLOAT,
descricao LONGTEXT,
created_at DATETIME,
updated_at DATETIME
);

CREATE TABLE genero (
id_genero INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
genero VARCHAR(50) NOT NULL,
created_at DATETIME,
updated_at DATETIME
);

CREATE TABLE genero_has_jogos (
id_jogo INT NOT NULL,
id_genero INT NOT NULL,
PRIMARY KEY (id_jogo, id_genero),
CONSTRAINT FK_GENERO_HAS_JOGOS_ID FOREIGN KEY (id_jogo) REFERENCES jogos(id_jogo),
CONSTRAINT FK_GENERO_HAS_JOGOS_ID FOREIGN KEY (id_genero) REFERENCES genero(id_genero)
);

CREATE TABLE avaliacao (
id_avaliacao INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nota INT NOT NULL,
resenha LONGTEXT,
recomendacao BOOLEAN NOT NULL,
id_jogo INT NOT NULL,
id_usuario VARCHAR(36) NOT NULL,
created_at DATETIME,
updated_at DATETIME,
CONSTRAINT FK_AVALIACAO_JOGOS FOREIGN KEY (id_jogo) REFERENCES jogos(id_jogo),
CONSTRAINT FK_USUARIO_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE favoritos (
id_usuario VARCHAR(36) NOT NULL,
id_jogo INT NOT NULL,
created_at DATETIME,
updated_at DATETIME,
PRIMARY KEY (id_usuario,id_jogo),
CONSTRAINT FK_FAVORITOS_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
CONSTRAINT FK_FAVORITOS_JOGOS FOREIGN KEY (id_jogo) REFERENCES jogos(id_jogo)
);

CREATE TABLE comentario (
id_comentario INT NOT AUTO_INCREMENT NULL PRIMARY KEY,
id_usuario VARCHAR(36) NOT NULL,
texto LONGTEXT,
created_at DATETIME,
updated_at DATETIME,
CONSTRAINT FK_COMENTARIO_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE curtidas (
id_comentario INT AUTO_INCREMENT NOT NULL,
id_usuario VARCHAR(36) NOT NULL,
created_at DATETIME,
updated_at DATETIME,
PRIMARY KEY (id_comentario, id_usuario),
CONSTRAINT FK_CURTIDAS_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
CONSTRAINT FK_CURTIDAS_COMENTARIO FOREIGN KEY (id_comentario) REFERENCES comentario(id_comentario)
);

CREATE TABLE notificacao (
id_notificacao INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
id_usuario VARCHAR(36) NOT NULL,
tipo ENUM ('comentario', 'curtida', 'seguimento', 'avaliacao')NOT NULL,
mensagem TINYTEXT,
lida TINYINT DEFAULT 0,
created_at DATETIME,
updated_at DATETIME,
CONSTRAINT FK_NOTIFICACAO_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
);

CREATE TABLE status_jogo (
id_status INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
status ENUM ('zerado', 'jogando', 'dropado', 'wishlist') NOT NULL,
id_jogo INT AUTO_INCREMENT NOT NULL,
id_usuario VARCHAR(36) NOT NULL,
created_at DATETIME,
updated_at DATETIME,
CONSTRAINT FK_STATUS_JOGO_JOGOS FOREIGN KEY (id_jogo) REFERENCES jogos(id_jogo),
CONSTRAINT FK_STATUS_JOGO_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE recuperacao_senha (
id_rec INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
id_usuario VARCHAR(36) NOT NULL,
token VARCHAR(100) NOT NULL UNIQUE,
usado TINYINT DEFAULT 0,
created_at DATETIME,
updated_at DATETIME,
CONSTRAINT FK_RECUPERACAO_SENHA_USUARIO FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE seguidores (
id_usuario_seguidor VARCHAR(36) NOT NULL,
id_usuario_seguindo VARCHAR(36) NOT NULL,
PRIMARY KEY(id_usuario_seguidor, id_usuario_seguindo),
created_at DATETIME,
updated_at DATETIME,
CONSTRAINT FK_SEGUIDORES_USUARIO FOREIGN KEY (id_usuario_seguidor) REFERENCES usuario(id_usuario) ON DELETE CASCADE,
CONSTRAINT FK_SEGUIDORES_USUARIO FOREIGN KEY (id_usuario_seguindo) REFERENCES usuario(id_usuario) ON DELETE CASCADE
);

CREATE TABLE administrador (
id_admin VARCHAR(36) NOT NULL PRIMARY KEY,
username VARCHAR(45) NOT NULL,
senha VARCHAR(255) NOT NULL,
first_login TINYINT DEFAULT 0,
created_at DATETIME,
updated_at DATETIME
);

