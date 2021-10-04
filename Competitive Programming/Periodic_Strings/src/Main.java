import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		int cases=0;
		if(scn.hasNextLine()) {
			cases=scn.nextInt();
			scn.nextLine();
		}
		if(scn.hasNextLine()) {
			scn.nextLine();
		}
		for(int c=0;c<cases;c++) {
			if(scn.hasNextLine()) {
				String target=scn.nextLine();
				String ans=new String();
				for(int i=0;i<target.length();i++) {
					ans+=target.charAt(i);
					int rep=target.length()/ans.length();
					String temp=new String();
					for(int j=0;j<rep;j++) {
						temp+=ans;
					}
					if(temp.equals(target)) {
						System.out.println(ans.length());
						System.out.println();
						break;
					}
					
				}
			}
			if(scn.hasNextLine()) {
				scn.nextLine();
			}
		}
	}
}
