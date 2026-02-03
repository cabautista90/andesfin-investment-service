CREATE TABLE IF NOT EXISTS investment_simulations (
    id CHAR(36) PRIMARY KEY,
    initial_amount DECIMAL(10,2),
    interest_rate DECIMAL(5,2),
    months INT,
    final_amount DECIMAL(10,2),
    created_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS usuarios (
    id CHAR(36) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    capital_disponible DECIMAL(10,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS productos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tasa_interes DECIMAL(5,2) NOT NULL,
    activo BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS simulaciones (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id VARCHAR(36) NOT NULL,
    producto_id BIGINT NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    rendimiento DECIMAL(10,2) NOT NULL,
    fecha DATETIME NOT NULL
);
