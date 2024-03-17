class EmpleadoController {
    private val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun obtenerEmpleados(): List<Empleado> {
        return empleados
    }
}
