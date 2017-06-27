import java.util.Scanner;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Roverspraak {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Velg 1 for Konvertere til Røver!");
		System.out.println("Velg 2 for å Konvertere fra Røver!");
		int chosen = input.nextInt();
		String fdas = input.nextLine();
		
		if (chosen==1){
			System.out.println("Skriv inn det du vil oversette");
			String value = input.nextLine();
			String convertedString = convertToBandit(value);
			System.out.print(convertedString);
		}
		else if(chosen==2){
			System.out.println("Skriv inn det du vil oversetta");
			String value = input.nextLine();
			String convertedString = convertFromBandit(value);
			System.out.print(convertedString);
		}

		
		
		
	}
	
	public static String convertToBandit(String value){
		ArrayList<Character> arrayString = new ArrayList<Character>();
		char j;
		for (int i=0;i<value.length();i++){
			j=value.charAt(i);
			if (j==('b')||j==('c')||j==('d')||j==('f')||j==('g')||j==('h')||j==('j')||j==('k')||j==('l')||j==('m')||j==('n')||j==('p')||j==('q')||j==('r')||j==('s')||j==('t')||j==('v')||j==('w')||j==('x')||j==('z')){
				arrayString.add(j);
				arrayString.add('o');
				arrayString.add(j);	
			}
			else{
				arrayString.add(j);
			}
		}
		String returnString = getStringRepresentation(arrayString);
		return returnString;
	}
	public static String convertFromBandit(String value){
		ArrayList<Character> arrayString = new ArrayList<Character>();
		char j;
		for (int i=0;i<value.length();i++){
			j=value.charAt(i);
			if (j==('b')||j==('c')||j==('d')||j==('f')||j==('g')||j==('h')||j==('j')||j==('k')||j==('l')||j==('m')||j==('n')||j==('p')||j==('q')||j==('r')||j==('s')||j==('t')||j==('v')||j==('w')||j==('x')||j==('z')){
				arrayString.add(j);
				i+=2;
			}
			else{
				arrayString.add(j);
			}
		}
		String returnString = getStringRepresentation(arrayString);
		return returnString;
	}
	
	
	
	
	
	
	
	
	
	
	//Thanks to Vineet Reynolds from Stackoverflow
	static String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
}
