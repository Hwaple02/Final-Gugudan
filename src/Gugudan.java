import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("어떻게 출력할까요?: ");
		Scanner s = new Scanner(System.in);
		String inputValue = s.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		if( first < 2 || second < 1 )
		{
			System.out.println("지원하지 않는 범위입니다.");
		}
		else
		{
			for(int i=2; i<first+1; i++)
			{
				System.out.println(i + "단을 출력합니다.");
				for(int k=0; k<second; k++)
				{
					System.out.println(i + " * " + (k+1) + " = " + i*(k+1));
				}
			}
		}
	}
}