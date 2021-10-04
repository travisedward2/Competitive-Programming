import javax.management.monitor.Monitor;

public class Main {
	
	public static void hanoi(int n, char A , char B , char C) {
		if(n==1)
			System.out.println("move disk "+n+" from "+ A +" to " + C);
		else {
			hanoi(n-1, A , C ,B);
			System.out.println("move disk "+n+" from "+ A +" to " + C);
			hanoi(n-1,B,A,C);
		}
		
	}
	public static void main(String[] argv) {
		
		hanoi(10,'A','B','C');
	}

}
