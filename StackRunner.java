public class StackRunner {
	public static void main(String[] args) {
		Stack arr = new Stack();
		arr.push(5);
		arr.show();
		arr.push(10);
		arr.show();
		arr.push(15);
		arr.show();
		
		System.out.println("Poped Element :" + arr.pop());
		arr.show();
		System.out.println("Size of Stack :" + arr.size());
		
	}
	
}