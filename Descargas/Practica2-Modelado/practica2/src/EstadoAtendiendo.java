
/**
 * Estado en el que el robot está habilitado para atender al cliente. Solo se puede activar en este estado.
 
 */
import java.util.Scanner;

class EstadoAtendiendo implements EstadoRobot {
    Robot robot;

    public EstadoAtendiendo(Robot robot) {
        this.robot = robot;
    }

    /**
     * Método activar(): se imprime un mensaje indicando que el robot está activado y atendiendo al cliente.
 
     */
    @Override
    public void activar() {
        System.out.println("El robot está activado y actualmente está atendiendo al cliente.");
        System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |     Bienvenido querido usuario a su lugar favorito");
        System.out.println(" |    3000    |                    McBurguesas");
        System.out.println(" |____________|");
        System.out.println("   |  |  |  |");
        System.out.println("   |  |  |  |");
        System.out.println("   |  |  |  |");
        System.out.println("   |  |  |  |");
        System.out.println("  /|__|__|__|\\");
        System.out.println(" /____________\\");
        System.out.println("/______________\\");
    }



	/**
 * Cuando el robot está atendiendo a un cliente, no puede cambiar su estado a caminar para evitar ser grosero.
 */
@Override
public void caminar() {
    System.out.println("El robot no puede caminar mientras está atendiendo a un cliente.");
    System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |");
    System.out.println(" |    Master  |     Prefiero no seguir modas, como el multitasking.");
    System.out.println(" |    3000    |                    :)");
    System.out.println(" |____________|");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("  /|__|__|__|\\");
    System.out.println(" /____________\\");
    System.out.println("/______________\\");
}

/**
 * Muestra el menú al cliente para que pueda elegir su pedido mientras el robot lo atiende.
 */
public void atender() {
    System.out.println("Comenzando a leer el menú.");
    System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |       ------------------------");
    System.out.println(" |    Master  |-------|        MENÚ           |");
    System.out.println(" |    3000    |       ------------------------ ");
    System.out.println(" |____________|");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("  /|__|__|__|\\");
    System.out.println(" /____________\\");
    System.out.println("/______________\\");
    robot.printMenu();

    Scanner scanner = new Scanner(System.in);
    String id;
    while (true) {
        try {
            System.out.println("Ingrese el ID de la hamburguesa deseada:");
            id = scanner.nextLine();
            robot.findBurguer(id);
            System.out.println("Hamburguesa válida, pasando al estado de Cocinando.");
            break;
        } catch (InvalidIdException e) {
            System.out.println("El ID ingresado no es válido. Por favor, inténtelo de nuevo.");
        } catch (Exception e) {
            System.out.println("Asegúrese de ingresar un número. Por favor, inténtelo de nuevo.");
        }
    }
    robot.setState(robot.getEstadoCocinando());
}



/**
 * Cuando el robot está atendiendo a un cliente, no puede cambiar su estado a cocinar sin tener una orden previa.
 */
public void cocinar() {
    System.out.println("El robot no puede cocinar sin una orden recibida.");
    System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |       Aún no tengo la facultad de leer mentes, por favor haga un pedido.");
    System.out.println(" |    Master  |");
    System.out.println(" |    3000    |");
    System.out.println(" |____________|");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("  /|__|__|__|\\");
    System.out.println(" /____________\\");
    System.out.println("/______________\\");
}

/**
 * El robot no puede suspenderse mientras atiende a un cliente para evitar ser grosero y asegurarse de que el cliente sea atendido correctamente.
 */
public void suspender() {
    System.out.println("El robot no puede suspenderse mientras atiende a un cliente.");
    System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |       Tengo que terminar de atender a un cliente antes de descansar.");
    System.out.println(" |    Master  |");
    System.out.println(" |    3000    |");
    System.out.println(" |____________|");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("   |  |  |  |");
    System.out.println("  /|__|__|__|\\");
    System.out.println(" /____________\\");
    System.out.println("/______________\\");
}

