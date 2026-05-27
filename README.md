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
