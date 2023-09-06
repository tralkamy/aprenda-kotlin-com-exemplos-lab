import domain.ConteudoEducacional
import domain.Formacao
import domain.Usuario
import domain.enums.Nivel
import domain.enums.Cursos
import service.impl.MatriucularAlunoImpl

fun main() {

    val c1 = Cursos.JAVA
    val c2 = Cursos.KOTLIN
    val conteudo1 = ConteudoEducacional("${c1} com spring boot", 35)
    val conteudo2 = ConteudoEducacional("${c2} - Desenvolvimento Mobile". 40)

    val f1 = Formacao(c1, mutableListOf(), Nivel.INTERMEDIARIO)
    val f2 = Formacao(c2, mutableListOf(), Nivel.INTERMEDIARIO)
    val matjava = MatriucularAlunoImpl(f1)
    val matkot = MatriucularAlunoImpl(f2)

    val user1 = Usuario(1, "Jeffersson", "12345678900")
    val user2 = Usuario(2, "Renata", "11122233344")
    val user3 = Usuario(3, "Bruno Henrique", "20192023627")


    formacao.adicionarConteudo(conteudo1)
    formacao.adicionarConteudo(conteudo2)
    matricula.matjava(user1)
    matricula.matkot(user2)
    matricula.matkot(user3)

    println("Formação ${f1.linguagem} : $f1")
    println("Formação ${f2.linguagem} : $f2")
    println("Formação ${f1.linguagem} Inscritos: ${f1.inscritos}")
    println("Formação ${f1.linguagem} Conteudo: ${f1.conteudos}")
    val userRemovido = matricula.cancelar(user3)
    println("Formação ${f2.linguagem} Inscritos: ${f2.inscritos}")

    if (userRemovido != null) {
        println("Na formação ${f2.linguagem} o aluno ${userRemovido.nome} desistiu do curso.")
    }
    println("Formação ${f2.linguagem} Inscritos: ${f2.inscritos}")
}