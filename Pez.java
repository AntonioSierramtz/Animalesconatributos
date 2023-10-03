package animalesraros;

class Pez extends Animal {
    private String tipoEscamas;
    private boolean aguaSalada;

    public Pez(String nombre, int edad, String tipoEscamas, boolean aguaSalada) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
        this.aguaSalada = aguaSalada;
    }

    @Override
    public String toString() {
        return "Pez: " + super.getNombre() + ", Edad: " + super.getEdad() + ", Tipo de escamas: " + tipoEscamas + ", ¿Agua salada? " + (aguaSalada ? "Sí" : "No");
    }
}