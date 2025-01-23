import java.util.Scanner;

public class ejercicio7 {//calculadora
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escriba el primer numero");
        double numero1 = scanner.nextDouble(); 

        System.out.println("escriba el segundo numero");
        double numero2 = scanner.nextDouble();

       double suma = numero1 + numero2;
       double resta = numero1 - numero2;
       double multiplicacion = numero1 * numero2;
       double division = numero1 / numero2;

       System.out.println("suma"+suma);
       System.out.println("resta"+resta);
       System.out.println("multiplicacion"+multiplicacion);
       System.out.println("division"+division);
        
    }
    
}
