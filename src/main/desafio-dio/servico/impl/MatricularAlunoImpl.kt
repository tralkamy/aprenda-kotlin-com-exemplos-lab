package servico.impl

import domain.Usuario
import domain.Formacao
import domain.enums.Cursos
import domain.enums.Nivel
import servico.MatriculaAluno

class MatricularAlunoImpl(private val formacao: Formacao) : MatriculaAluno {
    
    constructor() : this(Formacao(Cursos.KOTLIN, mutablelistOf(), Nivel.INTERMEDIARIO))

    override fun matricular(usuario: Usuario) {
        formacao.inscritos.add(usuario)
    }

    override fun cancelar(usuario: Usuario): Usuario?{
        val removedUser = formacao.inscritos.remove(usuario)
        return if (removedUser) usuario else null
    }
}