package pack1;

public class MethodExample
{
	public static void main(String[] args) {
        // Calling the method
        int result = add(5, 7);
        System.out.println("The sum of 5 and 7 is " + result);
    }

    // Defining the method
    public static int add(int a, int b) {
        return a + b;
    }

}
