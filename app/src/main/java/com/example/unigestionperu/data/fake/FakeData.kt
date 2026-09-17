package com.example.unigestionperu.data.fake

import com.example.unigestionperu.model.Usuario
import com.example.unigestionperu.model.RolUsuario

object FakeData {
    val usuariosSimulados = listOf(
        Usuario("estudiante", "Juan Perez", RolUsuario.ESTUDIANTE),
        Usuario("docente", "Prof. Maria Garcia", RolUsuario.DOCENTE),
        Usuario("admin", "Admin System", RolUsuario.ADMINISTRATIVO)
    )
}
