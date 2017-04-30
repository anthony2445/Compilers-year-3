package inter ; // File And.Java
import lexer.*; import symbols.*;
public class And extends Logical {
	public And(Token tok, Expr xl, Expr x2) { super(tok, xl, x2); }
	public void jumping(int t, int f) {
		int label = f != 0 ? f : newlabel();
		exprl.jumping(0, label);
		expr2.jumping(t,f);
		if( f == 0 ) emitlabel(label);
	}
}