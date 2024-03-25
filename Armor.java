/**
 * La clase Armor representa una armadura para una nave espacial y contiene información sobre su nombre, descripción y precio.
 */
public class Armor {
    private String name; // El nombre de la armadura.
    private String description; // La descripción de la armadura.
    private double price; // El precio de la armadura.

    /**
     * Crea una nueva instancia de la clase Armor con el nombre, la descripción y el precio especificados.
     * 
     * @param name El nombre de la armadura.
     * @param description La descripción de la armadura.
     * @param price El precio de la armadura.
     */
    public Armor(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Obtiene el nombre de la armadura.
     * 
     * @return El nombre de la armadura.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la armadura.
     * 
     * @param name El nombre de la armadura a establecer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la descripción de la armadura.
     * 
     * @return La descripción de la armadura.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción de la armadura.
     * 
     * @param description La descripción de la armadura a establecer.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el precio de la armadura.
     * 
     * @return El precio de la armadura.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio de la armadura.
     * 
     * @param price El precio de la armadura a establecer.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una representación en forma de cadena de la armadura, incluyendo su nombre, descripción y precio.
     * 
     * @return Una cadena que representa la armadura.
     */
    @Override
    public String toString() {
        return "Armor \n" +
                "name: " + name + "\n" +
                "description: " + description + "\n" +
                "price: " + price + "\n";
    }
}

