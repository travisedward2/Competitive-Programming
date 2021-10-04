import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		while(true) {
			int queries=scn.nextInt();
			if(queries==0) {
				break;
			}
			int cx=0,cy=0;
			cx=scn.nextInt();
			cy=scn.nextInt();
			for(int k=0;k<queries;k++) {
				int x=0,y=0;
				x=scn.nextInt();
				y=scn.nextInt();
				System.out.println(result(cx,cy,x,y));
				
			}
			
		}
		scn.close();

	}
	
	public static String result(int cx,int cy,int x,int y) {
		if(cx==x||cy==y) {
			return "divisa";
		}	
		else if(x>cx&&y>cy) {
			return "NE";
		}
		else if(x<cx&&y>cy) {
			return "NO";
		}
		else if(x>cx&&y<cy) {
			return "SE";
		}
		else if(x<cx&&y<cy) {
			return "SO";
		}
		
		return "wrong";
		
		
	}

}
