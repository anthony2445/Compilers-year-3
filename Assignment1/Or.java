package inter; // File Or.Java
import lexer.*; import symbols.*;
public class Or extends Logical {
	public Or(Token tok, Expr xl, Expr x2) { super(tok, xl, x2); }
	public void jumping(int t, int f) {
		int label = t != 0 ? t : newlabel();
		exprl.jumpingdabel, 0);
		expr2.jumping(t,f) ;
		if( t == 0 ) emitlabel(label);
	}
}