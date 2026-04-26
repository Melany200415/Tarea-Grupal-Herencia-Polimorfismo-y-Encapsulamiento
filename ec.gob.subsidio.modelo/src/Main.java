
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SolicitanteSubsidios.mostrarReglasSubsidio();
        System.out.println("=======================================================");

        System.out.print("Nombre : ");
        String nombre = sc.nextLine();

        System.out.print(" Ingrese su cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese la cantidad de vehículos registrados: ");
        int vehiculos = sc.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean vive = sc.nextBoolean();

        // objeto
        SolicitanteSubsidios s = new SolicitanteSubsidios(nombre, cedula, ingresos, vehiculos, vive);
        System.out.println(s.toString());
        s.generarResultado();
        System.out.println("=====Cálculos de Consumo mensual=====");
        double consumoBase = s.calcularConsumoMensual();
        System.out.println("Consumo mensual estimado (sin km extra): " + consumoBase + " galones");
        double extra = 80.0;
        double consumoExtra = s.calcularConsumoMensual(extra);
        System.out.println("Consumo con kilómetros extra (" + extra + " km adicionales): " + consumoExtra + " galones");
    }
}