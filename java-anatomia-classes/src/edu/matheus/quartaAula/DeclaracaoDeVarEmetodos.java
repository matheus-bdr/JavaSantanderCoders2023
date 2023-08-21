package edu.matheus.quartaAula;
public class DeclaracaoDeVarEmetodos {
    public static void main(String[] args) {
        // métodos: tipoRetorno NomeObjetivoNoInfinitivo Parametro
        String primeiroNome = "Matheus";
        String segundoNome = "Santos";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
