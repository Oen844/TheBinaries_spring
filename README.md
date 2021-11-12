# THE BINARIES
Bienvenidos a nuestro proyecto! Este proyecto está basado en un juego de sopa de letras.

## PRODUCTO 3. DESARROLLO E IMPLEMENTACIÓN DE LA APLICACIÓN

Los datos de la aplicación estarán almacenados en una base de datos relacional, así
pues, teniendo en cuenta que se aplicarán los patrones de diseño MVC y DAO, se
realizarán las actividades necesarias para la persistencia de los datos.
 
## ESTRUCTURA DEL PROYECTO 📂
-   Contoladores.
-   Modelos.
-   Vistas: jsp y css.

## SOFTWARE USADO  🛠️
- **IDE:** El IDE que hemos usado para la implementación del proyecto ha sido IntelliJ y Visual Studio Code.
- **Google Chrome:** Navegador web.
- **GitHub**: Usado para la creación de nuestro repositorio.

## FRAMEWORKS Y API'S USADOS
Los frameworks y APIs usados mas importantes para este proyecto han sido:
- **Intellij**: IDE inteligente y sensible al contexto para trabajar con Java y otros lenguajes JVM.
- **Spring**: Framework para el desarrollo de aplicaciones y contenedor de inversión de control, de código abierto para la plataforma Java.
- **AJAX**: Técnica en desarrollo web que consiste en la mezcla de tecnologías existentes:
   - `XML / XSLT` para el envío de datos en XML del servidor al cliente (aunque también puede ser texto plano).
   - `DOM + Javascript` para la manipulación de los datos enviados del servidor.
   - `HTML / XHTML + CSS` que involucra a la presentación en lado del cliente.

## DEPENDENCIAS Y CONFIGURACIONES

Por un lado, el uso de las dependencias centralizado en el archivo "pom.xml", nos permite gestionar bibliotecas y/o aplicaciones ya desarrolladas previamente por la comunidad o una empresa, y tienen el objetivo de ahorrar tiempo y recursos en el desarrollo de una aplicación. En este producto, hemos añadido la siguiente:
- **spring-boot-devtools**: Su función se basa en recargar automáticamente todos los archivos estáticos en el servidor, de modo que cualquier cambio dentro de las vistas es mostrado sin necesidad de reiniciar el servidor. 

Por otro lado, cabe destacar la configuración que hemos añadido en "application.propperties", cuyo contenido es este: 

- **spring.jpa.generate-ddl =true
- **spring.jpa.hibernate.hbm2dd1.auto-update

El objetivo de esta configuración es simplificar la estructuración de una Base de Datos, y de esta manera, se generan automáticamente las tablas con sus respectivas filas a partir de los modelos. 


## AUTORES ✒️
 - Francisca María Rodríguez Vázquez
 - Pau Egea Cortes
 - Asier Uruñuela Sánchez
 - Sofia Isabel Figueroa Arocha 
