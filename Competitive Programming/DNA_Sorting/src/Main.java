import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		int cases=0;
		Scanner scn = new Scanner(System.in);


		if(scn.hasNextLine()) {
			cases=Integer.parseInt(scn.nextLine());
		}
		for(int c=0;c<cases;c++) {
			Map<Integer,ArrayList<String>> ans= new HashMap<Integer,ArrayList<String>>();
			ArrayList<Integer> out=new ArrayList<>();
			if(scn.hasNextLine()) {
				scn.nextLine();
			}
			int len=0,num=0;
			if(scn.hasNextLine()) {
				len=scn.nextInt();
				num=scn.nextInt();
				scn.nextLine();
			}
			for(int i=0;i<num;i++) {
				String x=scn.nextLine();
				int key=0;
				for(int j=0;j<x.length();j++) {
					for(int k=0;k<x.length();k++) {
						if(x.charAt(j)>x.charAt(k)&& k>j) {
							key++;
						}
					}
				}
				if(ans.get(key)==null) {
					ans.put(key,new ArrayList<String>());
				}
				ans.get(key).add(x);
				if(!out.contains(key))
					out.add(key);
			}
			Collections.sort(out);
			for(int x:out) {
				for(String s:ans.get(x)) {
					System.out.println(s);
				}
				
			}
			System.out.println();
		}

		
		
	}
}
