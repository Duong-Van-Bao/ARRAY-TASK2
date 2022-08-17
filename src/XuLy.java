import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		lietKeTrongDoan(scan, a);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập N > 0 và n chẵn");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0 || n % 2 != 0);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = MIN + (int)(Math.random()*((MAX - MIN) + 1)); 
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		for(int pt: a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static void lietKeTrongDoan(Scanner scan, int a[]) {
		System.out.println("Nhập giá trị x dưới:");
		int x = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập giá trị x dưới:");
		int y = Integer.parseInt(scan.nextLine());
	    for(int pt: a) {
	    	if(pt >= x && pt <= y) {
	    		System.out.print(pt + "\t");
	    	}
	    }
	}
}
