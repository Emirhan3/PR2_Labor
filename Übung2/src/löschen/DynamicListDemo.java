package löschen;
public class DynamicListDemo {

	public static void main(String[] args) {
		DynamicList<String> dynList = new DynamicList<String>();
		
		dynList.add("Test1");
		dynList.add("Test2");
		dynList.add("Test3");
		
		dynList.remove("Test2");
		
		dynList.iteratorInit();
		
		while(dynList.hasNext()) {
			System.out.println(dynList.next());
		}
	}

}

