import kotlin.io.path.readLines
import kotlin.io.path.Path
import kotlin.math.abs

fun readinput(filename: String): List<String> = Path("C:/AoC2024/Day1/day_one/$filename").readLines()


fun main() {
    val lines = readinput("input.txt")
    val (left, right) = lines.map {line ->
        val first = line.substringBefore(" ").toInt()
        val second = line.substringAfterLast(" ").toInt()
        first to second
    }.unzip()

    val result = left.sorted().zip(right.sorted()).map {(first, second) ->
        abs(first - second)
    }.sum()

    println(result)
}
