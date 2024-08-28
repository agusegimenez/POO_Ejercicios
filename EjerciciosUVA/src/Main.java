import uva2.Pantalla;
import uva2.Televisor;
import uva2.Tipo;

public class Main {
    public static void main(String[] args) {
        // Creamos una pantalla que será compartida entre varios televisores
        Pantalla pantallaCompartida = new Pantalla(55, "4K");

        // Creamos varios televisores que comparten la misma pantalla
        Televisor tv1 = new Televisor("Samsung", "Series 9", 2022, Tipo.L, pantallaCompartida, true);
        Televisor tv2 = new Televisor("LG", "OLED55", 2023, Tipo.O, pantallaCompartida, true);

        // Imprimir los valores iniciales de los televisores
        System.out.println("Valores iniciales:");
        tv1.imprimirValores();
        tv2.imprimirValores();

        // Encendemos los televisores
        tv1.encender();
        tv2.encender();

        // Consultamos si están encendidos
        System.out.println(tv1.consultarSiEstaEncendido());
        System.out.println(tv2.consultarSiEstaEncendido());

        // Alteramos la pantalla compartida
        pantallaCompartida.setResolucion("1080p");

        // Imprimimos los valores nuevamente después de modificar la pantalla
        System.out.println("\nValores después de cambiar la resolución de la pantalla compartida:");
        tv1.imprimirValores();
        tv2.imprimirValores();

        // Por ultimo, apagamos los televisores
        tv1.apagar();
        tv2.apagar();
    }
}