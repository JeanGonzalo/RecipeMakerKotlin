fun main() {

    val listRecipeMaker = listOf(
        ":: Bienvenido a Recipe Maker ::", ":: Selecciona la opción deseada ::",
        "[1] Hacer una receta", "[2] Ver mis recetas", "[3] Salir"    )
    val listIngredents= listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    val listAddIngredients:MutableList<String> = mutableListOf()
    listRecipeMaker.forEach() {
        println(it)
    }
    var num:Int?
    prime@do {
        print(":: Ingrese Opción 1 - 3 :: -> ")
        num= readLine()!!.toInt()
        if(num==1) {
            for ((index, ingredients) in listIngredents.withIndex()) {
                println("[${index.plus(1)}] -> $ingredients")
            }
            do {
                println(":::: Pulse 9 para Salir ::::")
                print(":::: Ingrese Opción 1 - 8 :::: -> ")
                val numIng: Int? = readLine()?.toInt()
                when (numIng) {
                    in 1..8 -> {
                        for ((index, ingredients) in listIngredents.withIndex()) {
                            if (numIng != null) {
                                if (numIng.equals(index.plus(1))) {
                                    listAddIngredients.add(listIngredents[index])
                                }
                            }
                        }
                    }
                    else -> {


                        println("Ingrese un numero entre el 1 al 8\n")
                    }
                }
            } while (numIng != 9)
        }
        else if (num==2){
            println("Lista de ingredientes : ")
            listAddIngredients.forEach(){
                println(it)
            }
        }
        else if (num==3){break@prime }
    }while (num!=3)
}