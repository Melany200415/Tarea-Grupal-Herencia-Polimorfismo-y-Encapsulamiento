package sistema.bancario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();

        // Datos de prueba
        cuentas.add(new CuentaAhorros("A-001", "Ana Pérez", 1200));
        cuentas.add(new CuentaCorriente("C-001", "Luis Gómez", 800));
        cuentas.add(new CuentaInversion("I-001", "María López", 7000));

        double totalInteresesBanco = 0;

        System.out.println("===== REPORTE MENSUAL DE CUENTAS =====");
        for (CuentaBancaria cuenta : cuentas) {
            double interes = cuenta.calcularInteresMensual();
            totalInteresesBanco += interes;

            // Interés
            cuenta.aplicarInteres();

            System.out.println(cuenta.toString());
            System.out.println("Interés mensual generado: $" + String.format("%.2f", interes));
            System.out.println("--------------------------------------");
        }

        System.out.println("======================================");
        System.out.println("Total de intereses pagados por el banco: $" + String.format("%.2f", totalInteresesBanco));
        System.out.println("======================================");
    }
}