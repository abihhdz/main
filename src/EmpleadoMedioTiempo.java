public class EmpleadoMedioTiempo implements Empleado {

    private String nombre;
    private double salario;

    public EmpleadoMedioTiempo (String nombre, double salario) {
        this.salario = salario;
    }

   @Override
public String obtenerNombre() {
    return nombre;
}

    @Override
    public double calcularSalario() {
       return salario;
    }
    
}
