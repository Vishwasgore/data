import scala.io.StdIn

object calculator{
    def main(args: Array[String]): Unit ={
        println("Enter a first Number:")
        val num1 = StdIn.readDouble()

        println("Enter a operator:")
        val op = StdIn.readChar()

        println("Enter a second Number:")
        val num2 = StdIn.readDouble()

        val result = op match{
            case '+' => num1 + num2
            case '-' => num1 - num2
            case '*' => num1 * num2
            case '/' => num1 / num2
            case _ => "Invalid Operator"
        }
        println(s"The Result is: $result")
    }
}