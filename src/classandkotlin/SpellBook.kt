package classandkotlin

import java.io.IOException
import kotlin.jvm.Throws

class SpellBook {
    companion object {
        @JvmField
        val MAX_SPELL_COUNT = 1000

        @JvmStatic
        fun getSpellbookGreeting() = println("this is a  companion object function")
    }


    @JvmField
    var spells = listOf("Magic ms .L", "Lay on Hans")

    @Throws(IOException::class)
    fun accecptException(): Unit = throw IOException()
}