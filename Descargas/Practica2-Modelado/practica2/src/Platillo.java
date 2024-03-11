import java.io.*;
public abstract class Platillo {
    String id;
    String nombre;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;

    public Platillo(String id, String nombre, String descripcion, double precio, boolean tieneQueso, boolean esVegetariano ){
        this.id = id;
        this.nombre =nombre;
        this.descripcion=descripcion;
        this.precio =precio;
        this.tieneQueso=tieneQueso;
        this.esVegetariano=esVegetariano;
    }

    void prepararPlatillo(){
        agregarPan();
        agregarMayonesa();
        agregarMostaza();
        if(esVegetariana() == true){
            prepararProteinaV();
            ponerProteinaV();
        } else{
        prepararProteina();
        ponerProteina();
        }
        if(conQueso()){
            agregarQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    void agregarPan(){
        System.out.println("Colocando pan...\n");
    }

    void agregarMayonesa(){
        System.out.println("Agregando mayonesa...\n");
    }

    void agregarMostaza(){
        System.out.println("Agregando mostaza...\n");
    }

    void ponerProteina(){
        System.out.println("Agregando carne...\n");
    }

    void ponerProteinaV(){
        System.out.println("Agregando deliciosa soya!...\n");
    }

    abstract void agregarQueso();

    void prepararProteina(){
        System.out.println("Preparando rica carne...\n");        
    }

    void prepararProteinaV(){
        System.out.println("Preparando rica soya...\n");        
    }

    boolean esVegetariana(){
        return esVegetariano;
    }

    boolean conQueso(){
        return true;
    }

    void ponerVegetales(){
        System.out.println("\nAgregando vegetales...\n");
    }

    void ponerCatsup(){
        System.out.println("Agregando catsup...\n");
    }

    void ponerPan(){
        System.out.println("Terminando hamburguesa deliciosa!\n");
    }

    @Override
    public String toString (){
        String cadena = id + " " + nombre + " \n"+ descripcion + " " + precio + " " + tieneQueso + " " + esVegetariano + " \n";
        return cadena;
    }

    public String darNombre(){
        return nombre;
    }
}