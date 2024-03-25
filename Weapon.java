/**
 * Clase que representa un arma.
 */
public class Weapon {

    /** Nombre del arma. */
    private String name;

    /** Descripción del arma. */
    private String description;

    /** Precio del arma. */
    private double price;

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
     * Obtiene el nombre del arma.
     * @return El nombre del arma.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del arma.
     * @param name El nombre del arma.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la descripción del arma.
     * @return La descripción del arma.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción del arma.
     * @param description La descripción del arma.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el precio del arma.
     * @return El precio del arma.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del arma.
     * @param price El precio del arma.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Weapon.
     * @return Representación en forma de cadena del objeto Weapon.
     */
    @Override
    public String toString() {
        return "Weapon \n" +
                "name: " + name + "\n" +
                "description: " + description + "\n" +
                "price: " + price + "\n";
    }
}
