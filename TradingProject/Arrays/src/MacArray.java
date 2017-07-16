import java.util.*;
//It stores doubles in an  array
//

public class MacArray {

	private double[] arr;
	private String name = "Unknown";
	private Date Dates;
	private int size = 0;
	private int Capacity;
	
	
	//default constructor creates an array of 100 elements 
		public MacArray() {
			size = 0;
			Capacity = 100;
			arr = new double[Capacity];
			
		}
	
	//constructor with max size
	public MacArray(int s){
		Capacity = s;
		arr = new double[s];	
		
	}
	
	public MacArray(int s, String name){
		Capacity = s;
		arr = new double[s];	
		this.name = name;
		
	}
	
	//method to return true if array is full
		public boolean isFull(){
			if (size >= arr.length)
				return true;
			return false;
		}
		//method to return true if it is empty and false if not
		public boolean isEmpty(){
			if(size == 0)
				return true;
			return false;
		}
	
	public void setName (String name){
		this.name = name;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public int getCapacity(){
		return this.Capacity;
	}
	
	public void push(double n){
		
		if(this.isFull()){
			System.out.println("Out of Capacity.");
			return;
		}
		
		arr[size] = n;
		size++;
		
	
	} 
	
	
	public void insertAt(int pos, double x){
	
		if(this.isFull() ||  pos <0 || pos > size){
			System.out.println("Out of Capacity.");
			return;
		}
		
		for(int i=size-1; i>=pos; i-- ){
		
			arr[i+1] = arr[i];
		}
		
		arr[pos] = x;
		size++;
		
	}
	
	public void insertTop(double x){
	
		if(this.isFull()){
			System.out.println("\nOut of Capacity.");
			return;
		}
		for(int i=size-1; i>=0; i-- ){
		
			arr[i+1] = arr[i];
		}
		
		arr[0] = x;
		size++;
		
	}
	
	public double removeFrom(int pos){
		
		
		if(pos <0 || pos > size){
			
			System.out.println("Index out of range. ");
			return -1;
		}
		double retVal = arr[pos];
		
		
		for(int i=pos; i<=size-1; i++ ){
		
			arr[i] = arr[i+1];
		}
		
		arr[size] = 0;
		size--;
		
		return retVal;
		
	}
	
	public double removeTop(){
		
		
		double retVal = arr[0];
		for(int i=0; i <= size-1; i++ ){
		
			arr[i] = arr[i+1];
		}
		
		arr[size] = 0;
		size--;
		return retVal;
	}

	public double removeTail(){
	
		double retVal = arr[size];
		arr[size] = 0;
		size--;
		
		return retVal;
	
}

	public void setElementAt(int pos ,double x){
	
		if(pos < 0 || pos > size){
			System.out.println("Index out of range.");
			return;
		}
		arr[pos] = x;
}

	public double getElementAt(int pos ){
	
		if(pos < 0 || pos > size){
			System.out.println("Index out of range.");
			return -1;
		}
		
	return arr[pos];
}

	public void resize(int l){
	
		
		if(l < size) 
			return;
		
	arr = Arrays.copyOf(arr, l);
	Capacity = l; 
}
	
	public int Capacity(){
		return arr.length;
	}
	
	
	public void printArr(){
		
		System.out.print("\n" + this.name + ": [");
		for(int i=0; i<size; i++){
			
			System.out.print(arr[i]+ ",  "  );
		}
		
		System.out.print("]");
	}
	
	public int smallestIndex(int start){
		
		int index = start;
		
		for(int i = start+1; i < size; i++){
			if(arr[index]>arr[i]){
				
		        index = i;
			}
			
		}
		
		return index;
		
		
	}
	
	public void sort() {
		for (int i =0; i < size -1; i++) {
			int indexS = smallestIndex(i);
			if (indexS != i) {
				//swap element at indexS with element at i
				double temp = arr[indexS];
				arr[indexS] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	
	public void BubbleSort(){
		boolean isSwapped = true;
		
		for(int j=0; j<size && isSwapped; j++){
			isSwapped = false;
			for(int i=0; i<size - j - 1; i++){
				
				if(arr[i] > arr[i+1]){
					
					double temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isSwapped = true;
				}
				
			}
			
		}
	}
		
		public void InsertionSort(){
			boolean isSwapped = true;
			
			
			
				for(int i=0; i<size - 1; i++){
					
					double temp=0;
					for(int j=1; j<size -1 ; j++){
						
					if(arr[i] > arr[j]){
						
						 temp = arr[j];
						
					}
					
					arr[j] = arr[i];
					arr[i]= temp;
				
				}
				
			}
		
	}
	
	public static void main(String[] args){
		

		
		
		
	}
}


