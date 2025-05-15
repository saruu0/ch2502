class Character
{
   public static void main(String args[])
   {
    char ch='*';
    int cha=(int)ch;
    if(cha>=65 && cha<=90)
    System.out.println("Character is a capital letter");
    else if(cha>90 && cha<=122)
    System.out.println("Character is a small letter");
    else if(cha>=48 && cha<=57)
    System.out.println("Character is a number");
    else
    System.out.println("Character is a special character");
    }
}
