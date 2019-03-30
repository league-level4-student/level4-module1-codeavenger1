package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Object array[];
	
	public ArrayList() {
		array = new Object[1];
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
		for (int i = loc+1; i < array.length; i++) {
			ins[i+1]=array[i+1];
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}