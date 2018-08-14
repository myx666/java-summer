import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static boolean ifvalid(String str)
	{
		if(Character.isJavaIdentifierStart(str.charAt(0)))
		{
			for(int i=1; i<str.length(); i++)
			{
				if(!Character.isJavaIdentifierPart(str.charAt(i))) 	return false;
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String m=in.next();
		if(ifvalid(m)==false||m.equals("catch")
				||m.equals("final")||m.equals("finally")
				||m.equals("native")||m.equals("package")
				||m.equals("synchronized")||m.equals("try")
				||m.equals("throw")||m.equals("throws")
				||m.equals("transient")||m.equals("goto")
				||m.equals("const")||m.equals("abstract")||m.equals("break")
				||m.equals("byte")||m.equals("boolean")||m.equals("case")
				||m.equals("class")||m.equals("char")||m.equals("continue")||m.equals("default")
				||m.equals("double")||m.equals("extends")||m.equals("false")||m.equals("float")
				||m.equals("for")||m.equals("do")||m.equals("else")||m.equals("if")
				||m.equals("import")||m.equals("implements")||m.equals("int")||m.equals("interface")
				||m.equals("instanceof")||m.equals("long")||m.equals("new")||m.equals("null")
				||m.equals("private")||m.equals("protected")||m.equals("public")||m.equals("return")
				||m.equals("switch")||m.equals("short")||m.equals("static")||m.equals("super")
				||m.equals("true")||m.equals("this")||m.equals("void")||m.equals("while")) System.out.println(-1);
		else if(ifvalid(m)==true) System.out.println(0);
	}
};