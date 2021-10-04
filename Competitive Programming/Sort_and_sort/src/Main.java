import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void insert(int in,ArrayList<Integer> x) {
		int tmp=in;

		for(int i=0;i<x.size();i++) {
			if(Math.abs(tmp%2)==0 && Math.abs(x.get(i)%2)==1) {

				
			}
			else if(Math.abs(tmp%2)==1 && Math.abs(x.get(i)%2)==0) {
				int swap=x.get(i);
				x.set(i, tmp);
				tmp=swap;
			}
			else if(Math.abs(tmp%2)==0 && Math.abs(x.get(i)%2)==0) {
				if(tmp<x.get(i)) {
					int swap=x.get(i);
					x.set(i, tmp);
					tmp=swap;
				}
			}
			else if(Math.abs(tmp%2)==1 && Math.abs(x.get(i)%2)==1) {
				if(tmp>x.get(i)) {
					int swap=x.get(i);
					x.set(i, tmp);
					tmp=swap;
				}
			}
		}
		x.add(tmp);
		
			
		

	
		
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(scn.hasNextLine()) {
			int N=-1,M=-1;
			if(scn.hasNextInt()) {
				N=scn.nextInt();
			}
			if(scn.hasNextInt()) {
				M=scn.nextInt();
			}
			if(N==0 && M==0) break;
			scn.nextLine();
			Map<Integer, ArrayList<Integer>> ans=new HashMap<Integer, ArrayList<Integer>>();
			
			for(int i=0;i<N;i++) {
				int in=-1;
				int mod=-1;
				if(scn.hasNextLine()) {
					in=scn.nextInt();
					scn.nextLine();
				}
				mod=in%M;
//				System.out.println(in);
				if(ans.get(mod)==null) {
					ans.put(mod, new ArrayList<Integer>());
				}
				
				insert(in,ans.get(mod));
			}
			System.out.println(N+" "+M);
			for(int i=-M;i<M;i++) {
				if(ans.get(i)!=null) {
					for(int x :ans.get(i)) {
						System.out.println(x);
					}
				}
			}
		}

		

		System.out.println("0 0");

	}
}
