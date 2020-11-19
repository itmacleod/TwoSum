
public class Main {

	public static void main(String[] args) {
		
		int[] array = {3,2,4};
		int[] answer = new int[2];
		
		int target = 6;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i != j) {
					if(array[i] + array[j] == target) {
						answer[0] = j;
						answer[1] = i;
					}
				}
			
			}
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

}
	

}
