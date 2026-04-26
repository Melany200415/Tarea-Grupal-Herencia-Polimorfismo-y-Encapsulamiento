
public class SolicitanteSubsidios {
    //Atributos

    public String nombreCompleto;
    public String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    public boolean viveEnEcuador;

    //Constructor
    public SolicitanteSubsidios(String nombreCompleto, String cedula, double ingresosMensuales,
                                int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.viveEnEcuador = viveEnEcuador;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);

    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("El valor es menos de 470");
            this.ingresosMensuales = 470;
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("La cantidad es incorrecta");
            this.cantidadVehiculos = 0;
        }
    }

    public boolean subsidioAprobado() {
        return (ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador);
    }

    public void generarResultado() {
        System.out.println("======RESULTADO DE LA EVALUACIÓN=====");
        if (subsidioAprobado()) {
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos por el Gobierno del Ecuado");
        } else {
            System.out.println("ESTADO: RECHAZADO");
            if (ingresosMensuales >= 1200) System.out.println("Sus ingresos mayores a $1200");
            if (cantidadVehiculos > 1) System.out.println("Posee mas de un vehiculo");
            if (viveEnEcuador) System.out.println("Debe de vivir en Ecuador");
        }
    }

    public static void mostrarReglasSubsidio() {
        System.out.println("==========REGLAS PARA  OBTENER EL SUBSIDIO ===========");
        System.out.println("1. Tener ingresos menores o iguales a $1,200.");
        System.out.println("2.No poseer más de un vehículo .");
        System.out.println("3.Tener residencia en Ecuador.");

    }

    public double calcularConsumoMensual() {
        return 400.0 / 40;
    }

    public double calcularConsumoMensual(double kmExtra) {
        return (400.0 + kmExtra) / 40;
    }

    @Override
    public String toString() {
        return "\n================ Datos del solicitante ================\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cédula: " + cedula + "\n" +
                "Ingresos mensuales: $" + ingresosMensuales + "\n" +
                "Cantidad de vehículos: " + cantidadVehiculos + "\n" +
                "Vive en Ecuador: " + (viveEnEcuador ? "Sí" : "No") +
                "\n=======================================================";
    }
}
