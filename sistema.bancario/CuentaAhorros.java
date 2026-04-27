package sistema.bancario;

public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public double calcularInteresMensual() {
        // 3% anual
        return getSaldo() * (0.03 / 12);
    }
}

