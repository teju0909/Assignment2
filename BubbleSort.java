import java.util.Scanner;

public class BubbleSort {
   
   static void bubbleSort (int a[])    // function to implement bubble sort  
   {  
       int n = a.length;  
       int i, j, temp;  
       for (i = 0; i < n; i++)  
       {  
           for (j = i + 1; j < n; j++)  
           {  
               if (a[j] < a[i])  
               {  
                   temp = a[i];  
                   a[i] = a[j];  
                   a[j] = temp;  
               }  
           }  
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
	        
	        bubbleSort(a2);//sorting array using insertion sort    
	           
	        System.out.println("\nAfter sorting array elements are :: ");    
	        for(int i:a2){    
	            System.out.print(i+" ");    
	        }    
	    }    
}
