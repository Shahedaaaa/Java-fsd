package pack1;

 class AccessModifiers 
{
	  void m1()  
	    {  
	        System.out.println("Default method");  
	    }  
	  private void m2()  
	    {  
	        System.out.println("Private method");  
	    }  
	  protected void m3()  
	    {  
	        System.out.println("Protected method");  
	    }  
	  public void display()  
	    {  
	        System.out.println("Public method");  
	    }  
	  public static void main(String[] args) 
	  {
		AccessModifiers am=new AccessModifiers();
		am.m1();
		am.m2();
		am.m3();
		am.display();
	}
	  

}
