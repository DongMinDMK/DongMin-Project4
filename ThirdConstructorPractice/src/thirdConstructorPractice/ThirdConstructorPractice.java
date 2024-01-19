package thirdConstructorPractice;

interface CompareNumber{
	public int compareTo(int n1, int n2);
}


public class ThirdConstructorPractice {

	public static void main(String[] args) {
		
		CompareNumber cn = new CompareNumber() {
			@Override
			public int compareTo(int n1, int n2) {
				return n1 > n2 ? 1 : n1 < n2 ? -1 : 0; //n1이 더 크면 1을 n2가 더 크면 -1을, 그리고 n1이 작거나 n2가 더 작으면 0을 반환
			}
		};
		
		int n1 = 20;
		int n2 = 10;
		
		int res = cn.compareTo(n1, n2);
		
		if(res > 0) {
			System.out.println("n1이 n2보다 크다.");
		}else if(res < 0) {
			System.out.println("n1이 n2보다 작다.");
		}else {
			System.out.println("n1과 n2이 0으로 같다.");
		}
		
		

	}

}
