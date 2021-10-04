import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		int[] cards = new int[53];
		cards[0]=-1;
		for(int i=1;i<=52;i++) {
			cards[i]=i;
		}
		int[] temp=new int[53];
		temp[0]=-1;
		Scanner scn=new Scanner(System.in);
		int loops=0;
		if(scn.hasNextInt()) {
			loops=scn.nextInt();
			scn.nextLine();
		}
		scn.nextLine();
		int techniques=0;
		for(int i=0;i<loops;i++) {
			if(scn.hasNextLine()) {
				shuffle_num=scn.nextInt();
			}
		}
		
	}
}
