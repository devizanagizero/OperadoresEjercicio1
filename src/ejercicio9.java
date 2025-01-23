import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        //Ejercicio 9: Conversión de Temperaturas

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la tempreratura en grados celsius ");
        double celsius = scanner.nextDouble();

        double Fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("los grados Fahrenheit son"+Fahrenheit+" y los grados Kelvin son"+kelvin);


    }
    
}
