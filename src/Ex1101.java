import java.util.Scanner;
public class Ex1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("나누고 싶은 숫자를 입력하세요 : ");
		int num = s.nextInt();
		
		int arr[] = new int[5];
		
		
		// try블록
		try {
			arr[num] = 10 / num;
			System.out.println("결과: " + arr[num]);
			
		} // catch블록
		catch(ArithmeticException e) { //수학예외
			
			System.out.println("0이 아닌 값을 입력하세요!");
			System.out.println(e.getMessage());
			


		}
		catch(ArrayIndexOutOFBoundsException e) { //배열 인덱스 예외
			
			System.out.println("올바른 인덱스를 입력하세요 [0,5]");
			System.out.println(e.getMessage());
		}	
		catch(Exception e)  
		{
			System.out.println("올바른 숫자를 입력하세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}//finally블록
		finally {
			System.out.println("예외 발새 영부와 상관없이 항상 실행됩니다.");
		}
		System.out.println("try-catch 블록의 외부 문장입니다.");

		
	}

}
