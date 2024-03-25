/**
 * Clase que representa un arma en el sistema de creación de naves espaciales.
 * Cada arma tiene un nombre, una descripción y un precio.
 */
public class Weapon {
    private String name; // Nombre del arma
    private String description; // Descripción del arma
    private double price; // Precio del arma

    /**
     * Constructor de la clase Weapon.
     * @param name Nombre del arma.
     * @param description Descripción del arma.
     * @param price Precio del arma.
     */
    public Weapon(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Método getter para obtener el nombre del arma.
     * @return El nombre del arma.
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter para establecer el nombre del arma.
     * @param name El nombre del arma.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método getter para obtener la descripción del arma.
     * @return La descripción del arma.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método setter para establecer la descripción del arma.
     * @param description La descripción del arma.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método getter para obtener el precio del arma.
     * @return El precio del arma.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Método setter para establecer el precio del arma.
     * @param price El precio del arma.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Método que devuelve una representación de cadena del arma.
     * @return Una cadena que representa el arma.
     */
    @Override
    public String toString() {
        return "Weapon \n" +
                "name: " + name + "\n" +
                "description: " + description + "\n" +
                "price: " + price + "\n";
    }
}

