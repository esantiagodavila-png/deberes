package logica;

import java.util.Scanner;

public class PerfilMedicoMain {
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

        System.out.print("Ingrese su peso en kg: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese su estatura en cm: ");
        int estatura = entrada.nextInt();

        System.out.print("Ingrese su genero: ");
        String genero = entrada.nextLine();


        PerfilMedico paciente = new PerfilMedico(
                nombre , apellido , dia , mes, anio , peso , estatura , genero
        );
        System.out.println("\n--- DATOS PERSONALES ---");
        paciente.showFullName();
        paciente.showAge();
        paciente.showHearthRange();
        paciente.showHealthyRange();
        paciente.showHegihtWeight();
        paciente.showBMI();
    }

}
