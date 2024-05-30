package pro;

interface AA
{
   public void aaa();
}
interface BB
{
   public void aaa();
}
class Central implements AA,BB
{
   public void aaa()
   {
        System.out.println("prabhu");
   }
   public static void main(String args[])
   {
        Central c=new Central();
        c.aaa();
    }
}
