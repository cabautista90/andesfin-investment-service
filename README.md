# Andesfin Investment Service

Microservicio desarrollado con **Spring Boot** para la simulación de inversiones financieras.

## 🛠️ Tecnologías utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- Maven

## 📌 Endpoints disponibles

### 🔹 GET /usuarios
Lista todos los usuarios registrados.

**Ejemplo de respuesta:**
```json
[
  {
    "id": "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
    "nombre": "Juan Pérez",
    "email": "juan.perez@email.com",
    "capitalDisponible": 5000.00
  }
]
🔹 POST /simulaciones
Realiza una simulación de inversión basada en el capital disponible y los productos.

Ejemplo de request:

{
  "usuario_id": "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
  "capital_disponible": 3000.00,
  "productos": [
    {
      "nombre": "Fondo Acciones Tech",
      "precio": 1000.00,
      "porcentaje_ganancia": 8.5
    }
  ]
}
🔹 GET /simulaciones/{usuarioId}
Lista las simulaciones realizadas por un usuario.

▶️ Ejecución del proyecto
mvn spring-boot:run
El servicio se levanta por defecto en:

http://localhost:8083
👤 Autor
Carlos Augusto Bautista Díaz

