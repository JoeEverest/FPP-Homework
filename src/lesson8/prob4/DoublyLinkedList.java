package lesson8.prob4;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//1. adds to the end of the list
		public void addLast(String item){
			if(item==null|| item.isEmpty()) return;
			//implement
			Node last;
			if(header.next == null) {
				last = header;
			}else{
				Node current = header.next;
				while (current.next != null){
					current = current.next;
				}
				last = current;
			}

			Node newItem = new Node();
			newItem.value = item;

			last.next = newItem;
			newItem.previous = last;
		}
		// 2. Remove by passing object
		public boolean remove(String item){
			if(item == null || item.isEmpty()) return false;
			if(header.next == null) return false;
			//Implement
			Node current = header.next;
			Node found = null;
			while (current.next !=null){
				if(current.value.equals(item)){
					found = current;
					break;
				}else{
					current = current.next;
				}
			}

			if(found == null) return false;

			found.next.previous = found.previous;
			found.previous.next = found.next;
			found.value = null;

			return true;

		}

		// 3. Remove the First Node

		public boolean removeFirst() {
		  // Implement
			if(header.next == null) return false;

			Node currentFirst = header.next;

			header.next = currentFirst.next;
			currentFirst.next.previous = header;
			currentFirst.value = null;

			return true;
		}


		// 4. Prints the list from last to first
		 public void printReverse() {
		     // Implement
			 Node current = header;
			 while (current.next != null){
				 current = current.next;
			 }
			 Node last = current;
			 StringBuilder output = new StringBuilder("[");
			 while (last.previous != null){
				 output.append(last.value).append(", ");
				 last = last.previous;
			 }
			 output.append("\b\b]");

			 System.out.println(output);
		 }
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);

			// Call all your implemented Methods
			list.addLast("Kelvin");
			System.out.println("\nAdded item:\n"+list);

			System.out.println("\nReverse:");
			list.printReverse();

			list.removeFirst();
			System.out.println("\nRemoved first:\n"+list);

			list.remove("Harry");
			System.out.println("\nRemoved 'Harry':\n"+list);
		}
}
