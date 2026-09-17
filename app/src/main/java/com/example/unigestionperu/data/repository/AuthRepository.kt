package com.example.unigestionperu.data.repository

import com.example.unigestionperu.data.fake.FakeData
import com.example.unigestionperu.model.Usuario
import kotlinx.coroutines.delay

class AuthRepository {
    suspend fun validarCredenciales(username: String, password: String): Usuario? {
        // Simulamos un retraso de red
        delay(1500)
        
        // Validación simple: la contraseña es el mismo nombre de usuario para el demo
        return if (password == username) {
            FakeData.usuariosSimulados.find { it.username == username }
        } else {
            null
        }
    }
}
