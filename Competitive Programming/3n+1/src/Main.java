import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
	
	public static void main(String[] argv) {

		int i,j;
		ArrayList<String> input=new ArrayList<String>();
		int tpi;
		int tpj;
		
		
		Scanner scn=new Scanner(System.in);
		while(scn.hasNextLine()) {
			Scanner lineScanner=new Scanner(scn.nextLine());
			i=Integer.parseInt(lineScanner.next());
			j=Integer.parseInt(lineScanner.next());
			lineScanner.close();
			tpi=i;
			tpj=j;
			if(i>j) {
				i=j;
				j=tpi;
			}
			int tmp=-1,ans=-1;
			for(int w=i;w<=j;w++) {
				tmp=evaluate(w);
				if(tmp>ans) {
					ans=tmp;
				}
			}
				System.out.println(tpi+" "+tpj+" "+ans);	
			
			
		}
		scn.close();
//		System.out.println("ksize"+input.size());
//
//		for(int k=0;k<input.size();k+=2) {
//			i=Integer.parseInt(input.get(k));
//			j=Integer.parseInt(input.get(k+1));
//
//		
//		}

			
		System.out.flush();
		
	}
	public static int evaluate(int x) {
		int count=1;
		while(x!=1) {
			if(x%2==0) {
				x=even(x);
			}
			else {
				x=odd(x);
			}
			count++;
		}
//		System.out.println(count);
		return count;
	}
	public static int even(int x) {
		x=x/2;
		return x;
		
	}
	public static int odd(int x) {
		x=x*3+1;
		return x;
		
	}
}
