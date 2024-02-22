package Arrays;

public class maxNumber {
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{6,7,8,9}};
		int max = a[0][0];
		for(int i = 0; i<2; i++)
		{
			for(int j = 0; j<4; j++)
			{
				if(a[i][j]>max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
