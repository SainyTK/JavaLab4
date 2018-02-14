import java.util.*;

public class DiceBox{

	private ArrayList<Dice> box;

	public DiceBox()
	{
		this.box = new ArrayList<Dice>();
	}

	public void add(Dice d)
	{
		this.box.add(d);
	}

	public void shake()
	{
		for(Dice d:this.box)
			d.roll();
	}

	public int getTotal()
	{
		int total = 0;
		for(Dice d:this.box)
			total += d.getFace();
		return total;

	}

	public void printDices()
	{
		for(int i=0;i<box.size();i++)
			System.out.println((i+1) + ". " + box.get(i));
	}

}