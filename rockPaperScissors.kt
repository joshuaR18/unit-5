import kotlin.random.Random

fun main() {
    println("Let's play Rock, Paper, Scissors!")
    val computerChoice = Random.nextInt(1, 4)
    println("Enter your choice (1 for rock, 2 for paper, 3 for scissors):")
    val userChoice = readLine()?.toIntOrNull() ?: return
    val winner = determineWinner(userChoice, computerChoice)
    if (winner == 0) {
        println("It's a tie! Let's play again.")
    } else if (winner == 1) {
        println("You win! Congratulations!")
    } else {
        println("Sorry, you lose. Better luck next time.")
    }
}

fun determineWinner(userChoice: Int, computerChoice: Int): Int {
    if (userChoice == computerChoice) {
        return 0
    }
    if ((userChoice == 1 && computerChoice == 3) ||
        (userChoice == 2 && computerChoice == 1) ||
        (userChoice == 3 && computerChoice == 2)) {
        return 1
    }
    return -1
}
