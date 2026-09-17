package com.example.unigestionperu.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unigestionperu.data.repository.AuthRepository
import com.example.unigestionperu.state.AuthUiState
import kotlinx.coroutines.launch

class AuthViewModel(private val repository: AuthRepository = AuthRepository()) : ViewModel() {
    
    var uiState by mutableStateOf(AuthUiState())
        private set
        
    var username by mutableStateOf("")
    var password by mutableStateOf("")

    fun onLoginClick(onSuccess: () -> Unit) {
        if (username.isBlank() || password.isBlank()) {
            uiState = uiState.copy(error = "Por favor, completa todos los campos")
            return
        }

        viewModelScope.launch {
            uiState = uiState.copy(isLoading = true, error = null)
            val usuario = repository.validarCredenciales(username, password)
            
            if (usuario != null) {
                uiState = uiState.copy(
                    isLoading = false,
                    usuarioLogueado = usuario,
                    loginExitoso = true
                )
                onSuccess()
            } else {
                uiState = uiState.copy(
                    isLoading = false,
                    error = "Credenciales incorrectas"
                )
            }
        }
    }
}
