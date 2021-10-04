import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		while(scn.hasNextLine()) {
			Scanner line=new Scanner(scn.nextLine());
			String input=null;
			if(line.hasNext()) {
				input=line.next();
			}
			else {
				break;
			}
			StringBuilder ans=new StringBuilder();
			boolean need_add=false;
			for(int i=0;i<input.length();i++) {
				if(ans.length()==0  ) {
					if(call(input.charAt(i))!='0') {
						ans.append(call(input.charAt(i)));
						need_add=false;
					}
					
				}
				else if(call(input.charAt(i))!=ans.charAt(ans.length()-1) && call(input.charAt(i))!='0') {
					ans.append(call(input.charAt(i)));
					need_add=false;
				}
				else if(call(input.charAt(i))==ans.charAt(ans.length()-1) && call(input.charAt(i))!='0') {
					if(need_add) {
						ans.append(call(input.charAt(i)));
					}
					need_add=false;
				}
				else if(call(input.charAt(i))=='0') {
					need_add=true;
				}				
			}
			System.out.println(ans.toString());
		}
	
		
	}
	public static char call(char x) {
		switch(x) {
		case 'B':
		case 'F':
		case 'P':
		case 'V':
			return '1';
		
			
		case 'C':
		case 'G':
		case 'J':
		case 'K':
		case 'Q':
		case 'S':
		case 'X':
		case 'Z':
			return '2';
			
		case 'D':
		case 'T':
			return '3';
		case 'L':
			return '4';
		case 'M':
		case 'N':
			return '5';
			
		case 'R':
			return '6';
		default:
			return '0';
			
		}
		
	}
}
