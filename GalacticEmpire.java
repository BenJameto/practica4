import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GalacticEmpire {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingresa tu presupuesto: ");
        double budget = scanner.nextDouble();

        showAvailableComponents();
        UserPreferences userPreferences = getUserPreferences();

        SpaceshipBuilder builder = determineBuilder(userPreferences);
        Spaceship spaceship = buildSpaceship(builder, userPreferences);

        double cost = calculateCost(spaceship);

        if (cost <= budget) {
            System.out.println(
                    "Tu nave está lista para recoger, estas son sus características, paga en la caja la cantidad de $"
                            + cost);
            System.out.println(spaceship);
        } else {
            System.out.println(
                    "El costo de tu nave sobrepasa tu presupuesto. ¿Deseas diseñar otra nave o ver nuestro catálogo?");
            System.out.println("1. Diseñar otra nave");
            System.out.println("2. Ver catálogo");
            int choice = scanner.nextInt();
            if (choice == 1) {
                main(args); // Llamada recursiva para diseñar otra nave
            } else {
                showCatalog();
            }
        }
    }

    private static void showAvailableComponents() {
        System.out.println("Componentes disponibles:");

        System.out.println("\nSistemas de propulsión:");
        List<PropulsionSystem> propulsionSystems = Arrays.asList(
                new PropulsionSystem("Viaje intercontinental", "Propulsión para viajes intercontinentales", 1000),
                new PropulsionSystem("Viaje interplanetario", "Propulsión para viajes interplanetarios", 3000),
                new PropulsionSystem("Viaje intergaláctico", "Propulsión para viajes intergalácticos", 5000));
        for (int i = 0; i < propulsionSystems.size(); i++) {
            System.out.println((i + 1) + ". " + propulsionSystems.get(i));
        }

        System.out.println("\nBlindajes:");
        List<Armor> armors = Arrays.asList(
                new Armor("Simple", "Blindaje básico", 2000),
                new Armor("Reforzado", "Blindaje mejorado", 5000),
                new Armor("Fortaleza", "Blindaje altamente resistente", 10000));
        for (int i = 0; i < armors.size(); i++) {
            System.out.println((i + 1) + ". " + armors.get(i));
        }

        System.out.println("\nCabinas:");
        List<Cockpit> cockpits = Arrays.asList(
                new Cockpit("1 piloto", "Cabina para un solo piloto", 1000),
                new Cockpit("Tripulación pequeña", "Cabina para una tripulación pequeña", 2000),
                new Cockpit("Ejército", "Cabina para una tripulación grande", 5000));
        for (int i = 0; i < cockpits.size(); i++) {
            System.out.println((i + 1) + ". " + cockpits.get(i));
        }

        System.out.println("\nArmas:");
        List<Weapon> weapons = Arrays.asList(
                new Weapon("Láser simple", "Láser de baja potencia", 2000),
                new Weapon("Misiles de plasma", "Misiles de alta potencia", 5000),
                new Weapon("Láser destructor de planetas", "Láser capaz de destruir planetas", 20000));
        for (int i = 0; i < weapons.size(); i++) {
            System.out.println((i + 1) + ". " + weapons.get(i));
        }
    }

    private static UserPreferences getUserPreferences() {
        UserPreferences userPreferences = new UserPreferences();

        System.out.println("\nSelecciona el sistema de propulsión:");
        int choice = scanner.nextInt();
        PropulsionSystem propulsionSystem = getComponentByIndex(choice, "PropulsionSystem");
        userPreferences.setPropulsionSystem(propulsionSystem);

        System.out.println("\nSelecciona el blindaje:");
        choice = scanner.nextInt();
        Armor armor = getComponentByIndex(choice, "Armor");
        userPreferences.setArmor(armor);

        System.out.println("\nSelecciona la cabina:");
        choice = scanner.nextInt();
        Cockpit cockpit = getComponentByIndex(choice, "Cockpit");
        userPreferences.setCockpit(cockpit);

        System.out.println("\nSelecciona el arma:");
        choice = scanner.nextInt();
        Weapon weapon = getComponentByIndex(choice, "Weapon");
        userPreferences.setWeapon(weapon);

        return userPreferences;
    }

    private static SpaceshipBuilder determineBuilder(UserPreferences preferences) {
        // Determinar el builder adecuado según las preferencias del usuario
        return new IndividualCombatShipBuilder();
    }

    private static Spaceship buildSpaceship(SpaceshipBuilder builder, UserPreferences preferences) {
        // Construir la nave espacial según las preferencias del usuario
        return builder
                .setPropulsionSystem(preferences.getPropulsionSystem())
                .setArmor(preferences.getArmor())
                .setCockpit(preferences.getCockpit())
                .setWeapon(preferences.getWeapon())
                .build();
    }

    private static double calculateCost(Spaceship spaceship) {
        // Calcular el costo total de la nave espacial
        return spaceship.getPropulsionSystem().getPrice() +
                spaceship.getArmor().getPrice() +
                spaceship.getCockpit().getPrice() +
                spaceship.getWeapon().getPrice();
    }

    private static void showCatalog() {
        System.out.println("Catálogo de naves predefinidas:");
        System.out.println("1. Nave individual de combate");
        System.out.println("2. Nave militar de transporte");
        System.out.println("3. Base espacial de guerra");
        System.out.print("Ingresa el número de la nave que deseas: ");
        int choice = scanner.nextInt();

        Spaceship selectedSpaceship;
        switch (choice) {
            case 1:
                selectedSpaceship = buildIndividualCombatShip();
                break;
            case 2:
                selectedSpaceship = buildMilitaryTransportShip();
                break;
            case 3:
                selectedSpaceship = buildWarSpaceStation();
                break;
            default:
                System.out.println("Opción inválida. Saliendo del programa.");
                return;
        }

        double cost = calculateCost(selectedSpaceship);
        System.out.println("La nave seleccionada tiene un costo de $" + cost);
        System.out.println("Detalles de la nave:");
        System.out.println(selectedSpaceship);
    }

    private static <T> T getComponentByIndex(int index, String componentType) {
        switch (componentType) {
            case "PropulsionSystem":
                List<PropulsionSystem> propulsionSystems = Arrays.asList(
                        new PropulsionSystem("Viaje intercontinental", "Propulsión para viajes intercontinentales",
                                1000),
                        new PropulsionSystem("Viaje interplanetario", "Propulsión para viajes interplanetarios", 3000),
                        new PropulsionSystem("Viaje intergaláctico", "Propulsión para viajes intergalácticos", 5000));
                return (T) propulsionSystems.get(index - 1);
            case "Armor":
                List<Armor> armors = Arrays.asList(
                        new Armor("Simple", "Blindaje básico", 2000),
                        new Armor("Reforzado", "Blindaje mejorado", 5000),
                        new Armor("Fortaleza", "Blindaje altamente resistente", 10000));
                return (T) armors.get(index - 1);
            case "Cockpit":
                List<Cockpit> cockpits = Arrays.asList(
                        new Cockpit("1 piloto", "Cabina para un solo piloto", 1000),
                        new Cockpit("Tripulación pequeña", "Cabina para una tripulación pequeña", 2000),
                        new Cockpit("Ejército", "Cabina para una tripulación grande", 5000));
                return (T) cockpits.get(index - 1);
            case "Weapon":
                List<Weapon> weapons = Arrays.asList(
                        new Weapon("Láser simple", "Láser de baja potencia", 2000),
                        new Weapon("Misiles de plasma", "Misiles de alta potencia", 5000),
                        new Weapon("Láser destructor de planetas", "Láser capaz de destruir planetas", 20000));
                return (T) weapons.get(index - 1);
            default:
                System.out.println("Tipo de componente no válido.");
                return null;
        }
    }

    private static Spaceship buildIndividualCombatShip() {
        SpaceshipBuilder builder = new IndividualCombatShipBuilder();
        return builder
                .setPropulsionSystem(
                        new PropulsionSystem("Viaje intergaláctico", "Propulsión para viajes intergalácticos", 5000))
                .setArmor(new Armor("Fortaleza", "Blindaje altamente resistente", 10000))
                .setCockpit(new Cockpit("1 piloto", "Cabina para un solo piloto", 1000))
                .setWeapon(new Weapon("Láser destructor de planetas", "Láser capaz de destruir planetas", 20000))
                .build();
    }

    private static Spaceship buildMilitaryTransportShip() {
        SpaceshipBuilder builder = new MilitaryTransportShipBuilder();
        return builder
                .setPropulsionSystem(
                        new PropulsionSystem("Viaje interplanetario", "Propulsión para viajes interplanetarios", 3000))
                .setArmor(new Armor("Reforzado", "Blindaje mejorado", 5000))
                .setCockpit(new Cockpit("Tripulación pequeña", "Cabina para una tripulación pequeña", 2000))
                .setWeapon(new Weapon("Misiles de plasma", "Misiles de alta potencia", 5000))
                .build();
    }

    private static Spaceship buildWarSpaceStation() {
        SpaceshipBuilder builder = new WarSpaceStationBuilder();
        return builder
                .setPropulsionSystem(new PropulsionSystem("Viaje intercontinental",
                        "Propulsión para viajes intercontinentales", 1000))
                .setArmor(new Armor("Fortaleza", "Blindaje altamente resistente", 10000))
                .setCockpit(new Cockpit("Ejército", "Cabina para una tripulación grande", 5000))
                .setWeapon(new Weapon("Láser destructor de planetas", "Láser capaz de destruir planetas", 20000))
                .build();
    }
}