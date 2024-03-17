class SolicitudMudanzaController {
    private val solicitudes = mutableListOf<SolicitudMudanza>()

    fun agregarSolicitud(solicitud: SolicitudMudanza) {
        solicitudes.add(solicitud)
    }

    fun obtenerSolicitudes(): List<SolicitudMudanza> {
        return solicitudes
    }
}
