package br.com.celsooliveira.modelos

sealed class EventoBotaoCadastrar {
    object Ativado: EventoBotaoCadastrar()
    object Desativado: EventoBotaoCadastrar()
}

sealed class EventoBotaoCancelar {
    object Ativado: EventoBotaoCadastrar()
    object Desativado: EventoBotaoCancelar()
}

