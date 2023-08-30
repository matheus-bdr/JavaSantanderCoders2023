public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        //não foi colocado o break para poder pegar atributos do plano anterior 
        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whats e Instaram ilimitado");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            default:
                System.out.println("indefinido");

        }
    }
}
