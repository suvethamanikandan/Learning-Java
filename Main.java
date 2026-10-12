import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={11,34,67,14,98,4,75,2};
		int i;
		System.out.println(arr[4]);
		arr[7]=26;
		System.out.println(arr[7]);
		System.out.println(arr.length);
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i]+ " ");
	}
}
