public class ex014 {
    public static void main(String [] args){
        double nota1 = 7.0;
        double nota2 = 5.0;
        double nota3 = 3.0;

        if (nota1 >= 7.0){
            System.out.print("Aluno Aprovado ");

        }
        else if (nota2 >= 5 && nota2 < 7.0){
            System.out.print("Aluno em recuperação ");
        }else {
            System.out.print("Aluno de aluno reprovado ");
        }
    }
}
