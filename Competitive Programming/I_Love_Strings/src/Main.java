import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		int cases=0;
		if(scn.hasNextInt()) {
			cases=scn.nextInt();
		}
		if(scn.hasNextLine()) {
			scn.nextLine();
		}
		for(int c=0;c<cases;c++) {
			String s=new String();
			if(scn.hasNext()) {
				s=scn.next();
			}
			if(scn.hasNextLine()) {
				scn.nextLine();
			}
			int tests=0;
			if(scn.hasNextInt()) {
				tests=scn.nextInt();
			}
			for(int i=0;i<tests;i++) {
				if(scn.hasNextLine()) {
					
					if(s.contains(scn.next())) {
						System.out.println("y");
					}
					else {
						System.out.println("n");
					}
					scn.nextLine();
				}	
			}
		}

	}
}
