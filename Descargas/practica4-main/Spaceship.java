public class Spaceship {
    private PropulsionSystem propulsionSystem;
    private Armor armor;
    private Cockpit cockpit;
    private Weapon weapon;

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

    @Override
    public String toString() {
        return "Spaceship \n" +
                "propulsionSystem: " + propulsionSystem + "\n"+
                "armor: " + armor + "\n"+
                "cockpit: " + cockpit + "\n"+
                "weapon: " + weapon + "\n";
    }
}