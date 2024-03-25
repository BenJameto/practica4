/**
 * WarSpaceStationBuilder es una implementación de SpaceshipBuilder que construye una Base Espacial de Guerra.
 * Esta clase se encarga de ensamblar una nave espacial específica con los componentes necesarios para una Base Espacial de Guerra.
 */
public class WarSpaceStationBuilder implements SpaceshipBuilder {

    private Spaceship spaceship; // La nave espacial que se está construyendo

    /**
     * Constructor de WarSpaceStationBuilder. Inicializa una nueva instancia de Spaceship.
     */
    public WarSpaceStationBuilder() {
        this.spaceship = new Spaceship();
    }

    /**
     * Establece el blindaje de la nave.
     * 
     * @param armor El blindaje de la nave.
     * @return Esta instancia de WarSpaceStationBuilder.
     */
    @Override
    public SpaceshipBuilder setArmor(Armor armor) {
        spaceship.setArmor(armor);
        return this;
    }

    /**
     * Establece la cabina de la nave.
     * 
     * @param cockpit La cabina de la nave.
     * @return Esta instancia de WarSpaceStationBuilder.
     */
    @Override
    public SpaceshipBuilder setCockpit(Cockpit cockpit) {
        spaceship.setCockpit(cockpit);
        return this;
    }

    /**
     * Establece el sistema de propulsión de la nave.
     * 
     * @param propulsionSystem El sistema de propulsión de la nave.
     * @return Esta instancia de WarSpaceStationBuilder.
     */
    @Override
    public SpaceshipBuilder setPropulsionSystem(PropulsionSystem propulsionSystem) {
        spaceship.setPropulsionSystem(propulsionSystem);
        return this;
    }

    /**
     * Establece el arma de la nave.
     * 
     * @param weapon El arma de la nave.
     * @return Esta instancia de WarSpaceStationBuilder.
     */
    @Override
    public SpaceshipBuilder setWeapon(Weapon weapon) {
        spaceship.setWeapon(weapon);
        return this;
    }

    /**
     * Construye la nave espacial completa.
     * 
     * @return La nave espacial construida.
     */
    @Override
    public Spaceship build() {
        return spaceship;
    }
}
