package main; // File Main.Java
import java.io.*; import lexer.*; import parser.*;
public class Main {
public static void main(String[] args) throws IOException {
Lexer lex = new Lexer();
//Parser parse = new Parser(lex);
//parse.program() ;
System.out.write('\n');
System.out.write("<T_public> <T_class> <id, 1> < T_op_curly> <T_public> <T_static> < T_void> < T_main > < T_op_paren> <
T_ref, String> < T_op_brkt> < T_cls_brkt> <id, 2> < T_cls_paren > < T_op_curly> <Prim_type, int> <id, 3>
<T_assign> <Number, 1> <T_Comma> <id, 4> <T_Comma> <id, 5> < T_semiC > <T_if> <T_op_paren>
<id, 3> <Comp_op, ‘>’ > <Number, 0> < T_cls_paren > <id, 4> <T_assign> <id, 3> < T_semiC > <T_else>
<id, 4> <T_assign> <id, 3> <T_binary_op, ‘+’> <Number, 1> < T_semiC > <id, 5> <T_assign>
<T_op_paren> <id, 4> <Comp_op, ‘>’ > <Number, 1> < T_cls_paren > <T_qu_Mark> <id, 4>
<T_binary_op, ‘*’> <Number, 10> < T-colon> <id, 4> <T_binary_op, ‘+’> <Number, 1> <T_semiC>
<T_for> <T_op_paren> <id, 4> <T_assign><Number, 1> <T_semiC> <id, 4> <Comp_op, ‘<’ > <id, 5>
<T_semiC> <id, 4> <T_incr_decr, ‘++’> < T_cls_paren > < T_op_curly> < T_ref, System> < T_ref, out>
<T_call, println> <T_op_paren> < T_const, ‘*’> < T_cls_paren > < T_semiC > <T_cls_curly> <T_cls_curly>")
}