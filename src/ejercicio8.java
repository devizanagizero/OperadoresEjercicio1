import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el ancho del cuadrado");
        double numero1 = scanner.nextDouble();

        System.out.println("ingrese la altura del cuadrado");
        double numero2 = scanner.nextDouble();

        double Areadelcuadrado = numero1 * numero2;

        System.out.println("el area del triangulo es "+Areadelcuadrado);
        scanner.close();

    }
}
