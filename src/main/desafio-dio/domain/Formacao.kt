package domain

import domain.enums.Cursos
import domain.enums.Nivel

data class Formacao(val linguagens: Cursos, var conteudos: MutableList<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun adicionarConteudo(ConteudoEducacional: ConteudoEducacional){
        conteudos.add(conteudoEducacional)
    }
}