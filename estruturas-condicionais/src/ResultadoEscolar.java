public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 7;
       // String resultado = nota>=7 ? "Aprovado" : "Reprovado";
        String resultado = nota>=7 ? "Aprovado" : nota>= 5 && nota<7 ? "Recperação" : "Reprovado";
        System.out.println(resultado);
    }
}
