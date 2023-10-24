package ch05.sec06;

public class ArrayCreateByNewExample2 {

	public static void main(String[] args) {
		//배열의 초기값
		
		int[] arr1 = new int[3]; //new int[배열의크기]
		
		printArr1 (arr1);
		
		System.out.println();
	
		//배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		printArr1 (arr1);
		
		
		System.out.println("\n");
		
		
		double[] arr2 = new double[3];
		
		printArr2 (arr2);
		
		System.out.println();
		
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		
		
		
		
		printArr2 (arr2);
		
		System.out.println("\n");
		
		
		String[] arr3 = new String[3];
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		System.out.println();
		
		
	}
		public static void printArr1(int[] arr1) {
			for(int i = 0; i<arr1.length; i++) {
				System.out.print("arr1 [" + i + " ] : " + arr1[i] + ", ");
			}
		}
		public static void printArr2(double[] arr2) {
			for(int i = 0; i<arr2.length; i++) {
				System.out.print("arr2 [" + i + " ] : " + arr2[i] + ", ");
			}
		}
		public static void printArr3(String[] arr3) {
			for(int i = 0; i<arr3.length; i++) {
				System.out.print("arr3 [" + i + " ] : " + arr3[i] + ", ");
			}
		}
}
