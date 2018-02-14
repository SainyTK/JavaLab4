import java.util.*;

public class Extractlt
{

	public static String extractlt(String s)
	{
		String[] arrString = s.split("/");
		int lastIdx = arrString.length;
		String ans = arrString[lastIdx-1];
		if(ans.startsWith("*"))
		{
			ans = ans.substring(1,ans.length());
			ans = "_" + ans;
		}
		return ans;
	}

	public static void main(String[] args)
	{
		System.out.println(extractlt("www.abc.com/pub/*aaa.html"));
	}
 
}