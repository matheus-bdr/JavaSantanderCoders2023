public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("tv está ligada? "+ smartTv.ligada);
        System.out.println("qual canal que está? "+ smartTv.canal);
        System.out.println("qual o volume? "+ smartTv.volume);
    }
}
