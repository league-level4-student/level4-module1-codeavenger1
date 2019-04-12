package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Object array[];
	
	public ArrayList() {
		array = new Object[0];
	}
	
	public int size() {
		return array.length;
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return (T)array[loc];
	}
	
	public void add(T val) {
		Object arr[] = new Object[array.length+1];
		for (int i = 0; i < array.length; i++) {
			arr[i]=array[i];
		}
		arr[array.length]=val;
		array=arr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object ins[] = new Object[array.length+1];
		for (int i = 0; i < loc; i++) {
			ins[i]=array[i];
		}
		ins[loc]=val;
		for (int i = loc; i < array.length; i++) {
			ins[i+1]=array[i];
		}
		array=ins;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object re[] = new Object[array.length-1];
		for (int i = 0; i < loc; i++) {
			re[i]=array[i];
		}
		//
		for (int i = loc+1; i < array.length; i++) {
			re[i-1]=array[i];
		}
		array=re;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}
}