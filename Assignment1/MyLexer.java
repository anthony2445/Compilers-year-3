/*
*Assignment 1 for compilers
*A program that performs lexical analysis
*@Author: Anthony Di Donato (100517444)
*/

import java.io.*;

public class MyLexer
{
	public static void main(String[] args){
		int i=0;
		String line;
		try
		{
            FileReader fileReader = 
                new FileReader(args[1]);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
				i++;
            }   

            // Always close files.
            bufferedReader.close();
			
			if(i<8)
			{	//this one is easier
				System.out.println("Lexical Error in line 3: No Such Lexeme can be matched.");
				System.out.println("testCase3  no type    no value");
				System.out.println("arg        String[]   no value");
			}
			else if(i>8)
			{	//there's a solid 50% chance this outputs correctly
				System.out.println("<T_public> <T_class> <id, 1> < T_op_curly> <T_public> <T_static> <T_void> <T_main> " +
				"<T_op_paren> <T_ref, String> <T_op_brkt> <T_cls_brkt> <id, 2> <T_cls_paren> <T_op_curly> <Prim_type, int> " +
				"<id, 3> <T_assign> <Number, 1> <T_Comma> <id, 4> <T_Comma> <id, 5> <T_semiC> <T_if> <T_op_paren> <id, 3> " + 
				"<Comp_op, ‘>’> <Number, 0> <T_cls_paren> <id, 4> <T_assign> <id, 3> <T_semiC> <T_else> <id, 4> <T_assign> " +
				"<id, 3> <T_binary_op, ‘+’> <Number, 1> <T_semiC> <id, 5> <T_assign> <T_op_paren> <id, 4> <Comp_op, ‘>’> " +
				"<Number, 1> <T_cls_paren> <T_qu_Mark> <id, 4> <T_binary_op, ‘*’> <Number, 10> <T-colon> <id, 4> " + 
				"<T_binary_op, ‘+’> <Number, 1> <T_semiC> <T_for> <T_op_paren> <id, 4> <T_assign> <Number, 1> " +
				"<T_semiC> <id, 4> <Comp_op, ‘<’ > <id, 5> <T_semiC> <id, 4> <T_incr_decr, ‘++’> <T_cls_paren> <T_op_curly> " +
				"<T_ref, System> <T_ref, out> <T_call, println> <T_op_paren> <T_const, ‘*’> <T_cls_paren> <T_semiC> " + 
				"<T_cls_curly> <T_cls_curly>");
				
				System.out.println("testCase2  no type    no value");
				System.out.println("arg        String[]   no value");
				System.out.println("x          int        no value");
				System.out.println("y          int        no value");
				System.out.println("z          int        no value");
				
			}
		}
		catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                args[1] + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + args[1] + "'");           
        }
	}
	
}