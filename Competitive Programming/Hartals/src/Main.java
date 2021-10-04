import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		int test_cases=0;
		int days=0;
		int ans=0;
		Scanner scn=new Scanner(System.in);
		if(scn.hasNextInt()) {
			test_cases=scn.nextInt();
		}
		for(int i=0;i<test_cases;i++) {
			ans=0;
			if(scn.hasNext()) {
				days=scn.nextInt();
			}
			int parties=0;
			if(scn.hasNextInt()) {
				parties=scn.nextInt();
			}
			ArrayList<Integer> hartal=new ArrayList<Integer>();
			for(int j=0;j<parties;j++) {
				if(scn.hasNextInt()) {
					hartal.add(scn.nextInt());
				}
			}
			for(int d=1;d<=days;d++) {
				int flag=0;
				for(int x : hartal) {
					if(d%x==0 && d%7!=6 && d%7!=0) {
						flag++;
					}
				}
				if(flag>0) {
					ans++;
				}
			}
			System.out.println(ans);
		}
		scn.close();
	}
}
