import java.util.ArrayList;

public class Leaf extends Component
{
	ArrayList<Component> list;
	
	public Leaf() 
	{
		// TODO Auto-generated constructor stub

		list = new ArrayList<Component>();
	}
	
	void addComponent(Component c)
	{
		list.add(c);
	}
	
	@Override
	void print() 
	{
		// TODO Auto-generated method stub
		for(Component temp : list)
		{
			temp.print();
		}
	}
}
