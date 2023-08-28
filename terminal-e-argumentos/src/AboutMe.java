import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobre nome: ");
        String sobreNome = scanner.next();
        
        System.out.println("Meu nome completo é: "+nome+" "+sobreNome);
        System.out.println("Minha idade é: "+idade);
        System.out.println("Minha H é: "+altura);
    }
}
