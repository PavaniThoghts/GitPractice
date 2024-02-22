package Arrays;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ 
			  int a[] = { 1, 2, 3, 4, 5 }; 
			  for (int i = a.length - 1; i >= 0; i--) 
			  { 
			   //System.out.println(a[i] + " "); 
			  } 
			 } 
		
		
		int b [] = {9,4,7,3,8,4,6};
		for (int i = b.length-1; i>=0; i--)
		{
			//System.out.println(b[i]);
		}
		
		String str = "success";
		for(int i =str.length()-1; i>0; i--)
		{
			System.out.println(str.charAt(i));
		}

	}

}
