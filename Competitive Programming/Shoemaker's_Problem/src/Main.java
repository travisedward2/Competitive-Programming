import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int cases=-1;
		if(scn.hasNextLine()) {
			cases=Integer.parseInt(scn.nextLine());
		}
		if(scn.hasNextLine()) {
			scn.nextLine();
		}
		for(int c=0;c<cases;c++) {
			int n=-1;

			if(scn.hasNextInt()) {
				n=scn.nextInt();
			}
			int[] T=new int[n+1];
			int[] S=new int[n+1];
			int[] ans=new int[n+1];
			
			for(int i=0;i<n;i++) {
				if(scn.hasNextInt()) {
					T[i]=scn.nextInt();
					
				}
				if(scn.hasNextInt()) {
					S[i]=scn.nextInt();
				}
				ans[i]=i;
			}
			for (int i = 0; i < n; i++){
				for (int j = 0; j < n - 1; j++){
					if (T[ans[j]] * S[ans[j + 1]] > S[ans[j]] * T[ans[j + 1]]) {
						int temp=ans[j];
						ans[j]=ans[j+1];
						ans[j+1]=temp;
					}
					else if (T[ans[j]] * S[ans[j + 1]] == S[ans[j]] * T[ans[j + 1]] && ans[j] > ans[j + 1]) {
						int temp=ans[j];
						ans[j]=ans[j+1];
						ans[j+1]=temp;
					}
				}
			}
			System.out.print(ans[0]+1);
			for(int i=1;i<n;i++) {
				System.out.print(" "+(ans[i]+1));
			}
			System.out.println();
			if(c!=cases-1) {
				System.out.println();
			}
			
		}
	}
}
