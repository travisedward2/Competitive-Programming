import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		int loop=scn.nextInt();
		for(int t=0;t<loop;t++) {
			ArrayList<int[]> tuples=new ArrayList<int[]>();
			int i=scn.nextInt();
			int[] tmp=new int[i];
			for(int k=0;k<i;k++) {
				tmp[k]=scn.nextInt();		
			}
			int ans=-1;
			tuples.add(tmp.clone());
			while(true) {
				tmp=create(i,tmp);
				ans=termination(i,tuples,tmp);
				if(ans!=(-1)) {
					break;
				}
				tuples.add(tmp.clone());
				
			}
			if(ans==0) {
				System.out.println("ZERO");
			}
			else if(ans==1) {
				System.out.println("LOOP");
				
			}
			
		}
		scn.close();
		
		
		

		
	}
	public static int[] create(int i,int[] tmp) {
		int[] create=new int[i];
		for(int k=0;k<i;k++) {
			if(k==i-1) {
				create[k]=Math.abs(tmp[k]-tmp[0]);
			}
			else {
				create[k]=Math.abs(tmp[k]-tmp[k+1]);
			}

		}
		
		
		return create;
		
	}
	
	public static int termination(int i,ArrayList<int[]> tuples,int[] an) {
		int terminate=-1;
		int zero=0;
		for(int z:an) {
			if(z==0) {
				zero++;
			}
		}
		if(zero==i) {
			terminate=0;
			return terminate;
		}
		
		for(int[] x:tuples) {
			int loop=0;
			for(int k=0;k<i;k++) {
				if(an[k]==x[k] ) {
					loop++;
				}
			}
			if(loop==i) {
				terminate=1;
				break;
			}
		}
		
		return terminate;
		
		
	}

}


