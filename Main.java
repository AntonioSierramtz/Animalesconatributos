package animalesraros;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Animal[] animales = new Animal[10];

        for (int i = 0; i < 10; i++) {
            int randomAnimal = rand.nextInt(3); 
            String nombre = "Animal " + i;
            int edad = rand.nextInt(10) + 1;

            switch (randomAnimal) {
                case 0:
                    animales[i] = new Mamifero(nombre, edad, obtenerTipoPielAleatorio(rand), rand.nextInt(5));
                    break;
                case 1:
                    animales[i] = new Ave(nombre, edad, obtenerTipoPlumajeAleatorio(rand), rand.nextBoolean());
                    break;
                case 2:
                    animales[i] = new Pez(nombre, edad, obtenerTipoEscamasAleatorio(rand), rand.nextBoolean());
                    break;
            }
        }

        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }

    private static String obtenerTipoPielAleatorio(Random rand) {
        String[] tiposPiel = {"Pelo", "Escamas", "Pelaje"};
        return tiposPiel[rand.nextInt(tiposPiel.length)];
    }

    private static String obtenerTipoPlumajeAleatorio(Random rand) {
        String[] tiposPlumaje = {"plumas rojas ", "Plumas verdes ", "Pelo negro"};
        return tiposPlumaje[rand.nextInt(tiposPlumaje.length)];
    }

    private static String obtenerTipoEscamasAleatorio(Random rand) {
        String[] tiposEscamas = {"Escamas azules", "Escamas verdes", "Escamas negraas"};
        return tiposEscamas[rand.nextInt(tiposEscamas.length)];
    }
}