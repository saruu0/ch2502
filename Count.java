class Count
{
    public static void main(String args[])
    {
     int start=20,end=30,count=0;
	while(start<=end)
	{
	if(start%2==0)
          count+=1;
        start++;
        }
      System.out.println("count of even numbers between 20 to 30 is "+count);
        if(count%2==0)
          System.out.println("count "+count+" is even");
        else
	  System.out.println("count "+count+" is odd");
       }
}