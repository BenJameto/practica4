import java.io.*;

public class Hamburguesa extends Platillo{

    public Hamburguesa(String id, String nombre, String descripcion, double precio, boolean tieneQueso, boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    public void agregarQueso(){
        System.out.println("\nAgregando rico queso!");
    }
    
    public boolean conQueso(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.print("Quieres queso en tu hamburguesa (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException ioe){
            System.err.println("Prueba de nuevo");
        } if (answer == null) {
            return "no";
        }
        return answer;
    }
}