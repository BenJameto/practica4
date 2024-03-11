/**
 * Interfaz para implementar los estados del robot COOK MASTER 3000
 */
interface EstadoRobot{

    public void activar();

    public void caminar();

    public void atender();

    public void cocinar();

    public void suspender();
}