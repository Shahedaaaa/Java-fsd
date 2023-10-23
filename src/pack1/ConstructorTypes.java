package pack1;

public class ConstructorTypes 
{
	ConstructorTypes()
	{
		System.out.println("Non-parameterized constructor called");
		new ConstructorTypes("Java is awesome").meth2();;
		
	}
	ConstructorTypes(String s)
	{
		System.out.println(s);
		
	}
	ConstructorTypes(int a,int b)
	{
		System.out.println(a+b);
	}
	void meth1()
	{
		System.out.println("meth1() called");
		
	}
	void meth2()
	{
		System.out.println("meth2() called");
		new ConstructorTypes(99,1);
	}
	public static void main(String[] args) 
	{
		ConstructorTypes aobj=new ConstructorTypes();
		aobj.meth1();
		
	}
}
