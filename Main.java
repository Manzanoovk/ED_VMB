public class Main {
    /**
     * @param args
     */
    // Aqui creo el metodo main
    public static void main(String[] args) {
        Persona_VMB persona1 = new Persona_VMB(1.75, 25, 1, 70, "Victor Manzano");
        Persona_VMB persona2 = new Persona_VMB(1.80, 30, 2, 80, "David Soto");

        VMB_GravedadPlaneta planeta1 = new VMB_GravedadPlaneta(9.81, 1, "Tierra");
        VMB_GravedadPlaneta planeta2 = new VMB_GravedadPlaneta(3.71, 2, "Marte");
        VMB_GravedadPlaneta planeta3 = new VMB_GravedadPlaneta(24.79, 3, "Jupiter");

        // Calculo peso persona en tierra peso = masa por aceleracion
        double masaPersona = persona1.getMasa();
        double gravedadTierra = planeta1.getGravedadplaneta();
        double pesoTierra = masaPersona * gravedadTierra;
        System.out.println(
                "El peso de " + persona1.getNombre() + " en " + planeta1.getNombre() + " es: " + pesoTierra);

        // Calculo peso persona en marte peso = masa por aceleracion
        masaPersona = persona2.getMasa();
        double gravedadMarte = planeta2.getGravedadplaneta();
        double pesoMarte = masaPersona * gravedadMarte;
        System.out.println(
                "El peso de " + persona2.getNombre() + " en " + planeta2.getNombre() + " es: " + pesoMarte);

        // Calculo peso persona en jupiter peso = masa por aceleracion
        masaPersona = persona1.getMasa();
        double gravedadJupiter = planeta3.getGravedadplaneta();
        double pesoJupiter = masaPersona * gravedadJupiter;
        System.out.println(
                "El peso de " + persona1.getNombre() + " en " + planeta3.getNombre() + " es: " + pesoJupiter);

    }
}
