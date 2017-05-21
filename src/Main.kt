import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileInputStream

fun main(args: Array<String>) {
    val sourceCode = "code.zl"
    val input = ANTLRInputStream(FileInputStream(sourceCode))

    val lexer = ZerolangLexer(input)
    val parser = ZerolangParser(CommonTokenStream(lexer))
    parser.addParseListener(MyListener())

    parser.program()
}