CREATE SEQUENCE ALIMENTOS_SEQ;

CREATE TABLE alimentos (
    id NUMERIC DEFAULT ALIMENTOS_SEQ.NEXTVAL NOT NULL ,
    nome VARCHAR(50) NOT NULL,
    grupo_alimentar VARCHAR(50),
    calorias DECIMAL(5),
    proteina DECIMAL(5),
    carboidratos DECIMAL(5),
    gordura DECIMAL(5),
    PRIMARY KEY ('ID')
);
CREATE TABLE 