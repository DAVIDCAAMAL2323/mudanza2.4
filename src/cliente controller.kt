class ClienteController {
    private val clientes = mutableListOf<Cliente>()

    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun obtenerClientes(): List<Cliente> {
        return clientes
    }
}
