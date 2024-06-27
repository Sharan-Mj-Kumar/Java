public class DStackRunner {
	public static void main(String[] args) {
		DStack arr = new DStack();
		arr.push(5);
		arr.show();
		arr.push(10);
		arr.show();
		arr.push(15);
		arr.show();
		
		arr.pop();
		arr.show();
		arr.pop();
		arr.show();
	}
}