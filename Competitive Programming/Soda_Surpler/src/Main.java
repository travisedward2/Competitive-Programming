import java.util.Scanner;

public class Main {
	
	public static void main(String[] argv) {
		int e=0,f=0,cost=0;
		int empty=0;
		int ans=0;
		Scanner scn=new Scanner(System.in);
		int loop=scn.nextInt();
		for(int k=0;k<loop;k++) {
			e=scn.nextInt();
			f=scn.nextInt();
			cost=scn.nextInt();
			empty=e+f;
			ans=calculate(empty,cost);
			System.out.println(ans);
		}
		scn.close();
		
		
		
	}
	
	public static int calculate(int empty,int cost) {
		int ans=0;
		int temp=0;
		
		while(true) {
			temp=empty/cost;
			if(temp==0) {
				break;
			}
			ans+=temp;
			empty=empty%cost;
			empty+=temp;
			
		}
		return ans;
		
	}
}
