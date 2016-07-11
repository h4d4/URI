package uriBeginner;

public class EvenNumbers {

	public static void even(){
		for(int i = 1; i < 101; i++ ){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even();
	}

}
