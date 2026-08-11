package AULA_02.ALUNOS;
public class Main {
    public static void main(String[]args){
        //atributos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Eduardo";
        aluno1.curso = "SI";
        aluno1.idade = 20;
        
        Aluno aluno2 = new Aluno();
        aluno2.nome = "João";
        aluno2.curso = "ADS";
        aluno2.idade = 21;

            //metodo
        aluno1.mostrarInfos();
        aluno2.mostrarInfos();
        



    }
    
}
