/**
 * En este estado, el robot está inactivo y solo se puede poner en marcha. Para ayudar al usuario a 
 * entender esta situación, se ha añadido una representación visual en forma de un modelo de robot en 
 * ASCII. Esto permite al usuario ver los diversos estados de inactividad en los que el robot no puede 
 * realizar ciertas acciones.
 */

class EstadoSuspendido implements EstadoRobot{

    Robot robot;

    public EstadoSuspendido(Robot robot){

        this.robot = robot;
    }

	/**
 	* El robot debe estar encendido todo el tiempo esperando a que un cliente lo active, pero si no está trabajando puede estar suspendido. 
 	*/
    @Override
    public void activar(){

        System.out.println("El robot ha sido activado, comenzando a caminar hacia el cliente");
		System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |        Voy más rapido que flash");
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
        
        robot.setState(robot.getEstadoCaminando());
    }


	/**
 	* El robot se encuentra suspendido por lo que no puede cambiar de estado a caminar 
 	*/
    @Override
    public void caminar(){

        System.out.println("El robot no puede caminar mientras esta suspendido, seleccione la opcion de activar");
		System.out.println(" Z Z z z z z z z ");
		System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
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
 	* El robot se encuentra suspendido por lo que no puede cambiar de estado a atender
 	*/
    @Override
    public void atender(){

        System.out.println("El robot no lo puede atender mientras esta suspendido, seleccione la opcion de activar");
		System.out.println(" Z Z z z z z z z ");
		System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
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
 	* El robot se encuentra suspendido por lo que no puede cambiar de estado a cocinar
 	*/
    @Override
    public void cocinar(){

        System.out.println("El robot no puede cocinar mientras esta suspendido, seleccione la opcion de activar");
		System.out.println(" Z Z z z z z z z ");
	    System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
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
 	* El robot se encuentra suspendido por lo que no es necesario suspenderlo de nuevo
 	*/
    public void suspender(){

        System.out.println("El robot ya se encuentra suspendido");
		System.out.println(" Z Z z z z z z z ");
	    System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |        Esto tambien cansa,dejen dormir en paz ");
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

