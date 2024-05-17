APLICATIVO MANEJO DE VALES

Para despliegue del aplicativo se importa como un maven existing project
maven update
run: maven clean install
Y se despliega desde el projecto con un 
RUN AS:
Spring boot APP


CONFIGURADO CON JAVA 1.8 

MAVEN 
4.0.0

SPRING BOOT y SPRING SECURITY (la cual utiliza la misma version que configura el springboot)
<artifactId>spring-boot-starter-parent</artifactId>
<version>2.5.7</version>
<relativePath/>

Thymeleaf
Thymeleaf es un motor de plantillas de Java para generar contenido dinámico en aplicaciones web. Se utiliza principalmente en el contexto de aplicaciones Spring MVC para crear páginas HTML que se pueden renderizar en el servidor con datos dinámicos



TENER EN CUENTA LA CONEXION A LA BASE DE DATOS QUE SE CONFIGURA EN EL APPLICATION.PROPERTIES
spring.datasource.url = jdbc:mysql://localhost:3306/usuario
spring.datasource.username = root
spring.datasource.password = root
## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update
# Permite ver las consultas sql en consola
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=DEBUG	
logging.level.org.hibernate.type=TRACE


BASE DE DATOS MYSQL: "usuario"
con sus tablas:
rol
usuarios
usuarios_roles
personal_bll