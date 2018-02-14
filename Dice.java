public class Dice{

	private int face;

	public Dice()
	{
		this.face = 1;
	}

	public int getFace()
	{
		return this.face;
	}

	public void roll()
	{
		this.face = (int)(Math.random()*6+1);
	}

	public String toString()
	{
		return "Face = " + this.face;
	}

}