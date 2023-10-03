package animalesraros;

class Mamifero extends Animal {
    private String tipoPiel;
    private int numeroPatas;

    public Mamifero(String nombre, int edad, String tipoPiel, int numeroPatas) {
        super(nombre, edad);
        this.tipoPiel = tipoPiel;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Mamífero: " + super.getNombre() + ", Edad: " + super.getEdad() + ", Tipo de piel: " + tipoPiel + ", Número de patas: " + numeroPatas;
    }
}

