package löschen;
public class DynamicArrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray<String> myArray = new DynamicArray<String>(String.class);
		
		myArray.add("Test1");
		myArray.add("Test2");
		myArray.add("Test3");
		
		myArray.remove("Test2");
		
		myArray.iteratorInit();
		
		while(myArray.hasNext()) {
			System.out.println(myArray.next());
		}
	}
}

