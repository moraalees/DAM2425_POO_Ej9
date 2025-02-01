import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun mostrarMenu(){
    println("1. Agregar estado a tarea")
    println("2. Eliminar estado a tarea")
    println("3. Cambiar estado a tarea")
    println("4. Agregar tarea a la lista")
    println("5. Mostrar tareas")
    println("6. Eliminar tarea de la lista")
    println("7. Mostrar tareas pendientes")
    println("8. Mostrar tareas realizadas")
    println("9. Salir")
}


fun main() {
    val fechaHoraActual: LocalDateTime = LocalDateTime.now()
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val fechaFormateada: String = fechaHoraActual.format(formatter)

    val tarea1 = Tarea("Limpiar el polvo de la casa")
    tarea1.asignarIdentificador()
    val tarea2 = Tarea("Cambiar el color de la habitación")
    tarea2.asignarIdentificador()
    val tarea3 = Tarea("Regar las plantas")
    tarea3.asignarIdentificador()
    val tarea4 = Tarea("Hacer la compra")
    tarea4.asignarIdentificador()
    val tarea5 = Tarea("Hacer los ejercicios de Kotlin")
    tarea5.asignarIdentificador()

    //He intentado hacer el menú, pero no sé hacerlo en Kotlin

    val lista1 = ListaTarea("Lista de tareas 1")
    lista1.agregarTarea(tarea1)
    lista1.agregarTarea(tarea2)
    lista1.agregarTarea(tarea3)
    lista1.agregarTarea(tarea4)
    lista1.agregarTarea(tarea5)
    lista1.mostrarLista()

    tarea1.agregarEstado()
    tarea3.agregarEstado()
    tarea4.agregarEstado()
    tarea2.eliminarEstado()
    tarea5.cambiarEstado(fechaFormateada)

    lista1.tareasPendientes()
    lista1.tareasRealizadas()
}