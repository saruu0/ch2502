class add
{
    public static void main(String args[])
    {
     int num=4961,rem=0,count=0,temp=num,first_digit=0,sum=0,temp1=num;
     while(num!=0)      //4961!=0    //496!=0 //49!=0 //4!=0
     {
      rem=num%10;   //1  //6 //9  //4
      count++;    //1   //2//3 //4
      num=num/10;   //496  //49 //4  //0
       int m=(int)Math.pow(10,count-1);   //
       first_digit=temp/m;  //4961/1000
       sum=first_digit+rem;  //
       temp=temp%m;
       }
    System.out.print(sum+"   ");
    }
   
   
}
