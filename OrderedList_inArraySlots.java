public class OrderedList_inArraySlots {
    public List_inArraySlots ref;
    
    public OrderedList_inArraySlots() {
	ref = new List_inArraySlots();
    }

    public String toString() {
	return ref.toString();
    }

    public boolean add(int val) {
	boolean added = false;
	List_inArraySlots newRef = new List_inArraySlots();
	for(int index = 0; index < ref.size(); index++) {
	    if (ref.get(index) < val) newRef.add(ref.get(index));
	    else {
		if (! added) {
		    newRef.add(val);
		    newRef.add(ref.get(index));
		    added = true;
		}
		else {
		    newRef.add(ref.get(index));
		}
	    }
	}
	if (! added) newRef.add(val);
	ref = newRef;
	return true;
    }

    public int getIndex(int val) {
	for(int index = 0; index < ref.size(); index++) {
	    if (ref.get(index) == val) return index;
	}
	return -1;
    }

    public int remove(int val) {
	ref.remove(getIndex(val));
	return val;
    }

}
