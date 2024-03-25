/**
 * La clase Cockpit representa la cabina de una nave espacial y contiene información sobre su nombre, descripción y precio.
 */
public class Cockpit {
    private String name; // El nombre de la cabina.
    private String description; // La descripción de la cabina.
    private double price; // El precio de la cabina.

    /**
     * Crea una nueva instancia de la clase Cockpit con el nombre, la descripción y el precio especificados.
     * 
     * @param name El nombre de la cabina.
     * @param description La descripción de la cabina.
     * @param price El precio de la cabina.
     */
    public Cockpit(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Obtiene el nombre de la cabina.
     * 
     * @return El nombre de la cabina.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la cabina.
     * 
     * @param name El nombre de la cabina a establecer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la descripción de la cabina.
     * 
     * @return La descripción de la cabina.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción de la cabina.
     * 
     * @param description La descripción de la cabina a establecer.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el precio de la cabina.
     * 
     * @return El precio de la cabina.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio de la cabina.
     * 
     * @param price El precio de la cabina a establecer.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una representación en forma de cadena de la cabina, incluyendo su nombre, descripción y precio.
     * 
     * @return Una cadena que representa la cabina.
     */
    @Override
    public String toString() {
        return "Cockipt\n" +
                "name: " + name + "\n" +
                "description: " + description + "\n" +
                "price: " + price + "\n";
    }
}

