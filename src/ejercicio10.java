import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        //media aritmetica

        Scanner scanner = new Scanner(System.in);


        System.out.println("ingrese el primer numero");
        double numero1 = scanner.nextDouble();

        System.out.println("ingrese el segundo  numero");
        double numero2 = scanner.nextDouble();

        System.out.println("ingrese el tercer numero");
        double numero3 = scanner.nextDouble();

        double MediaAritmetica = (numero1 + numero2  + numero3)/3;

        System.out.println("la media aritmetica es "+MediaAritmetica);

    scanner.close();
        

        

    
    }
    
}
