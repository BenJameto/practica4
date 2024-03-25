/**
 * La clase PropulsionSystem representa un sistema de propulsión para una nave espacial. Contiene información sobre el nombre, descripción y precio del sistema de propulsión.
 */
public class PropulsionSystem {
    private String name; // El nombre del sistema de propulsión.
    private String description; // La descripción del sistema de propulsión.
    private double price; // El precio del sistema de propulsión.

    /**
     * Crea un nuevo sistema de propulsión con el nombre, descripción y precio especificados.
     * 
     * @param name El nombre del sistema de propulsión.
     * @param description La descripción del sistema de propulsión.
     * @param price El precio del sistema de propulsión.
     */
    public PropulsionSystem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Obtiene el nombre del sistema de propulsión.
     * 
     * @return El nombre del sistema de propulsión.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del sistema de propulsión.
     * 
     * @param name El nombre del sistema de propulsión.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la descripción del sistema de propulsión.
     * 
     * @return La descripción del sistema de propulsión.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción del sistema de propulsión.
     * 
     * @param description La descripción del sistema de propulsión.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el precio del sistema de propulsión.
     * 
     * @return El precio del sistema de propulsión.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del sistema de propulsión.
     * 
     * @param price El precio del sistema de propulsión.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una representación de cadena del sistema de propulsión, incluyendo su nombre, descripción y precio.
     * 
     * @return Una cadena que representa el sistema de propulsión.
     */
    @Override
    public String toString() {
        return "Propulsion system \n" +
                "name: " + name + "\n" +
                "description: " +  description + "\n" +
                "price: " + price + "\n";
    }

    
}
