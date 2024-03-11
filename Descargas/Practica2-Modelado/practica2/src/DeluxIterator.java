public class DeluxIterator implements Iterator <Hamburguesa> {
    private Delux menuDelux;
    private int indice;

    public DeluxIterator (Delux menu){
        this.menuDelux = menu;
        indice = 1;
    }

    public Hamburguesa getNext(){
        Hamburguesa actual = this.menuDelux.platillos.get("Del" + indice);
        indice ++;
        return actual;
    }

    public boolean hasMore(){
        return indice <= this.menuDelux.platillos.size();
    } 
}
