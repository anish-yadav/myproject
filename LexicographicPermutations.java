public class LexicographicPermutations 
{ private static int permutationsFound = 0; 
public static void main(String[] args) 
{
	permuteTo("012", " "); }
private static void permuteTo(String s, String chosen) { 
	
	if (s.length() == 0) { permutationsFound++;
	if (permutationsFound == 1000000) 
	{ System.out.println(chosen); 
	} } else if (permutationsFound <= 1000000)
	{ 
		for (int i = 0; i < s.length(); i++)
	{
			char ch = s.charAt(i); 
	String rest = s.substring(0, i) + s.substring(i + 1); 
 
	permuteTo(rest, chosen + ch); }
	System.out.println(chosen);
	}  
	}
	}
