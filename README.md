# Proyecto de Automatización de Compra

Este proyecto implementa la automatización de la compra de uno o varios artículos en un sitio web, asegurando que los datos del producto (nombre y precio) se mantengan consistentes a lo largo del flujo.

## Tecnologías utilizadas

- **Lenguaje:** Java
- **Frameworks:** Selenium WebDriver
- **Patrón de diseño:** Page Object Model (POM)
- **Gestor de dependencias:** Maven
- **Navegadores soportados:** Chrome y Firefox

## Requisitos previos

1. Tener instalado [Java JDK 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Instalar [Maven](https://maven.apache.org/install.html).
3. Contar con los navegadores **Google Chrome** y **Mozilla Firefox** instalados.
4. Descargar los drivers correspondientes:
    - [ChromeDriver](https://chromedriver.chromium.org/downloads)
    - [GeckoDriver](https://github.com/mozilla/geckodriver/releases)

## Configuración del proyecto

1. Clonar este repositorio:
   ```bash
   git clone https://github.com/CarlosLaynes/Proyecto-Prueba-Navisaf.git

## Ejecución de la prueba

Para ejecutar las pruebas en Chrome:
mvn test -Dcucumber.filter.tags="@compra_un_producto" -Dbrowser=chrome

Para ejecutar las pruebas en Firefox:
mvn test -Dcucumber.filter.tags="@compra_un_producto" -Dbrowser=firefox

## Estructura del proyecto

- src/main: Contiene las clases base y los objetos de página (POM).
- src/test: Contiene las pruebas automatizadas.

## Mejores prácticas implementadas
- Uso del patrón de diseño Page Object Model (POM) para mantener el código modular y reutilizable.
- Soporte para múltiples navegadores (Chrome y Firefox).