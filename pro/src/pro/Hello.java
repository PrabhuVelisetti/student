package pro;

interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
class Hello implements A,B
{
    public static void Main(String args[])
    { 
    	A a =new Hello();
       System.out.println(a.x);
       
      
    }
}
