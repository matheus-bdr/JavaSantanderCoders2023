import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        imprimirCandidatos();
        String[] candidatos = { "FELIPE", "MARCIA", "PAULO", "MONICA", "FABRICIO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com o candidato: " + candidato + " numero max de tentativas: "
                    + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com o candidato: " + candidato + " numero max de tentativas: "
                    + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "PAULO", "MONICA", "FABRICIO" };
        System.out.println(" Imprimindo a lista de candidatos informando o indice do elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(" O candidato numero " + (i + 1) + " é " + candidatos[i]);
        }

        System.out.println(" Forma mais abreviada: ");
        for (String candidato : candidatos) {
            System.out.println(" O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {

        String[] candidatos = { "FELIPE", "MARCIA", "PAULO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado paa a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULADO DOS DEMAIS CANDIDATOS");
        }
    }
}
