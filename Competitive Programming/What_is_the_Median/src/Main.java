import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		ArrayList<Integer> in=new ArrayList<Integer>();
		Scanner scn=new Scanner(System.in);

		while(true) {
			if(scn.hasNextInt()) {
				in.add(scn.nextInt());
				int ans=-1;
				Collections.sort(in);
				if(in.size()%2==0) {
					int right=in.size()/2;
					int left=right-1;
					ans=in.get(left)+in.get(right);
					ans/=2;
				}
				else {
					int pos=(in.size()+1)/2-1;
					ans=in.get(pos);
				}
				System.out.println(ans);
			}
			else {
				break;
			}
		}
		scn.close();
		
		
	}

}
