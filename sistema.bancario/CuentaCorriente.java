package sistema.bancario;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro = 500.0;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= (getSaldo() + limiteSobregiro)) {
            actualizarSaldo(getSaldo() - monto);
        } else {
            System.out.println("Error: Retiro inválido. Excede el límite de sobregiro ($500).");
        }
    }

    @Override
    public double calcularInteresMensual() {
        // No genera intereses
        return 0.0;
    }
}