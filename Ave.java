package animalesraros;

class Ave extends Animal {
    private String tipoPlumaje;
    private boolean vuela;

    public Ave(String nombre, int edad, String tipoPlumaje, boolean vuela) {
        super(nombre, edad);
        this.tipoPlumaje = tipoPlumaje;
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        return "Ave: " + super.getNombre() + ", Edad: " + super.getEdad() + ", Tipo de plumaje: " + tipoPlumaje + ", ¿Vuela? " + (vuela ? "Sí" : "No");
    }
}




