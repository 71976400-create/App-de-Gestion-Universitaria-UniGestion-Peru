package com.example.unigestionperu.state

import com.example.unigestionperu.model.Usuario

data class AuthUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val usuarioLogueado: Usuario? = null,
    val loginExitoso: Boolean = false
)
