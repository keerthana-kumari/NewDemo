
public class NumericPttern {
	public static void PrintNum(int n) {
		int i,j,num;
		for(i=0;i<n;i++)
		{
			num=1;
			for(j=n;j>i;--j)
			{
				System.out.print(num+ "");
				num++;
			}
			
			
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
	int n=5;
	PrintNum(n);
	

	}

}
