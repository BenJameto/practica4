
public class Basico implements IterableCollection <Hamburguesa>{
    Hamburguesa platillos[] = new Hamburguesa [3];
    public Basico (){
        platillos [0] = new Hamburguesa("Bs1", "clasica", "haburguesa con usa nsola carne", 60, true, false);
        platillos [1] = new Hamburguesa("Bs2", "hahayana", "la clasica con un pedacito de pigna", 70, true, false);
        platillos [2] = new Hamburguesa("Bs3", "tehanaa", "lo mismo de la hahayana mas un pedacito de tosino", 80, true, false);
    }

    public Iterator<Hamburguesa> createIterator(){
        return new BasicoIterator(this);
    }
}
