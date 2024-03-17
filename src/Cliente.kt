class Cliente(val id: Int, val nombre: String, val direccion: String)

data class Empleado(val id: Int, val nombre: String, val cargo: String)

data class SolicitudMudanza(val id: Int, val cliente: Cliente, val repartidor: Empleado, val fecha: String, val detalles: String)
