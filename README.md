# Proyecto DevOps - Microservicio


##Descripción del proyecto

## Funcionalidades
- **Login:** Simula la autenticación de usuarios para acceder al sistema.
- **Dashboard:** Permite visualizar información del inventario.
- **Hotfix:** Corrige un error en el módulo de login.

##Gitflow

Se utilizó GitFlow para organizar el desarrollo:

- `main`: versión estable del sistema
- `develop`: integración de cambios
- `feature/*`: nuevas funcionalidades
- `hotfix/*`: corrección de errores en producción

## Automatización
Se implementa una acción de GitHub Actions que se ejecuta en:
- Push a `develop`
- Pull request a `main`
