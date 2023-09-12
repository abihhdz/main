public class EmpleadoTiempoCompleto implements Empleado {
    private String nombre;
    private double salario;

    public EmpleadoTiempoCompleto (String nombre, double salario) {
        this.nombre = nombre;
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
