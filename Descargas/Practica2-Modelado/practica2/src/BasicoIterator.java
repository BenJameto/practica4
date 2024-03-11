
public class BasicoIterator implements Iterator <Hamburguesa> {
    private Basico menuBasico;
    private int indice;

    public BasicoIterator (Basico menu){
        this.menuBasico = menu;
        indice = 0;
    }

    public Hamburguesa getNext(){
        Hamburguesa actual = this.menuBasico.platillos[indice];
        indice ++;
        return actual;
    }

    public boolean hasMore(){
        return indice < this.menuBasico.platillos.length;
    }
}
