
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Leaf a=new Leaf();
		
		a.addComponent(new Question("1+3="));
		a.addComponent(new Question("4+3="));
		
		Leaf b=new Leaf();
		
		b.addComponent(new Question("6+5="));
		b.addComponent(a);
		
		b.print();
	}

}
