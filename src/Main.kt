fun main() {
    val clienteController = ClienteController()
    val empleadoController = EmpleadoController()
    val solicitudMudanzaController = SolicitudMudanzaController()

    // Agregar clientes y empleados (se simula la entrada de datos)
    clienteController.agregarCliente(Cliente(1, "", ""))
    clienteController.agregarCliente(Cliente(2, "", ""))

    empleadoController.agregarEmpleado(Empleado(1, "", ""))
    empleadoController.agregarEmpleado(Empleado(2, "", ""))

    // Simular solicitud de mudanza
    val cliente = clienteController.obtenerClientes().first()
    val repartidor = empleadoController.obtenerEmpleados().first()
    val solicitudMudanza = SolicitudMudanza(1, cliente, repartidor, "", "")