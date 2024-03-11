import java.util.Hashtable;

public class Delux implements IterableCollection <Hamburguesa> {
    Hashtable<String, Hamburguesa> platillos = new Hashtable<>();

    public Delux(){
        Hamburguesa h1 = new Hamburguesa("Del1", "clasica", "haburguesa con usa nsola carne especial Delux", 60, true, false);
        Hamburguesa h2 = new Hamburguesa("Del2", "hahayana", "la clasica especial Delux con un pedacito de pigna", 70, true, false);
        Hamburguesa h3 = new Hamburguesa("Del3", "tehanaa", "lo mismo de la hahayana especial Delux mas un pedacito de tosino", 80, true, false);
    
        platillos.put(h1.id, h1);
        platillos.put(h2.id, h2);
        platillos.put(h3.id, h3);
    }
    public Iterator<Hamburguesa> createIterator() {
        return new DeluxIterator(this);
    }
}