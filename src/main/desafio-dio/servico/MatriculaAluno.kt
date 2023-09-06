package servico

import domain.Usuario

interface MatriculaAluno{
    fun matricular(usuario: Usuario)
    fun cancelar(usuario: Usuario): Usuario?
}