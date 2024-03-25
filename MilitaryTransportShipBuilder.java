/**
 * La clase MilitaryTransportShipBuilder implementa la interfaz SpaceshipBuilder y es responsable de construir una nave espacial de transporte militar. 
 * Proporciona métodos para configurar los diferentes componentes de la nave, como blindaje, cabina, sistema de propulsión y arma.
 */
public class MilitaryTransportShipBuilder implements SpaceshipBuilder {

    private Spaceship spaceship; // La nave espacial que se está construyendo.

    /**
     * Crea un nuevo constructor de nave espacial de transporte militar y inicializa la nave espacial.
     */
    public MilitaryTransportShipBuilder(){
        this.spaceship = new Spaceship();
    }

    /**
     * Establece el blindaje de la nave espacial.
     * 
     * @param armor El blindaje a establecer.
     * @return Esta instancia del constructor de nave espacial de transporte militar.
     */
    @Override
    public SpaceshipBuilder setArmor(Armor armor) {
        spaceship.setArmor(armor);
        return this;
    }

    /**
     * Establece la cabina de la nave espacial.
     * 
     * @param cockpit La cabina a establecer.
     * @return Esta instancia del constructor de nave espacial de transporte militar.
     */
    @Override
    public SpaceshipBuilder setCockpit(Cockpit cockpit) {
        spaceship.setCockpit(cockpit);
        return this;
    }

    /**
     * Establece el sistema de propulsión de la nave espacial.
     * 
     * @param propulsionSystem El sistema de propulsión a establecer.
     * @return Esta instancia del constructor de nave espacial de transporte militar.
     */
    @Override
    public SpaceshipBuilder setPropulsionSystem(PropulsionSystem propulsionSystem) {
        spaceship.setPropulsionSystem(propulsionSystem);
        return this;
    }

    /**
     * Establece el arma de la nave espacial.
     * 
     * @param weapon El arma a establecer.
     * @return Esta instancia del constructor de nave espacial de transporte militar.
     */
    @Override
    public SpaceshipBuilder setWeapon(Weapon weapon) {
        spaceship.setWeapon(weapon);
        return this;
    }
    
    /**
     * Construye y devuelve la nave espacial de transporte militar configurada.
     * 
     * @return La nave espacial de transporte militar construida.
     */
    @Override
    public Spaceship build() {
        return spaceship;
    }
}

