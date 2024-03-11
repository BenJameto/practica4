public class Lector {
    public void leeMenu(IterableCollection<Hamburguesa> menu){
         Iterator <Hamburguesa> it = menu.createIterator();
         while (it.hasMore()) {
            Hamburguesa actual = it.getNext();
            System.out.println(actual);
         } 
    }
}
