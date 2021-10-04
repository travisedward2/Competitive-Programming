import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
		public static boolean is_plaintext(String line) {
			String plaintext="the quick brown fox jumps over the lazy dog";
			if(plaintext.length()==line.length()) {
				for(int i=0;i<plaintext.length();i++) {
					if( i==3 || i==9 ||i==15 || i==19 || i==25 || i==30 || i==34||i==39 ) {
						if(line.charAt(i)!=plaintext.charAt(i)) {
							return false;
						}
					}
					else {
						if(line.charAt(i)==' ') {
							return false;
						}
					}
					
				}
				return true;
			}
			else {
				return false;
			}

		}
		
		public static void main(String[] argv) {
			String atoz="abcdefghijklmnopqrstuvwxyz";
			Scanner scn=new Scanner(System.in);
			
			String plaintext="the quick brown fox jumps over the lazy dog";
			boolean find_plaintext=false;
			
			
			int cases=Integer.parseInt(scn.nextLine());
			if(scn.hasNextLine()) {
				scn.nextLine();
			}
			
			for(int c=0;c<cases;c++) {
				Map<Character,Character> answer=new HashMap<Character, Character>();
				ArrayList<String> input=new ArrayList<String>();
				while(true) {
					String line="no line";
					if(scn.hasNextLine()) {
						line=scn.nextLine();
					}
					
					if(!line.equals("") && !line.equals("no line")) {
						input.add(line);
						if(is_plaintext(line)&&!find_plaintext) {
							find_plaintext=true;
							for(int i=0;i<plaintext.length();i++) {
								if(answer.get(line.charAt(i))==null) {
									answer.put(line.charAt(i),plaintext.charAt(i) );
								}
								else {
									if(answer.get(line.charAt(i))!=plaintext.charAt(i)) {
										find_plaintext=false;
										answer.clear();
										break;
									}
									
								}
								
							}
							if(answer.size()==26) {
								for(int i=0;i<answer.size();i++) {
									for(int j=0;j<answer.size();j++) {
										if(i!=j) {
											if(answer.get(atoz.charAt(i))==answer.get(atoz.charAt(j))) {
												find_plaintext=false;
												answer.clear();
											}
										}
									}
								}
							}
						
							answer.put(' ', ' ');
						}
					}
					else {
						if(find_plaintext) {			
							for(int i=0;i<input.size();i++) {
								for(int j=0;j<input.get(i).length();j++) {
									System.out.print(answer.get(input.get(i).charAt(j)));
								}
								System.out.println();
							}
						}
						else {
							System.out.println("No solution.");
						}
						if(c!=cases-1) {
							System.out.println();
							find_plaintext=false;
						}
						else {
							scn.close();
						}
						
						break;
					}
				}
			}
			

			
			
		}
}
