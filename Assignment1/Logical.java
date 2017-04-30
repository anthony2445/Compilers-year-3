package inter; // File Logical.java
import lexer.*; import symbols.*;
public class Logical extends Expr {
	public Expr exprl, expr2;
	Logical(Token tok, Expr xl, Expr x2) {
		super(tok, null); // null type to start
		exprl = xl; expr2 = x2;
		type = check(exprl.type, expr2.type);
		if (type == null ) error("type error");
	}
	public Type check(Type pi, Type p2) {
		if ( pi == Type.Bool && p2 == Type.Bool ) return Type.Bool;
		else return null;
	}
	public Expr gen() {
		int f = newlabelQ; int a = newlabelQ;
		Temp temp = new Temp(type);
		this.jumping(0,f);
		emit (temp. toString() + " = true");
		emit("goto L" + a);
		emitlabel(f); emit(temp.toString() + " = false");
		emitlabel(a) ;
		return temp;
	}
	public String toString() {
		return exprl.toString()+" "+op.toString()+" "+expr2.toString();
	}
}