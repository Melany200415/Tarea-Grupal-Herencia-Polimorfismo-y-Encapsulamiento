package sistema.bancario;

public class CuentaInversion extends CuentaBancaria {
    public CuentaInversion(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public double calcularInteresMensual() {
        double tasaAnual;
        double saldoActual = getSaldo();

        if (saldoActual < 1000) {
            tasaAnual = 0.04;
        } else if (saldoActual <= 5000) {
            tasaAnual = 0.05;
        } else {
            tasaAnual = 0.06;
        }

        return saldoActual * (tasaAnual / 12);
    }
}
