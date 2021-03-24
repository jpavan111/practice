package practice;

public class LearningException {
			public static void main(String[] args) {
				
				try {
					int arr[]=new int[5];
					for(int i=0;i<5;i++) {
						arr[i]=i;
					}
					
					
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("array index exception happened");
				}
				
				catch(Exception e) {
					System.out.println("Parent of all");
				}
				finally {
					System.out.println("Any how going to run");
				}
				
			
			}
}
