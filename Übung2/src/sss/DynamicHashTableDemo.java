package sss;
public class DynamicHashTableDemo {

	public static void main(String[] args) {
		DynamicHashTable dynTable = new DynamicHashTable(5);
		
		boolean a1 = dynTable.add(0, "Test1");
		boolean a2 = dynTable.add(10, "Test2");
		boolean a3 = dynTable.add(20, "Test3");

		System.out.println("DynamicHashTable");
		System.out.println(a1 + " " + dynTable.get(0));
		System.out.println(a2 + " " + dynTable.get(10));
		System.out.println(a3 + " " + dynTable.get(20));
		
		
		DynamicExtendableHashTable<String> dynTable2 = new DynamicExtendableHashTable<String>(String.class, 5);
		
		dynTable2.add(0, "Test1");
		dynTable2.add(10, "Test2");
		dynTable2.add(20, "Test3");
		
		
		System.out.println("DynamicExtendableHashTable");
		int keys[] = { 0, 10, 20 };
		for(int i = 0; i < 3; i++)
		{
			DynamicArray<String> a = new DynamicArray<String>(String.class);
			
			a = dynTable2.get(keys[i]);
			
			a.iteratorInit();
			
			while(a.hasNext()) {
				System.out.print(a.next() + " ");
			}
			
			System.out.println();
		}

	}

}

