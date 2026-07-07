# Proyecto DevOps - Microservicio
Este proyecto corresponde a un microservicio de inventario desarrollado con Spring Boot, aplicado en un entorno DevOps.
Incluye integración continua (CI), análisis de seguridad y calidad de código, además de automatización de despliegue mediante GitHub Actions.

El objetivo es simular un entorno real de desarrollo con prácticas modernas como GitFlow, CI/CD, pruebas automatizadas y análisis estático.

##Descripción del proyecto

## Funcionalidades
- **Login:** Simula la autenticación de usuarios para acceder al sistema.
- **Dashboard:** Permite visualizar información del inventario.
- **Hotfix:** Corrige un error en el módulo de login.

## Gitflow

Se utilizó GitFlow para organizar el desarrollo:

- `main`: versión estable del sistema
- `develop`: integración de cambios
- `feature/*`: nuevas funcionalidades
- `hotfix/*`: corrección de errores en producción

## Automatización (CI/CD)
Se implementa un pipeline con GitHub Actions, que se ejecuta en:

Push a develop
Push a main
Pull request hacia main o develop

## Etapas del pipeline:

Checkout del código

Configuración de Java 21

Compilación y ejecución de tests

Construcción de imagen Docker

Análisis de seguridad con Snyk

Análisis de calidad con SonarQube

## Análisis de Seguridad y Calidad de Código

Se integraron **Snyk** y **SonarQube** dentro del flujo CI/CD para mejorar la seguridad y calidad del microservicio.

### Snyk
Se utilizó **Snyk** para analizar las dependencias del proyecto y detectar vulnerabilidades conocidas en librerías utilizadas. Permite identificar riesgos de seguridad antes del despliegue y mantener componentes actualizados.

### SonarQube
Se configuró **SonarQube** para realizar un análisis estático del código, detectando errores, malas prácticas, código duplicado y problemas de mantenibilidad.

Estas herramientas permiten validar que el código cumpla con estándares de seguridad y calidad antes de ser desplegado en producción.

# Despliegue Manual en EC2

El despliegue manual del microservicio se realiza en una instancia EC2 de AWS, donde se instala Docker y Docker Compose para ejecutar la aplicación junto con su base de datos MySQL.

Primero se accede a la instancia mediante SSH, se clona el repositorio del proyecto y se configura el archivo `docker-compose.yml` con los servicios del backend y la base de datos. Luego se construyen y levantan los contenedores mediante `docker compose up --build`, verificando que la aplicación y MySQL estén ejecutándose correctamente con `docker ps` y los logs de Docker.

Finalmente, se prueba el funcionamiento del microservicio accediendo a la IP pública de la instancia EC2 mediante el puerto configurado (`8080`) o utilizando comandos como `curl` para validar la respuesta del servicio.


## Monitoreo con Amazon CloudWatch

Se configuró **Amazon CloudWatch** para monitorear el rendimiento de la instancia **EC2** mediante métricas de CPU, memoria y almacenamiento.

Métricas utilizadas:
- **cpu_usage_user:** Uso de CPU por la aplicación.
- **cpu_usage_system:** Uso de CPU del sistema operativo.
- **mem_used_percent:** Porcentaje de memoria RAM utilizada.
- **disk_used_percent:** Porcentaje de almacenamiento ocupado.

Estas métricas permiten supervisar el consumo de recursos y detectar posibles problemas de rendimiento.
