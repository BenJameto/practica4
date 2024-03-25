/**
 * La interfaz SpaceshipBuilder define los métodos necesarios para construir diferentes tipos de naves espaciales.
 * Cada implementación de esta interfaz será responsable de construir un tipo específico de nave.
 */
public interface SpaceshipBuilder {

    /**
     * Configura el sistema de propulsión de la nave.
     * 
     * @param propulsionSystem El sistema de propulsión de la nave.
     * @return El objeto SpaceshipBuilder para permitir el encadenamiento de métodos.
     */
    SpaceshipBuilder setPropulsionSystem(PropulsionSystem propulsionSystem);

    /**
     * Configura el blindaje de la nave.
     * 
     * @param armor El blindaje de la nave.
     * @return El objeto SpaceshipBuilder para permitir el encadenamiento de métodos.
     */
    SpaceshipBuilder setArmor(Armor armor);

    /**
     * Configura la cabina de la nave.
     * 
     * @param cockpit La cabina de la nave.
     * @return El objeto SpaceshipBuilder para permitir el encadenamiento de métodos.
     */
    SpaceshipBuilder setCockpit(Cockpit cockpit);

    /**
     * Configura el arma de la nave.
     * 
     * @param weapon El arma de la nave.
     * @return El objeto SpaceshipBuilder para permitir el encadenamiento de métodos.
     */
    SpaceshipBuilder setWeapon(Weapon weapon);

    /**
     * Construye la nave espacial utilizando los componentes configurados.
     * 
     * @return La nave espacial construida.
     */
    Spaceship build();
}
