public class Persona_VMB {
    private int id;
    private String nombre;
    private double masa;
    private double altura;
    private int edad;

    // Aqui inserto el constructor de la clase Persona_VMB
    public Persona_VMB(double altura, int edad, int id, double masa, String nombre) {
        this.altura = altura;
        this.edad = edad;
        this.id = id;
        this.masa = masa;
        this.nombre = nombre;
    }

    // Aqui inserto los getters y setters de la clase Persona_VMB
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

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Aqui inserto el metodo toString de la clase Persona_VMB
    @Override
    public String toString() {
        return "Persona_VMB [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
                + edad + "]";
    }

}