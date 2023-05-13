import java.util.Scanner;

public class QuickSort 
{  
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; // pivot element  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        if (a[j] < pivot)  
        {  
            i++; 
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  
/* function to implement quick sort */  
void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);  //p is partitioning index  
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  
/* function to print an array */  
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  

    public static void main(String[] args) {  
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter How Many Elements You Want In Array ::");
    int n = sc.nextInt();  
    int a[] =new int[n];
    System.out.println("Enter Elements ::");
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("\nBefore sorting array elements are :: ");  
    QuickSort q1 = new QuickSort();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are :: ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
}  