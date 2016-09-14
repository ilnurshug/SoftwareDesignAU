// Generated from /Users/leonid/University/SoftwareDesign/Shell/src/main/kotlin/ru/mit/spbau/softwaredesign/shell/parser/Shell.g4 by ANTLR 4.5.3
package ru.mit.spbau.softwaredesign.shell.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShellParser}.
 */
public interface ShellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShellParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ShellParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ShellParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ShellParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ShellParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ShellParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ShellParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#strong_string}.
	 * @param ctx the parse tree
	 */
	void enterStrong_string(ShellParser.Strong_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#strong_string}.
	 * @param ctx the parse tree
	 */
	void exitStrong_string(ShellParser.Strong_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#weak_string}.
	 * @param ctx the parse tree
	 */
	void enterWeak_string(ShellParser.Weak_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#weak_string}.
	 * @param ctx the parse tree
	 */
	void exitWeak_string(ShellParser.Weak_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ShellParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ShellParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ShellParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ShellParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ShellParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ShellParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(ShellParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(ShellParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(ShellParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(ShellParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ShellParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ShellParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ShellParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ShellParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ShellParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ShellParser.LineContext ctx);
}