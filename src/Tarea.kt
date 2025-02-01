import kotlin.random.Random

class Tarea(val descripcion: String) {

    var id: Int? = 0

    var estado: String = "Vacío"
        set(value){
            require(estado == "Pendiente" || estado == "Realizada" || estado == "Vacío"){ "El estado debe ser o pendiente o ralizada." }
            field = value
        }

    fun asignarIdentificador(): Boolean{
        println("Escoge enter elegirlo manualmente o aleatoriamente (1-2).")
        val decision = readln()
        when (decision) {
            "1" -> {
                println("Escriba un número para asignar a su tarea.")
                id = readLine()?.toIntOrNull() ?: return false
                println("Se ha asignado el ID: $id.")
                return true
            }
            "2" -> {
                id = Random.nextInt(1, 100)
                println("Se ha asignado el ID aleatorio: $id.")
                return true
            }
            else -> return false
        }
    }

    fun agregarEstado(){
        estado = "Pendiente"
        println("La tarea ahora está pendiente.")
    }

    fun eliminarEstado(){
        estado = "Vacío"
        println("Estado eliminado.")
    }


    fun cambiarEstado(fecha: String){
        println("Escriba el nuevo estado de su tarea: (Pendiente/Realizada)")
        val nuevoEstado = readln().replaceFirstChar { it.uppercase() }
        if (nuevoEstado == "Pendiente"){
            estado = nuevoEstado
            println("Nuevo estado actualizado (Pendiente).")
        } else if (nuevoEstado == "Realizada"){
            estado = nuevoEstado
            println("Nuevo estado actualizado (Realizada), $fecha.")
        } else {
            println("Nuevo estado inválido: ($nuevoEstado).")
        }
    }


}