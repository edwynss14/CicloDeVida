# Monitorización del Ciclo de Vida de una Activity en Android

Aplicación desarrollada en **Kotlin** con **Android Studio** que registra en tiempo real cada transición del ciclo de vida de una `Activity` (`ComponentActivity`) mediante **Logcat**, calculando además el tiempo exacto que la pantalla permanece activa en primer plano.

## Métodos del ciclo de vida implementados

En `MainActivity.kt` se han sobrescrito los siete métodos principales del ciclo de vida bajo la etiqueta `CicloVidaApp`:

| Método | Descripción registrada en Logcat |
| :--- | :--- |
| **`onCreate()`** | Creación inicial de la `Activity`. |
| **`onStart()`** | La `Activity` está a punto de hacerse visible. |
| **`onResume()`** | La `Activity` pasa a primer plano con foco e inicia el cronómetro (`SystemClock.elapsedRealtime()`). |
| **`onPause()`** | La `Activity` pierde el foco y calcula el tiempo que estuvo activa (en segundos y milisegundos). |
| **`onStop()`** | La `Activity` queda oculta en segundo plano. |
| **`onRestart()`** | La `Activity` se reinicia tras haber sido detenida. |
| **`onDestroy()`** | Destrucción final de la `Activity`. |

## Tecnologías utilizadas

- **Lenguaje:** Kotlin
- **Plataforma:** Android SDK (probado en emulador API 37)
- **Entorno de desarrollo:** Android Studio

## Cómo ejecutar y probar el proyecto

1. Clonar este repositorio y abrir la carpeta del proyecto en **Android Studio**.
2. Ejecutar la aplicación (`Run 'app'`) en un emulador o dispositivo físico Android.
3. Abrir la ventana **Logcat** y aplicar el filtro:
   ```text
   tag:CicloVidaApp
   ```
4. Navegar por el sistema (**Home**, **Recientes** y **Atrás**) para observar las transiciones de estado y el tiempo activo registrado en consola.

## Evidencia de ejecución (Logcat)

<img width="1808" height="997" alt="captura-logcat" src="https://github.com/user-attachments/assets/0f47bfe6-1701-4753-b5fa-134c8ff3cdc3" />
