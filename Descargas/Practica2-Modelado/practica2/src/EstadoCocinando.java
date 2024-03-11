/**
 * Este es el estado del robot mientras cocina la orden del cliente. Para ayudar al usuario a entender 
 * mejor los diferentes estados del robot, se ha incluido un modelo ASCII que representa cada uno de 
 * estos estados.
 */
class EstadoCocinando implements EstadoRobot{

    Robot robot;

    public EstadoCocinando(Robot robot){

        this.robot = robot;
    }

	/**
 	* Cuando el robot está en pleno proceso de cocción, no se requiere que el cliente lo active nuevamente, 
 	* que permanece ocupado en la tarea y no se suspenderá.
 	*/
    @Override
    public void activar(){

        System.out.println("El robot ya esta activo y cocinando");
        System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |      Lo bueno lleva su tiempo querido usuario :)");
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
 	* Durante el proceso de cocción, el robot no puede cambiar a su estado de "caminar", ya que esto podría 
 	* representar un riesgo para los clientes.
 	*/
    @Override
    public void caminar(){
        System.out.println("El robot no puede caminar mientras cocina");
        System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |     No me es permitido, podría ocasionar un accidente querido usuario ");
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
     	* Al llegar a la mesa del cliente, el robot inicia el proceso de atención al cliente y cambia su 
     	* estado a "atender". Sin embargo, sin una orden previa, el robot no puede comenzar a cocinar.
     	*/
    @Override
    public void atender(){

        System.out.println("La orden ya ha sido recibida, presione cocinar para empezar el proceso de cocina");
        System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |     Enseguida le traemos su rica Mcburger querido usuario ");
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
     	* Una vez que el robot ha recibido la orden del cliente, su estado cambia automáticamente a "cocinar". 
     	*/
    @Override
    public void cocinar(){

        System.out.println("Comenzando a cocinar su hamburguesa");
	    System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |      Su orden oficialmente está en proceso :)");
        System.out.println(" |    3000    |");
        System.out.println(" |____________|");
        System.out.println("   |  |  |  |");
        System.out.println("   |  |  |  |");
        System.out.println("   |  |  |  |");
        System.out.println("   |  |  |  |");
        System.out.println("  /|__|__|__|\\");
        System.out.println(" /____________\\");
        System.out.println("/______________\\");                                                                                                            

        robot.cocinar(robot.orden);
        System.out.println("Regresando a estado suspendido");
        System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |      *Estado de suspensión activado* ");
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

	/**
     	* Durante el proceso de cocina, el robot no puede suspenderse hasta que haya completado la orden del 
     	* cliente, de lo contrario, podría dejar la cocina encendida.
     	*/
    @Override
    public void suspender(){

        System.out.println("El robot no se puede suspender mientras cocina");
	    System.out.println("       __");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /        \\");
        System.out.println("  /__________\\");
        System.out.println(" |            |");
        System.out.println(" |    COOK    |");
        System.out.println(" |    Master  |      Tengo que acabar primero la orden y después descansaré ");
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
}
