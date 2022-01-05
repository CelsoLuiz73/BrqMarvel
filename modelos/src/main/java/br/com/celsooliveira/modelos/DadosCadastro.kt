package br.com.celsooliveira.modelos

import java.io.Serializable

data class DadosCadastro(
    val id: Int,
    val nome: String,
    val email: String,
    val senha: String,
    val confirmarSenha: String,
) : Serializable