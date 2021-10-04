import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		ArrayList<String> fragments=new ArrayList<String>();
		Scanner scn=new Scanner(System.in);
		int cases=0;
		if (scn.hasNextLine()) {
			cases=scn.nextInt();
			scn.nextLine();
		}
		if(scn.hasNextLine()) {
			scn.nextLine();
		}
		for(int c=0;c<cases;c++) {
			Map<String,String> pairs=new HashMap<String,String>();
			//case start
			fragments.clear();
			while(true) {
				String tmp=new String();
				if(scn.hasNextLine()) {
					tmp=scn.nextLine();
				}
				if(tmp.equals("")) {
					break;
				}
				fragments.add(new String(tmp));
				
			}
			int size=0;
			for(int i=0;i<fragments.size();i++) {
				size+=fragments.get(i).length();
			}
			size/=(fragments.size()/2);
//			System.out.println(size);
			for(int i=0;i<fragments.size();i++) {
				for(int j=0;j<fragments.size();j++) {
					String item1=fragments.get(i);
					String item2=fragments.get(j);
					if(fragments.get(i).length()+fragments.get(j).length()==size) {
						if(fragments.get(i).length()<fragments.get(j).length()) {
							if(item2.indexOf(item1)!=0 && item2.lastIndexOf(item1)!=(item2.length()-item1.length())) {
								pairs.put(fragments.get(i), fragments.get(j));
							}
						}
						else if(fragments.get(i).length()>fragments.get(j).length()){
							if(item1.indexOf(item2)!=0 && item1.lastIndexOf(item2)!=(item1.length()-item2.length())) {
								pairs.put(fragments.get(i), fragments.get(j));
							}

						}
						else {
							pairs.put(fragments.get(i), fragments.get(j));
						}
						
					}
				}
				
			}
			boolean can_make=true;
			String ans=new String();
			String ans1=fragments.get(0)+pairs.get(fragments.get(0));
			for(int i=0;i<fragments.size();i++) {
					String tmp1=new String();
					String tmp2=new String();
					tmp1=fragments.get(i)+pairs.get(fragments.get(i));
					tmp2=pairs.get(fragments.get(i))+fragments.get(i);
//					System.out.println(tmp1);
//					System.out.println(tmp2);
					if(!ans1.equals(tmp1)&&!ans1.equals(tmp2)) {
						can_make=false;
//						System.out.println("can't make");
					}
					else {
//						System.out.println("can make!");
					}
			}
			if(can_make==false) {
				ans=pairs.get(fragments.get(0))+fragments.get(0);
			}
			else {
				ans=ans1;
			}
			System.out.println(ans);
			System.out.println();
			

		}

		
	}
}
