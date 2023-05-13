import java.util.Scanner;

public class SelectionSort {
	  public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter How Many Elements You Want In Array ::");
	        int n = sc.nextInt();  
	        int a2[] =new int[n];
	        System.out.println("Enter Elements ::");
	        for(int i=0;i<n;i++) {
	        	a2[i]=sc.nextInt();
	        }
	        System.out.println("\nBefore sorting array elements are :: ");  
	        for(int i:a2){  
	            System.out.print(i+" ");  
	        }  
	        selectionSort(a2);//sorting array using selection sort  
	         
	        System.out.println("\nAfter sorting array elements are :: ");  
	        for(int i:a2){  
	            System.out.print(i+" ");  
	        }  
	    }  
	
}
