public class VMB_GravedadPlaneta {
    private int id;
    private String nombre;
    private double gravedadplaneta;

    public VMB_GravedadPlaneta(double gravedadplaneta, int id, String nombre) {
        this.gravedadplaneta = gravedadplaneta;
        this.id = id;
        this.nombre = nombre;
    }

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

    @Override
    public String toString() {
        return "VMB_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", gravedadplaneta=" + gravedadplaneta + "]";
    }

}
