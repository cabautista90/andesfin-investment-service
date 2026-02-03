INSERT INTO investment_simulations
(id, initial_amount, interest_rate, months, final_amount, created_at)
VALUES
(UUID(), 1000.00, 0.05, 12, 1600.00, NOW()),
(UUID(), 2000.00, 0.07, 24, 3360.00, NOW());

INSERT INTO usuarios (id, nombre, email, capital_disponible) VALUES
(UUID(), 'Juan Pérez', 'juan.perez@email.com', 5000.00),
(UUID(), 'María García', 'maria.garcia@email.com', 8000.00);

INSERT INTO productos (nombre, tasa_interes, activo) VALUES
('Inversión Conservadora', 5.00, true),
('Inversión Moderada', 8.50, true),
('Inversión Riesgosa', 12.00, false);
