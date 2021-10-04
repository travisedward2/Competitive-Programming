import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {

		int count=0;
		Scanner scn=new Scanner(System.in);
		while(scn.hasNext()) {
			
			count++;
			String input=null;
			if(scn.hasNext()) {
				input=scn.next();
			}
			if(input.equals("0")) {
				System.out.println(String.format("%4d", count)+". "+0);
				
			}else {
				StringBuilder in=new StringBuilder();
				StringBuilder ans=new StringBuilder();
				for(int k=0;k<input.length();k++) {
					in.append(input.charAt(k));
				}
				ans=construct(in);
				ans.append(' ');
				ans.insert(0, ' ');
				ans.insert(0, '.');
				ans.insert(0, String.format("%4d", count));
				while(ans.charAt(ans.length()-1)==' ') {
					ans.deleteCharAt(ans.length()-1);
				}
				
//				ans.deleteCharAt(ans.length()-1);
				System.out.println(ans.toString());
			}
			
			
//			System.out.flush();
//			   1. 23 hajar 7 shata 64
//			   2. 45 lakh 89 hajar 7 shata 45 kuti 89 lakh 73 hajar 9 shata 58
			
		}
//		scn.close();

//		
		
		
		
	}
	public static StringBuilder construct(StringBuilder input) {
		StringBuilder ans =new StringBuilder();
		int count=0;
		int tmp=0;
		boolean apd=true;
		while(true) {
			apd=true;
			tmp=0;
			switch(count) {
			case 0:
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(tmp==2) {
					if(ans.charAt(ans.length()-1)=='0'&&ans.charAt(ans.length()-2)=='0') {
						ans.deleteCharAt(ans.length()-1);
						ans.deleteCharAt(ans.length()-1);
						apd=false;
					}
					else {
						if(ans.charAt(ans.length()-1)=='0') {
							ans.deleteCharAt(ans.length()-1);
						}
					}
					
				}
				if(tmp==1) {
					if(ans.charAt(ans.length()-1)=='0') {
						ans.deleteCharAt(ans.length()-1);
						apd=false;
					}
				}
				break;
			case 1:
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(tmp==1) {
					if(ans.charAt(ans.length()-1)=='0') {
						ans.deleteCharAt(ans.length()-1);
						ans.delete(ans.length()-7, ans.length()-1);
//						apd=false;
					}
					
				}
				break;
			case 2:
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(tmp==2) {
					if(ans.charAt(ans.length()-1)=='0'&&ans.charAt(ans.length()-2)=='0') {
						ans.deleteCharAt(ans.length()-1);
						ans.deleteCharAt(ans.length()-1);
						ans.delete(ans.length()-7, ans.length()-1);
//						apd=false;
					}
					else {
						if(ans.charAt(ans.length()-1)=='0') {
							ans.deleteCharAt(ans.length()-1);
							
						}
					}
					
				}
				if(tmp==1) {
					if(ans.charAt(ans.length()-1)=='0') {
						ans.deleteCharAt(ans.length()-1);
						ans.delete(ans.length()-7, ans.length()-1);
//						apd=false;
					}
				}
				break;
			case 3:
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(input.length()!=0) {
					tmp++;
					ans.append(input.charAt(input.length()-1));
					input.deleteCharAt(input.length()-1);
				}
				if(tmp==2) {
					if(ans.charAt(ans.length()-1)=='0'&&ans.charAt(ans.length()-2)=='0') {
						ans.deleteCharAt(ans.length()-1);
						ans.deleteCharAt(ans.length()-1);
						ans.delete(ans.length()-6, ans.length()-1);
//						apd=false;
					}
					else {
						if(ans.charAt(ans.length()-1)=='0') {
							ans.deleteCharAt(ans.length()-1);
						}
					}
					
				}
				if(tmp==1) {
					if(ans.charAt(ans.length()-1)=='0') {
						ans.deleteCharAt(ans.length()-1);
						ans.delete(ans.length()-6, ans.length()-1);
//						apd=false;
					}
				}
				break;
			}
			if(input.length()==0) {
				while(ans.lastIndexOf("  ")!=-1) {
					ans.deleteCharAt(ans.lastIndexOf("  "));
				}
				
				return ans.reverse();
			}
			else {
				switch(count) {
				case 0:
//					if(apd)
					ans.append(" atahs ");
					count++;
					break;
				case 1:
//					if(apd)
					ans.append(" rajah ");
					count++;
					break;
				case 2:
//					if(apd)
					ans.append(" hkal ");
					count++;
					break;
				case 3:

					ans.append(" ituk ");
//					}
					
					count=0;
					break;
				}
			}
			
			
		}

	}
}
