package Modulo5;

import java.util.Scanner;

public class ArrayClass {
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
	
	public ArrayClass( int size)
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
	
	public void printArrayReverse(int initialIndex)
	{
		if(initialIndex==array.length)
		{
			System.out.println("A matrix reversa é: ");
		}
		if(initialIndex == 0)
		{
			return;
		}
		
		System.out.println(array[initialIndex-1]+" ");
		
		printArray(initialIndex-1);
	}
	
	public int minimoRecursive(int initialIndex)
	{
		
		
		return 0;
	}
	
}
