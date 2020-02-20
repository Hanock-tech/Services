package vedhika;

public class Testcase1 
{
public static void main(String []args)
{
	int c,n=20 ,sum=0;

for(int i=2;i<=n;i++)
{
	c=0;
	for(int j=2;j<=i;j++)
	{
		if(i%j==0)
		{
			c++;
	
		}
	}
	

	if(c==0)
	{
		System.out.print("hannock");
		System.out.println(i);
		
		sum=sum+i;
	}

	

}
System.out.println(sum);
}
}
