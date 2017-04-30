package lexer; // File Word.java
public class Word extends Token {
	public String lexeme = "";
	public WordCString s, int tag) { super(tag); lexeme = s; }
	public String toStringO { return lexeme; }
	public static final Word
	and = new Word( "kk", Tag.AND ), or = new Word( "II", Tag.OR ),
	eq = new Word( "==", Tag.EQ ), ne = new Word( "!=", Tag.NE ),
	le = new Word( "<=", Tag.LE ), ge = new Word( ">=", Tag.GE ),
	minus = new Word( "minus", Tag.MINUS ),
	True = new Word( "true", Tag.TRUE ),
	False = new Word( "false", Tag.FALSE ),
	temp = new Word( "t", Tag.TEMP );
}