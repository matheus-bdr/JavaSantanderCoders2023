public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 15.0;
        if(valorSolicitado<saldo){
            saldo = saldo - valorSolicitado;
        }else{
            System.out.println("Valor insificiente");
        }
        System.out.println(saldo);
    }
}
