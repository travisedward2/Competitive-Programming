import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		ArrayList<ArrayList<Character>> keyboard=new ArrayList<ArrayList<Character>> ();
		for(int i=0;i<5;i++) {
			keyboard.add(new ArrayList<Character>());
		}
		keyboard.get(0).add('`');
		keyboard.get(0).add('1');
		keyboard.get(0).add('2');
		keyboard.get(0).add('3');
		keyboard.get(0).add('4');
		keyboard.get(0).add('5');
		keyboard.get(0).add('6');
		keyboard.get(0).add('7');
		keyboard.get(0).add('8');
		keyboard.get(0).add('9');
		keyboard.get(0).add('0');
		keyboard.get(0).add('-');
		keyboard.get(0).add('=');
		
		keyboard.get(1).add('Q');
		keyboard.get(1).add('W');
		keyboard.get(1).add('E');
		keyboard.get(1).add('R');
		keyboard.get(1).add('T');
		keyboard.get(1).add('Y');
		keyboard.get(1).add('U');
		keyboard.get(1).add('I');
		keyboard.get(1).add('O');
		keyboard.get(1).add('P');
		keyboard.get(1).add('[');
		keyboard.get(1).add(']');
		keyboard.get(1).add('\\');
		
		keyboard.get(2).add('A');
		keyboard.get(2).add('S');
		keyboard.get(2).add('D');
		keyboard.get(2).add('F');
		keyboard.get(2).add('G');
		keyboard.get(2).add('H');
		keyboard.get(2).add('J');
		keyboard.get(2).add('K');
		keyboard.get(2).add('L');
		keyboard.get(2).add(';');
		keyboard.get(2).add('\'');

		keyboard.get(3).add('Z');
		keyboard.get(3).add('X');
		keyboard.get(3).add('C');
		keyboard.get(3).add('V');
		keyboard.get(3).add('B');
		keyboard.get(3).add('N');
		keyboard.get(3).add('M');
		keyboard.get(3).add(',');
		keyboard.get(3).add('.');
		keyboard.get(3).add('/');
		
		StringBuilder answer=new StringBuilder();
		Scanner scn=new Scanner(System.in);
		String input =scn.nextLine();
		answer.append(input);
		for(int i=0;i<answer.length();i++) {
			int index=0;
			for(char x:keyboard.get(0)) {
				if(x==answer.charAt(i)) {
					answer.setCharAt(i, keyboard.get(0).get(index-1));
				}
				index++;
			}
			index=0;
			for(char x:keyboard.get(1)) {
				if(x==answer.charAt(i)) {
					answer.setCharAt(i, keyboard.get(1).get(index-1));
				}
				index++;
			}
			index=0;
			for(char x:keyboard.get(2)) {
				if(x==answer.charAt(i)) {
					answer.setCharAt(i, keyboard.get(2).get(index-1));
				}
				index++;
			}
			index=0;
			for(char x:keyboard.get(3)) {
				if(x==answer.charAt(i)) {
					answer.setCharAt(i, keyboard.get(3).get(index-1));
				}
				index++;
			}
		}
		
		System.out.println(answer.toString());
//		if(keyboard.get(4).get(0)==input.charAt(1)){
//			System.out.println("true");
//		}
		


 	}

}
