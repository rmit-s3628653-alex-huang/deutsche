import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 0, 1, 2, 3, 5 };
		int[] B = { 4, 3, 0, 0, 1 };
		boolean[] C = { false, true, false, false, false, true };
		int test = solution(A, B, C);
		System.out.println(test);
	}

	public static int solution(int[] A, int[] B, boolean[] C) {
		// write your code in Java SE 8
		LinkedList<int[]> list = new LinkedList<>();
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
			if (C[A[i]] == true) {
				System.out.println("infected" + A[i] + " " + B[i]);
				int[] array = {A[i],B[i]};
				list.add(array);
			}
		}
		for (int j=0;j<list.size();j++) {
			for (int k=0;k<list.size();k++) {
				if (list.get(j).equals(list.get(k))) {
					return j;
				}
			}
		}
		return -1;
	}

}
