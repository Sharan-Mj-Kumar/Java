public class QueueRunner {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue(25);
		q.enqueue(30);
		
		q.enqueue(35);
		q.enqueue(40);
		
		System.out.println("Size of the Queue :" + q.getSize());
		System.out.println("Queue is Empty :" + q.isEmpty());
		System.out.println("Queue is Full :" + q.isFull());
		q.show();
	}
}