# Duck Simulator

Simulador de Patos desarrollado en Java con Spring Boot. Permite crear diferentes tipos de patos, cada uno con comportamientos únicos de vuelo y sonido, y almacenarlos en una base de datos.

## Características
- Diferentes tipos de patos: Pato de Madera, Pato de Goma, Pato Mergo, Pato Buceador.
- Comportamientos de vuelo y sonido configurables (volar alto, no volar, graznido fuerte, sin graznido, etc).
- Persistencia de patos usando Spring Data JPA.
- Ejemplo de uso de patrones de diseño (Strategy, Repository).

## Tecnologías Utilizadas
- Java 17+
- Spring Boot
- Lombok
- Maven
- H2 Database (por defecto)

## Instalación
1. Clona el repositorio:
   ```bash
   git clone <URL-del-repositorio>
   ```
2. Accede al directorio del proyecto:
   ```bash
   cd duck-simulator
   ```
3. Compila y ejecuta la aplicación:
   ```bash
   ./mvnw spring-boot:run
   ```

## Uso
Al iniciar la aplicación, se crean y muestran diferentes tipos de patos en consola. Ejemplo:

```
- Soy un Pato de Madera, mi nombre es Martin. Solamente puedo flotar. -
* No Quack *
```

Puedes modificar `DuckSimulatorApplication.java` para crear más patos y probar diferentes comportamientos. Por ejemplo:

```java
Duck duckMartin = new WoodenDuck();
duckMartin.setName("Martin");
System.out.println(duckMartin.display());
System.out.println(duckMartin.performQuack());
System.out.println(duckMartin.performFly());
```

## Estructura del Proyecto
- `src/main/java/com/example/ducksimulator/model/`: Modelos de patos.
- `src/main/java/com/example/ducksimulator/behavior/`: Comportamientos de vuelo y sonido.
- `src/main/java/com/example/ducksimulator/repository/`: Repositorio para persistencia.
- `src/main/java/com/example/ducksimulator/DuckSimulatorApplication.java`: Clase principal.

## Contribuir
Las contribuciones son bienvenidas. Por favor, abre un issue o pull request para sugerencias o mejoras.

## Licencia
Este proyecto es solo para fines educativos.

