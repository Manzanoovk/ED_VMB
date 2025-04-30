/**
 * @author victor
 *         version 1.0
 */

// Aqui creo la clase
public class VMB_GravedadPlaneta {
    /**
     * Esto es un ejemplo
     * 
     * @param Este será el mensaje a imprimir
     */

    private int id;
    private String nombre;
    private double gravedadplaneta;

    // Aqui inserto el constructor de la clase VMB_GravedadPlaneta
    public VMB_GravedadPlaneta(double gravedadplaneta, int id, String nombre) {
        this.gravedadplaneta = gravedadplaneta;
        this.id = id;
        this.nombre = nombre;
    }

    // Aqui inserto los getter y setter de la clase VMB_GravedadPlaneta
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGravedadplaneta() {
        return gravedadplaneta;
    }

    public void setGravedadplaneta(double gravedadplaneta) {
        this.gravedadplaneta = gravedadplaneta;
    }

    // Aqui inserto el metodo ToString de la clase VMB_GravedadPlaneta
    @Override
    public String toString() {
        return "VMB_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", gravedadplaneta=" + gravedadplaneta + "]";
    }

}