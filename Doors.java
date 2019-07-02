import java.util.* ;
class Doors
{
	public static void main(String args[])
	{
		
		int status[]=new int[10];
		int i,j,number,n;
		System.out.println("Enter the number of persons");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
			status[i]=0;
		}
		n=number;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j%i==0)
				{
					if(status[j]==0)
					{
						status[j]=1;
					}
					else
					{
						status[j]=0;
					}
				}
			}		
		}
		for(i=1;i<=n;i++)
		{
			System.out.println(status[i]);
		}
	}
}