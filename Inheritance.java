public  class Inheritance 
{   
    private class SuperClass1 
    {
    String s1 = "I am a SuperClass1";
    }

   public class SubClass1 extends SuperClass1
    {
     String s = "I am a subclass";   
    }

    public static void main(String [] args)
    {   inheritance obj = new inheritance();
        SubClass1 obj1 = obj.new SubClass1();
        System.out.println(obj1.s);
        System.out.println(obj1.s1);
    }
}
