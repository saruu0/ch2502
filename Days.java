class Days
{
   public static void main(String args[])
   {
	int n=111;
	if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
        {
	System.out.println("number of days=31");
	}
	else if(n==4||n==6||n==9||n==11)
	{
	System.out.println("number of days=30");
	}
	else if(n==2)
	{
	System.out.println("number of days=28 or 29(if leap year)");
	}
	else
	{
	System.out.println("Invalid input");
	}
   }
}
