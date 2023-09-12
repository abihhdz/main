public class probarEmpleado { 
public static void main(String [] args) {
        EmpleadoMedioTiempo p1 = new EmpleadoMedioTiempo("Francisco", 3000);
        EmpleadoTiempoCompleto p2 = new EmpleadoTiempoCompleto("Daniel", 6000);
        
        String nombreEmpleado = p1.obtenerNombre();
        System.out.println("Nombre del empleado de medio tiempo:  " + nombreEmpleado);
        double salarioEmpleado = p2.calcularSalario();
        System.out.println("Salario del empleado: $" + salarioEmpleado);
        String nombreEmpleado2 = p2.obtenerNombre();
        System.out.println("Nombre del empleado de tiempo completo: " + nombreEmpleado2);
        double salarioEmpleado2 = p2.calcularSalario();
        System.out.println("Salario del empleado: $" + salarioEmpleado2);
    }
}
    
