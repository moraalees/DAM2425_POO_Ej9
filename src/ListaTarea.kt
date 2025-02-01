class ListaTarea(val nombre: String) {
    val listaTareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea): Boolean{
        for (tareaLista in listaTareas){
            if (tareaLista.id == tarea.id){
                println("No se puede añadir la tarea ya que su ID coincide con uno de la lista.")
                return false
            }
        }
        listaTareas.add(tarea)
        println("Tarea agregada a la lista con éxito.")
        return true
    }


    fun eliminarTarea(tarea: Tarea){
        if (tarea in listaTareas){
            listaTareas.remove(tarea)
            println("Tarea eliminada de la lista con éxito.")
        } else {
            println("La tarea no está en la lista, por tanto no hay nada que eliminar...")
        }
    }


    fun mostrarLista(){
        for (tarea in listaTareas){
            println("${tarea.descripcion}: ${tarea.estado}")
        }
    }

    fun tareasRealizadas(){
        for (tarea in listaTareas){
            if (tarea.estado == "Realizada"){
                println("Tarea realizada: ${tarea.descripcion}")
            }
        }
    }

    fun tareasPendientes(){
        for (tarea in listaTareas){
            if (tarea.estado == "Pendiente"){
                println("Tarea pendiente: ${tarea.descripcion}")
            }
        }
    }

}
