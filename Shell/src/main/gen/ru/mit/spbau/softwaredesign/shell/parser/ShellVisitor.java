// Generated from /Users/leonid/University/SoftwareDesign/Shell/src/main/kotlin/ru/mit/spbau/softwaredesign/shell/parser/Shell.g4 by ANTLR 4.5.3
package ru.mit.spbau.softwaredesign.shell.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShellParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ShellParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ShellParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ShellParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#strong_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrong_string(ShellParser.Strong_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#weak_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeak_string(ShellParser.Weak_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ShellParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ShellParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ShellParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(ShellParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(ShellParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ShellParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ShellParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ShellParser.LineContext ctx);
}