// Esta clase será responsable de construir diferentes tipos de naves espaciales. 
//Tendrá métodos para configurar los diferentes componentes de la nave.
public interface SpaceshipBuilder {
    SpaceshipBuilder setPropulsionSystem(PropulsionSystem propulsionSystem);
    SpaceshipBuilder setArmor(Armor armor);
    SpaceshipBuilder setCockpit(Cockpit cockpit);
    SpaceshipBuilder setWeapon(Weapon weapon);
    Spaceship build();
}