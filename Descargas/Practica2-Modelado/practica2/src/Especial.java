import java.util.ArrayList;

/**
 * Especial
 */
public class Especial implements IterableCollection<Hamburguesa> {
    ArrayList<Hamburguesa> platillos = new ArrayList<Hamburguesa>();

    public Especial() {
        platillos.add(new Hamburguesa("Esp1", "clasica", "haburguesa con usa nsola carne especial", 60, true, false));
        platillos.add(new Hamburguesa("Esp2", "hahayana", "la clasica especial con un pedacito de pigna", 70, true, false));
        platillos.add(new Hamburguesa("Esp3", "tehanaa", "lo mismo de la hahayana especial mas un pedacito de tosino", 80, true,
                false));
    }

    public Iterator<Hamburguesa> createIterator() {
        return new EspecialIterator(this);
    }
}
