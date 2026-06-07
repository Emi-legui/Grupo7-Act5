# Actividad 5: Automatización de Pruebas con JUnit 5 y Maven

Proyecto práctico desarrollado en Java para la materia **Desarrollo de Software**, enfocado en el diseño e implementación de una suite de pruebas unitarias robusta utilizando **JUnit 5** y la gestión de construcción mediante **Maven**.

---

Características del Proyecto

El proyecto simula el comportamiento de una calculadora básica y valida su correcto funcionamiento mediante diferentes enfoques de pruebas unitarias:

1. **Clase Base (`Calculadora`):** Implementación de operaciones matemáticas básicas (Suma, Resta, Multiplicación y División). Incluye control de errores mediante excepciones (`ArithmeticException`) para divisiones por cero.
2. **Ciclo de Vida (Caja Negra):** Control y seguimiento de los estados de ejecución de las pruebas utilizando las anotaciones `@BeforeAll`, `@BeforeEach`, `@AfterEach` y `@AfterAll` en `CalculadoraTest`.
3. **Validación de Excepciones (Caja Blanca):** Pruebas de caminos críticos enfocadas en el comportamiento del sistema ante ingresos inválidos mediante `assertThrows` en `DivisionTest`.
4. **Pruebas Parametrizadas:** Evaluación secuencial de escenarios dinámicos de suma con diferentes conjuntos de datos optimizados con `@ParameterizedTest` y `@CsvSource`.
5. **Agrupación de Pruebas (Suite):** Centralización de la ejecución detodos los árboles de prueba del proyecto en un único punto mediante `@Suite`.

---

 Tecnologías y Herramientas Utilizadas

* **Lenguaje:** Java 17 / 23
* **Gestor de Proyectos:** Maven
* **Framework de Pruebas:** JUnit 5 (Jupiter)
* **IDE:** NetBeans

---

 Instalación y Configuración

 Requisitos Previos
* Tener instalado el Java Development Kit (JDK 17 o superior).
* Tener configurado Apache Maven.

Pasos para clonar y compilar:
1. Clona el repositorio desde tu terminal o GitHub Desktop:
   ```bash
   git clone [https://github.com/Fede-/Grupo7-Act5.git](https://github.com/Fede-/Grupo7-Act5.git)

