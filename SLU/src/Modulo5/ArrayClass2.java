package Modulo5;

import java.util.Scanner;

public class ArrayClass2 {
	private int size;
	private int[] array;
	
	public void setSize(int size)
	{
		this.size=size;
	}
	
	public int[] getArray()
	{
		return array;
	}
	
	public ArrayClass2( int size)
	{
		this.size = size;
		this.array = new int[size];
	}
	
	public void WriteArray( int initialIndex)
	{
		Scanner scanner = new Scanner(System.in);
		
		if(initialIndex == array.length)
		{
			return;
		}
		System.out.println("Digite o proximo elemento");
		array[initialIndex] = Integer.parseInt(scanner.nextLine());
		
		WriteArray(initialIndex+1);
	}	
	
	public void printArray(int initialIndex)
	{
		if(initialIndex==0)
		{
			System.out.print("A matrix é: ");
		}
		if(initialIndex == array.length)
		{
			return;
		}
		
		System.out.print(array[initialIndex]+" ");
		
		printArray(initialIndex+1);
	}
	
}
