public class Runner {
	public static void main(String args[]) {
		Linkedlist list = new Linkedlist();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insertAtStart(0);
		list.insertAt(1,7);
		list.deleteAt(3);
		
		list.show();
	}

}