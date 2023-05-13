
public class StringBul {
	public static void main(String...e) {
		@SuppressWarnings("unused")
		char arry[] = {'N','i','k','i','t','a','a','k'};
		String re="";
		
		for(int i=0;i<arry.length;i++) {
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i]==arry[j]) 
				{
					re = re+" " + arry[i]; 
				}	
			}
		}
		
		System.out.print("Duplicate elements in array is : "+re);
	
		
	}
}
