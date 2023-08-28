public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7; 

        if(nota<7){
            System.out.println("aluno reprovado");
        }else if(nota==7){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("aluno aprovado;");
        }
    }
}
