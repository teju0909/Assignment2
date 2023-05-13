import java.util.Scanner;

public class MergeSort {
	static void merge(int a[], int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	      
	   /* temporary Arrays */  
	        int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  
	      
	    /* copy data to temp arrays */  
	    for (i = 0; i < n1; i++)    
	    LeftArray[i] = a[beg + i];    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	    i = 0; /* initial index of first sub-array */  
	    j = 0; /* initial index of second sub-array */   
	    k = beg;  /* initial index of merged sub-array */  
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	  
	static void mergeSort(int a[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, beg, mid, end);  
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
	        //int mid = a2.length/2;
	        int end = a2.length-1;
	        mergeSort(a2,0,end);//sorting array using insertion sort    
	           
	        System.out.println("\nAfter sorting array elements are :: ");    
	        for(int i:a2){    
	            System.out.print(i+" ");    
	        }    
	    }    

}
