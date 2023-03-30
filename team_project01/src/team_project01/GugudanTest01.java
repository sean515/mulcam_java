package team_project01;

public class GugudanTest01 {

	public static void main(String[] args) {
		//구구단
		
		System.out.println("\t구구단");
		
		//1,4,7
		for(int i=1; i<=9; i+=3) {//1,4,7
			//각 단의 제목
			for(int j=i; j<i+3; j++) {
				System.out.print("=="+j+"단==\t");
			}
			System.out.println();
			for(int k=2; k<=9; k++) {//2,3,4,5,6,7,8,9
				for(int j=i; j<i+3; j++) {//1->1,2,3	4->4,5,6	7->7,8,9
					System.out.print(j+"*"+k+"="+(j*k)+"\t");
				}
				System.out.println();
			}
		}
	}//main 끝

}
