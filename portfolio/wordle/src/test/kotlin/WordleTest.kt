import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotContain

@Suppress("unused")
class WordleTest : StringSpec({
    "1: A 5 letter word should return the boolean value of true"{
        isValid("bread") shouldBe true 
    }
    
    "A word that doesn't have 5 letters should return false"{
        isValid("peas") shouldBe false
    }

    "2: All the words should be read from words.txt and added to a mutable list"{
        val filename = "data/words.txt"
        val words = readWordList(filename)
        words.size shouldBe 2315
        words[0] shouldBe "ABACK"
    }
    
    "3: A random word should be picked from the list and then removed"{
        val words = mutableListOf("bread", "thyme", "clove")
        val word = pickRandomWord(words)

        words.shouldNotContain(word)
    
    }

    "4: The list should contain all 1's when the guess matches the target"{
        evaluateGuess("bread", "bread") shouldBe listOf(1,1,1,1,1)
    }

    "The list should contain a mixture of 1's and 0's when partially correct"{
        evaluateGuess("bread","beers") shouldBe listOf(1,0,1,0,0)
    }

    "The list should contain all 0's when the guess doesn't match the target in any place"{
        evaluateGuess("bread","thyme") shouldBe listOf(0,0,0,0,0)
    }
})
