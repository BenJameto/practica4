public class MilitaryTransportShipBuilder implements SpaceshipBuilder {

    private Spaceship spaceship;

    public MilitaryTransportShipBuilder(){
        this.spaceship = new Spaceship();
    }

    @Override
    public SpaceshipBuilder setArmor(Armor armor) {
        spaceship.setArmor(armor);
        return this;
    }

    @Override
    public SpaceshipBuilder setCockpit(Cockpit cockpit) {
        spaceship.setCockpit(cockpit);
        return this;
    }

    @Override
    public SpaceshipBuilder setPropulsionSystem(PropulsionSystem propulsionSystem) {
        spaceship.setPropulsionSystem(propulsionSystem);
        return this;
    }

    @Override
    public SpaceshipBuilder setWeapon(Weapon weapon) {
        spaceship.setWeapon(weapon);
        return this;
    }
    
    @Override
    public Spaceship build() {
        return spaceship;
    }
}
