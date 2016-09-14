// Generated from /Users/leonid/University/SoftwareDesign/Shell/src/main/kotlin/ru/mit/spbau/softwaredesign/shell/parser/Shell.g4 by ANTLR 4.5.3
package ru.mit.spbau.softwaredesign.shell.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PIPE=2, CHAR_SEQUENCE=3, DOLAR=4, STRONG_QUOTE=5, WEAK_QUOTE=6, 
		EQ=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "PIPE", "CHAR_SEQUENCE", "DOLAR", "STRONG_QUOTE", "WEAK_QUOTE", 
		"EQ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'|'", null, "'$'", "'''", "'\"'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "PIPE", "CHAR_SEQUENCE", "DOLAR", "STRONG_QUOTE", "WEAK_QUOTE", 
		"EQ"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ShellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t$\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\6\4\31\n\4\r\4\16\4\32\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\2\2\t\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\5\2\13\13\17\17\"\"\5\2\60\60\62;C|$"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\25\3\2\2\2\7\30\3\2\2\2\t\34\3\2\2\2"+
		"\13\36\3\2\2\2\r \3\2\2\2\17\"\3\2\2\2\21\22\t\2\2\2\22\23\3\2\2\2\23"+
		"\24\b\2\2\2\24\4\3\2\2\2\25\26\7~\2\2\26\6\3\2\2\2\27\31\t\3\2\2\30\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\b\3\2\2\2\34\35"+
		"\7&\2\2\35\n\3\2\2\2\36\37\7)\2\2\37\f\3\2\2\2 !\7$\2\2!\16\3\2\2\2\""+
		"#\7?\2\2#\20\3\2\2\2\4\2\32\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}