public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++){
            if(i ==3){
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("__________________");

         for (int i = 0; i <=5; i++){
            if(i ==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
