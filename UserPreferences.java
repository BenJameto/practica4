public class UserPreferences {
    private PropulsionSystem propulsionSystem;
    private Armor armor;
    private Cockpit cockpit;
    private Weapon weapon;

    public UserPreferences(){

    }

    public UserPreferences (PropulsionSystem propulsionSystem, Armor armor, Cockpit cockpit, Weapon weapon){
        this.propulsionSystem = propulsionSystem;
        this.armor = armor;
        this.cockpit = cockpit;
        this.weapon = weapon;
    }

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    
}
