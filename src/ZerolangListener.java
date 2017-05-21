// Generated from Zerolang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZerolangParser}.
 */
public interface ZerolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZerolangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ZerolangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZerolangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ZerolangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZerolangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ZerolangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZerolangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ZerolangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZerolangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ZerolangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZerolangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ZerolangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZerolangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ZerolangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZerolangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ZerolangParser.PrintContext ctx);
}