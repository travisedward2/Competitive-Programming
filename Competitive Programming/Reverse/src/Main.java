import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		while(true) {
			if(scn.hasNextLine()) {
				Scanner line =new Scanner(scn.nextLine());
				int lofgroup=0;
				if(line.hasNextInt()) {
					lofgroup=line.nextInt();
					if(lofgroup==0) {
						break;
					}
				}
				String answer=new String();

				String input=null;
				if(line.hasNextLine()) {
					input=line.nextLine();	
					input=input.trim();
//					System.out.println(input);
				}
				lofgroup=input.length()/lofgroup;
				for(int i=0;i<input.length();) {
					StringBuilder reverser=new StringBuilder();
					for(int j=0;j<lofgroup;j++) {
						reverser.append(input.charAt(i));
//						System.out.print(input.charAt(i));
						i++;
					}
					System.out.print(reverser.reverse().toString());
//					answer.concat(reverser.reverse().toString());  
				}
				System.out.println();
//				System.out.println(answer);
				


			}
		}
		scn.close();

	}

}
