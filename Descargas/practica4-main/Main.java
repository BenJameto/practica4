public class Main {
    public static void main(String[] args) {
        SpaceshipBuilder builder = new IndividualCombatShipBuilder();
        
        Spaceship spaceship = builder
                              .setPropulsionSystem(new PropulsionSystem("viaje intergalactico", "propulsion para viajes intergalacticos", 5000))
                              .setArmor(new Armor("fortaleza", "blindaje altamente resistente", 10000))
                              .setCockpit(new Cockpit("tripulacion pequegna", "cabina para pocos pasajeros", 2000))
                              .setWeapon(new Weapon("laser destructor de planetas", "laser capaz de destruir planetas", 20000))
                              .build();
        
        System.out.println(spaceship);
    }
}
