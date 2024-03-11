/*
 * Clase que representa al robot encargado de la cocina en Macburgers.
 */
class Robot{

    // Atributo para almacenar la orden recibida del cliente para comenzar a cocinar
    public Mcburguesa orden;
    
    // Estado actual del robot 
    private EstadoRobot estadoActual;

    // Menú del día
    private Menu menuDelDia;
    
    // Menú general
    private Menu menuGeneral;
    
    // Menú de lujo
    private Menu menuDeLujo;

    // Estado del robot: suspendido
    private EstadoRobot estadoSuspendido;
    
    // Estado del robot: caminando
    private EstadoRobot estadoCaminando;
    
    // Estado del robot: atendiendo
    private EstadoRobot estadoAtendiendo;
    
    // Estado del robot: cocinando
    private EstadoRobot estadoCocinando;


        /**
     * Constructor para inicializar el robot.
     * Se establecen los estados y los menús disponibles.
     */
    public Robot(){
        // Estados del robot
        estadoSuspendido = new EstadoSuspendido(this);
        estadoCaminando = new EstadoCaminando(this);
        estadoAtendiendo = new EstadoAtendiendo(this);
        estadoCocinando = new EstadoCocinando(this);

        estadoActual = estadoSuspendido;
        orden = null;

        // Menús disponibles
        this.menuGeneral = new MenuGeneral();
        this.menuDelDia = new MenuDelDia();
        this.menuDeLujo = new MenuDeLujo();
    }

    /**
     * Obtiene el estado actual del robot y verifica si está suspendido.
     */
    public EstadoRobot getEstadoSuspendido(){
        return this.estadoSuspendido;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está caminando.
     */
    public EstadoRobot getEstadoCaminando(){
        return this.estadoCaminando;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está atendiendo.
     */
    public EstadoRobot getEstadoAtendiendo(){
        return this.estadoAtendiendo;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está cocinando.
     */
    public EstadoRobot getEstadoCocinando(){
        return this.estadoCocinando;
    }

    /**
     * Cambia el estado del robot.
     */
    public void setState(EstadoRobot nuevoEstado){
        this.estadoActual = nuevoEstado;
    }

    /**
     * Activa el robot.
     */
    public void activar(){
        estadoActual.activar();
    }

    /**
     * El robot comienza a caminar.
     */
    public void caminar(){
        estadoActual.caminar();
    }

    /**
     * El robot inicia la atención al cliente.
     */
    public void atender(){
        estadoActual.atender();
    }

    /**
     * El robot comienza a cocinar.
     */
    public void cocinar(){
        estadoActual.cocinar();
    }

    /**
     * El robot cocina una hamburguesa.
     * @param ham Hamburguesa a cocinar.
     */
    public void cocinar(Mcburguesa ham){
        Burguer mac;
        if(ham.getVegetariana()){
            mac = new VeganBurguer(ham);
        }else{
            mac = new NormalBurguer(ham);
        }
    }

    /**
     * El robot se suspende.
     */
    public void suspender(){
        estadoActual.suspender();
    }

        /**
     * Imprime el menú del restaurante, incluyendo los menús general, del día y de lujo.
     */
    public void imprimirMenuCompleto() {
        // Iteradores para cada tipo de menú
        MyIterator iteradorGeneral = menuGeneral.createIterator();
        MyIterator iteradorDelDia = menuDelDia.createIterator();
        MyIterator iteradorDeLujo = menuDeLujo.createIterator();

        // Imprimir menú general
        System.out.println("---- Menú General ----");
        imprimirMenu(iteradorGeneral);

        // Imprimir menú del día
        System.out.println("---- Menú del Día ----");
        imprimirMenu(iteradorDelDia);

        // Imprimir menú de lujo
        System.out.println("---- Menú de Lujo ----");
        imprimirMenu(iteradorDeLujo);
    }

    /**
     * Imprime los productos de un menú específico utilizando el iterador proporcionado.
     * @param iterador El iterador a utilizar para recorrer el menú.
     */
    public void imprimirMenu(MyIterator iterador) {
        while (iterador.hasNext()) {
            // Obtener la siguiente Mcburguesa del menú
            Mcburguesa hamburguesa = (Mcburguesa) iterador.next();
            // Extraer información de la hamburguesa
            String id = hamburguesa.getId();
            String nombre = hamburguesa.getNombre();
            String descripcion = hamburguesa.getDescripcion();
            System.out.println(id + " " + nombre + "\n" + descripcion);
        }
    }

    /**
     * Busca los productos de un menú específico utilizando su identificador.
     * @param id El identificador del producto a buscar.
     * @throws InvalidIdException Si el identificador no es válido o no se encuentra en el menú.
     */
    public void buscarHamburguesa(String id) throws InvalidIdException {
        MyIterator iteradorGeneral = menuGeneral.createIterator();
        MyIterator iteradorDelDia = menuDelDia.createIterator();
        MyIterator iteradorDeLujo = menuDeLujo.createIterator();

        while (iteradorGeneral.hasNext()) {
            Mcburguesa hamburguesa = (Mcburguesa) iteradorGeneral.next();
            if (id.equals(hamburguesa.getId())) {
                this.orden = hamburguesa;
                return;
            }
        }

        while (iteradorDelDia.hasNext()) {
            Mcburguesa hamburguesa = (Mcburguesa) iteradorDelDia.next();
            if (id.equals(hamburguesa.getId())) {
                this.orden = hamburguesa;
                return;
            }
        }

        while (iteradorDeLujo.hasNext()) {
            Mcburguesa hamburguesa = (Mcburguesa) iteradorDeLujo.next();
            if (id.equals(hamburguesa.getId())) {
                this.orden = hamburguesa;
                return;
            }
        }

        throw new InvalidIdException();
    }
}
