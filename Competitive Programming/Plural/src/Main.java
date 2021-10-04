import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		Map<String,String> irregular=new HashMap<String,String>();
		ArrayList<String> answer=new ArrayList<String>();
		int mapping=0;
		int tests=0;
		if(scn.hasNextInt()) {
			mapping=scn.nextInt();
		}
		if(scn.hasNextInt()) {
			tests=scn.nextInt();
		}
		if(scn.hasNextLine()) {
			scn.nextLine();
		}
		for(int i=0;i<mapping;i++) {
			irregular.put(scn.next(), scn.next());
		}
		if(scn.hasNextLine()) {
			scn.nextLine();
		}
		for(int i=0;i<tests;i++) {
			if(scn.hasNextLine()) {
				String tmp=scn.nextLine();
				StringBuilder ans=new StringBuilder(tmp);
				int l=tmp.length()-1;
				
				if(irregular.get(tmp)!=null) {
					answer.add(irregular.get(tmp));
				}
				else if(tmp.charAt(l)=='y' && !(tmp.charAt(l-1)=='a'||tmp.charAt(l-1)=='e'||tmp.charAt(l-1)=='i'||tmp.charAt(l-1)=='o'||tmp.charAt(l-1)=='u')){
					ans.deleteCharAt(ans.length()-1);
					ans.append("ies");
					answer.add(ans.toString());
				}
				else if(tmp.charAt(l)=='o' || tmp.charAt(l)=='s'|| tmp.charAt(l)=='x' || (tmp.charAt(l)=='h' && (tmp.charAt(l-1)=='c'||tmp.charAt(l-1)=='s'))||tmp.charAt(l)=='x') {
					ans.append("es");
					answer.add(ans.toString());
				}
				else {
					ans.append('s');
					answer.add(ans.toString());
				}
			}
			
		}
		for(String x:answer) {
			System.out.println(x);
		}
	}
}
