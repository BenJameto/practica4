public class EspecialIterator implements Iterator <Hamburguesa> {
    private Especial menuEspecial;
    private int indice;

    public EspecialIterator (Especial menu){
        this.menuEspecial = menu;
        indice = 0;
    }

    public Hamburguesa getNext(){
        Hamburguesa actual = this.menuEspecial.platillos.get(indice);
        indice ++;
        return actual;
    }

    public boolean hasMore(){
        return indice < this.menuEspecial.platillos.size();
    } 
}
