# Plan de Implementación: UniGestion Perú - Flujo de Autenticación y Pantalla Principal

Este plan detalla la implementación del flujo inicial para la aplicación UniGestion Perú, siguiendo la arquitectura MVVM y utilizando Jetpack Compose.

## Cambios Propuestos

### Configuración de Dependencias

#### [MODIFY] [libs.versions.toml](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/gradle/libs.versions.toml)
Añadir las versiones y librerías necesarias para:
- Jetpack Navigation (para navegar entre pantallas).
- Compose ViewModel (para la arquitectura MVVM).

#### [MODIFY] [build.gradle.kts](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/build.gradle.kts)
Aplicar las nuevas dependencias en el módulo `:app`.

---

### Arquitectura MVVM

#### [NEW] [User.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/data/model/User.kt)
Definir el modelo de datos para el Usuario, incluyendo el rol (Estudiante, Docente, etc.).

#### [NEW] [UserRepository.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/data/repository/UserRepository.kt)
Repositorio para simular la validación de credenciales.

#### [NEW] [LoginViewModel.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/ui/viewmodel/LoginViewModel.kt)
Gestionar el estado del login y la validación de credenciales.

---

### Interfaz de Usuario (UI)

#### [NEW] [NavGraph.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/ui/navigation/NavGraph.kt)
Configuración de la navegación entre Splash, Login y Home.

#### [NEW] [SplashScreen.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/ui/screens/SplashScreen.kt)
Pantalla de carga inicial con logo o nombre de la app.

#### [NEW] [LoginScreen.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/ui/screens/LoginScreen.kt)
Interfaz para ingresar usuario y contraseña.

#### [NEW] [StudentHomeScreen.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/ui/screens/StudentHomeScreen.kt)
Pantalla principal para el rol de Estudiante.

#### [MODIFY] [MainActivity.kt](file:///C:/Users/Usuario/Documents/Desarrollo de Aplicaciones Moviles/UniGestion Peru_Parcial_Ortiz Gil Breitner/app/src/main/java/com/example/unigestionperu/MainActivity.kt)
Configurar el punto de entrada para usar el `NavGraph`.

## Plan de Verificación

### Verificación Manual
- Abrir la app y observar el Splash Screen por 2 segundos.
- Ver la transición automática al Login Screen.
- Ingresar credenciales simuladas y validar el mensaje de error o éxito.
- Al ingresar con éxito como "Estudiante", verificar que redirige a la pantalla correcta.
