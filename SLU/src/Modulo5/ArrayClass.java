package Modulo5;

public class ArrayClass {
	private int size;
	private int[] array = new int[size];
	
	public void setArray(int[] array)
	{
		this.array=array;
	}
	
	public void setSize(int size)
	{
		this.size=size;
	}
	
	public ArrayClass(int[] array, int size)
	{
		this.size = size;
		this.array = array;
	}
	
	public static void printArray(int[] array, int index)
	{
		if(index == array.length)
		{
			return;
		}
		
		System.out.print(array[index]+" ");
		
		printArray(array, index+1);
	}
	
}
