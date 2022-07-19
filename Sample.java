

class Example
{
	
	private static Example e;
	private Example(){}

	public  static Example getInstance(){
		if(e==null){
			e=new Example();
		}
		return e;
	}
}




class Sample
{
	public static void main(String[] args) 
	{
		//Example e=new Example();
		Example e1=Example.getInstance();
    Example e2=Example.getInstance();
	Example e3=Example.getInstance();
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	}
}
