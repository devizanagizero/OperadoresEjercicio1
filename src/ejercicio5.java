public class ejercicio5 {//Ejercicio 5: ¿Cuánto te ha costado el ordenador?
    
    public static void main(String[] args) {

        // un nuevo PC y en la tienda de tu barrio cuesta 660€ 
        //el vendedor te descuenta el 10% por pronto pago

        int preciopc = 660;
        int descuentodeldiezporciento = 10;

        int preciototalcondescuento =  (660 * descuentodeldiezporciento /100)-preciopc;

        System.out.println("el precio con descuento es "+preciototalcondescuento);
        

    }
}