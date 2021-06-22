fun main(){
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if  (isJugglingProficient){
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e:Exception){
        println(e)
    }

    proficiencyCheck(swordsJuggling)
    swordsJuggling = swordsJuggling!!.plus(1)

    println("你雜耍 $swordsJuggling 把劍!")

}

fun proficiencyCheck(swordsJuggling: Int?){
    swordsJuggling ?: throw UnskilledSwordsJugglerException()
}

class UnskilledSwordsJugglerException():
    IllegalStateException("玩家不能雜耍劍")

