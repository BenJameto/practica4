/**
 * Estado del robot mientras esta caminando hasta llegar al cliente y atenderlo o en su defecto, ser suspendido
 * Para la comodidad del usuario se ha agregado un modelo de un robot en ascii para su mejor entendimiento
 * el cual ilustra cada uno de los estados posibles del robot mientras camina.
 */

 class EstadoCaminando implements EstadoRobot{

    Robot robot;

    public EstadoCaminando(Robot robot){

        this.robot = robot;
    }

	/**
     	* El robot permanece encendido en todo momento, listo para ser activado por un cliente. 
     	  Sin embargo, si no tiene trabajo pendiente, puede suspenderse para ahorrar energía.
     	*/
    @Override
    public void activar(){

        System.out.println("El robot ya esta activado y caminando hacia el cliente");
	System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |    *Proceso de despertar en ejecución* ");
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
     	* Cuando el robot está activado, debe dirigirse a la mesa del cliente, lo que implica cambiar su 
     	* estado a "caminar".
     	*/
    @Override
    public void caminar(){

        System.out.println("El robot ya esta caminando hacia el cliente, presionar atender");
	System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |    *Corriendo hacia el cliente* ");
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
     * Una vez que el robot llega a la mesa del cliente, comienza a atender al cliente 
     * y cambia su estado a "atendiendo".
     */
    @Override
    public void atender(){

        System.out.println("El robot ha llegado al cliente, por favor presiones atender de nuevo para mostrarle el menu");
        System.out.println("   __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |    ¿Qué le gustaría ordenar querido usuario? ");
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

        robot.setState(robot.getEstadoAtendiendo());
    }
	 
	/**
	* Mientras el robot está ocupado cocinando, no puede abandonar su tarea para dirigirse 
	* a la mesa y atender al cliente.
	*/
    @Override
    public void cocinar(){

        System.out.println("Cocinar mientras el robot camina no es una buena idea, en cuanto el robot llegue lo atenderá con gusto");
    System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |    Espere a que termine de cocinar usuario,no tengo la facultad de hacer ambas cosas aún ");
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
	* Durante el proceso de caminata, el robot tiene la opción de suspenderse si es necesario.
	*/

    @Override
    public void suspender(){

        System.out.println("Proceso de suspensión del robot en... \n 3... \n 2... \n 1... \n Robot suspendido");
    System.out.println("       __");
    System.out.println("      /  \\");
    System.out.println("     /    \\");
    System.out.println("    /      \\");
    System.out.println("   /        \\");
    System.out.println("  /__________\\");
    System.out.println(" |            |");
    System.out.println(" |    COOK    |    *Se duerme* ");
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
        robot.setState(robot.getEstadoSuspendido());
    }
 }
