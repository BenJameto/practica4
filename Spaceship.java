/**
 * La clase Spaceship representa una nave espacial y contiene información sobre sus componentes, como el sistema de propulsión, el blindaje, la cabina y el arma.
 */
public class Spaceship {
    private PropulsionSystem propulsionSystem; // El sistema de propulsión de la nave.
    private Armor armor; // El blindaje de la nave.
    private Cockpit cockpit; // La cabina de la nave.
    private Weapon weapon; // El arma de la nave.

    /**
     * Obtiene el sistema de propulsión de la nave.
     * 
     * @return El sistema de propulsión de la nave.
     */
    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    /**
     * Establece el sistema de propulsión de la nave.
     * 
     * @param propulsionSystem El sistema de propulsión de la nave.
     */
    public void setPropulsionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    /**
     * Obtiene el blindaje de la nave.
     * 
     * @return El blindaje de la nave.
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Establece el blindaje de la nave.
     * 
     * @param armor El blindaje de la nave.
     */
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    /**
     * Obtiene la cabina de la nave.
     * 
     * @return La cabina de la nave.
     */
    public Cockpit getCockpit() {
        return cockpit;
    }

    /**
     * Establece la cabina de la nave.
     * 
     * @param cockpit La cabina de la nave.
     */
    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    /**
     * Obtiene el arma de la nave.
     * 
     * @return El arma de la nave.
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Establece el arma de la nave.
     * 
     * @param weapon El arma de la nave.
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Devuelve una representación de cadena de la nave espacial, incluyendo información sobre sus componentes.
     * 
     * @return Una cadena que representa la nave espacial.
     */
    @Override
    public String toString() {
        return "Spaceship \n" +
                "propulsionSystem: " + propulsionSystem + "\n"+
                "armor: " + armor + "\n"+
                "cockpit: " + cockpit + "\n"+
                "weapon: " + weapon + "\n";
    }
}
