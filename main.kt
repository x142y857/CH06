fun main(){
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if  (isJugglingProficient){
        swordsJuggling = 2
    }

    proficiencyCheck(swordsJuggling)
    swordsJuggling = swordsJuggling!!.plus(1)

    println("你雜耍 $swordsJuggling 把劍!")

}

fun proficiencyCheck(swordsJuggling: Int?){
    swordsJuggling ?: throw IllegalStateException("玩家不能雜耍劍")
}

class UnskilledSwordsJugglerException():
    IllegalStateException("玩家不能雜耍劍")

