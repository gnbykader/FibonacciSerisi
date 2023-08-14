import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sayi,total = 0,n1=0,n2=1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz: ");
		sayi = inp.nextInt();
		System.out.println("Fibonacci Serisi: ");				
		for (int i = 0; i < sayi; i++) {
			System.out.print(n1+", ");
				total=n1+n2;
				n1=n2;
				n2=total;
						
			}
			
		}

	}


