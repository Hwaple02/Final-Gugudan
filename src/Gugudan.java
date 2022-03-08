import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("몇단을 출력할까요?: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(n + " * " + n + " 단을 출력합니다.\n= " + n*n);
	}
}
