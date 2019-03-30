public class UserOfOrderedList {
    public static void main(String[] commandLine) {
	OrderedList_inArraySlots orderedList = new OrderedList_inArraySlots();
	int[] intArray = new int[] {8,4,5,1,2,2,6};
	for(int val: intArray) {
	    orderedList.add(val);
	    System.out.println(orderedList);
	}
	int a = orderedList.getIndex(8);
	orderedList.remove(4);
	System.out.println(orderedList);
    }
}
