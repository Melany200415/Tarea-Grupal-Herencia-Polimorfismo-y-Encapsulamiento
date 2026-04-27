package sistema.bancario;

public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Error: No se permite saldo inicial negativo.");
        }
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    // Evitar asignaciones
    protected void actualizarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            actualizarSaldo(this.saldo + monto);
        } else {
            System.out.println("No se permiten depósitos negativos o en cero");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            actualizarSaldo(this.saldo - monto);
        } else {
            System.out.println("Retiro inválido. Fondos insuficientes o monto incorrecto");
        }
    }

    public abstract double calcularInteresMensual();

    public void aplicarInteres() {
        double interes = calcularInteresMensual();
        if (interes > 0) {
            depositar(interes);
        }
    }

    @Override
    public String toString() {
        return "Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo Actual: $" + String.format("%.2f", saldo);
    }
}