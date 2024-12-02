package com.example.ud6_ejemplo1.modelo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Personaje(
    @SerialName(value = "name")
    val nombre: String,
    @SerialName(value = "gender")
    val genero: String
)

