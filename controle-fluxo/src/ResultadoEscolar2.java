public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 7;
        //String resultado = nota >= 7 ? "aprovado" : "reprovado" ;
         String resultado = nota >= 7 ? "aprovado" :  nota>=5 && nota < 7 ? "recuperacao": "respovado";
        System.out.println(resultado);
    }
}
