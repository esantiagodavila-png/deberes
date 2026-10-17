package logica;
import java.util.Scanner;

public class FrecuenciaCardiacaMain {

    public static void main (String[] argsEdu){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();


        System.out.print("Ingrese el día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = entrada.nextInt();


        FrecuenciaCardiaca people = new FrecuenciaCardiaca(
                nombre , apellido , dia , mes, anio
        );


        System.out.println("\n--- DATOS PERSONALES ---");

        people.showAge();
        people.showHearthRange();
        people.showHealthyRange();
    }
}
