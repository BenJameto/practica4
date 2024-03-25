/**
 * UserPreferences representa las preferencias del usuario para la construcción de una nave espacial.
 * Contiene información sobre el sistema de propulsión, el blindaje, la cabina y el arma preferidos por el usuario.
 */
public class UserPreferences {
    
    private PropulsionSystem propulsionSystem; // El sistema de propulsión preferido por el usuario
    private Armor armor; // El blindaje preferido por el usuario
    private Cockpit cockpit; // La cabina preferida por el usuario
    private Weapon weapon; // El arma preferida por el usuario

    /**
     * Constructor por defecto de UserPreferences. Inicializa todas las preferencias del usuario como null.
     */
    public UserPreferences() {
    }

    /**
     * Constructor de UserPreferences que permite inicializar las preferencias del usuario con valores específicos.
     * 
     * @param propulsionSystem El sistema de propulsión preferido por el usuario.
     * @param armor El blindaje preferido por el usuario.
     * @param cockpit La cabina preferida por el usuario.
     * @param weapon El arma preferida por el usuario.
     */
    public UserPreferences(PropulsionSystem propulsionSystem, Armor armor, Cockpit cockpit, Weapon weapon) {
        this.propulsionSystem = propulsionSystem;
        this.armor = armor;
        this.cockpit = cockpit;
        this.weapon = weapon;
    }

    /**
     * Obtiene el sistema de propulsión preferido por el usuario.
     * 
     * @return El sistema de propulsión preferido por el usuario.
     */
    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    /**
     * Establece el sistema de propulsión preferido por el usuario.
     * 
     * @param propulsionSystem El sistema de propulsión preferido por el usuario.
     */
    public void setPropulsionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    /**
     * Obtiene el blindaje preferido por el usuario.
     * 
     * @return El blindaje preferido por el usuario.
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Establece el blindaje preferido por el usuario.
     * 
     * @param armor El blindaje preferido por el usuario.
     */
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    /**
     * Obtiene la cabina preferida por el usuario.
     * 
     * @return La cabina preferida por el usuario.
     */
    public Cockpit getCockpit() {
        return cockpit;
    }

    /**
     * Establece la cabina preferida por el usuario.
     * 
     * @param cockpit La cabina preferida por el usuario.
     */
    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    /**
     * Obtiene el arma preferida por el usuario.
     * 
     * @return El arma preferida por el usuario.
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Establece el arma preferida por el usuario.
     * 
     * @param weapon El arma preferida por el usuario.
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
