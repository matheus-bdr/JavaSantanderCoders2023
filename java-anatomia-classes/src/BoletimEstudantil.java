public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;

        if (mediaFinal>6){
            System.out.println("aluno aprovado");
        }
        
        else if(mediaFinal==6){
            System.out.println("aluno pendente");
        }
        
        else if(mediaFinal<6){
            System.out.println("aluno de recuperação");
        }
    }
}
