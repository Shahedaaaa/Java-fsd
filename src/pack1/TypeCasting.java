package pack1;

public class TypeCasting 
{
	void implicit()
	{
		System.out.println("Performing implicit type casting");
		byte b1=50;
		int i1=b1;
		float f1=b1;
		System.out.println("byte b1: " +b1);
		System.out.println("int i1: " +i1);
		System.out.println("float f1: " +f1);
		char c1='a';
		int i2=c1;
		System.out.println("char c1: " +c1);
		System.out.println("int i2: " +i2);
		
	}
	void explicit()
	{
		System.out.println("Performing explicit Type Casting");
		int x=50;
		byte b1=(byte)x;
		System.out.println("int x: " +x);
		System.out.println("byte b1: " +b1);
		int y=65;
		char c=(char)y;
		System.out.println("int y: " +y);
		System.out.println("char c: " +c);
	}
	public static void main(String[] args) 
	{
		TypeCasting tc=new TypeCasting();
		tc.implicit();
		tc.explicit();
	}

}
