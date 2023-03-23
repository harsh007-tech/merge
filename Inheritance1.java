public  class Inheritance1 
{   
    public static class SuperClass1 
    {
    String s1 = "I am a SuperClass1";
    }

    public static class SubClass1 extends SuperClass1
    {
     String s = "I am a subclass";   
    }

    public static void main(String [] args)
    {   
        SubClass1 obj1 = new SubClass1();
        System.out.println(obj1.s);
        System.out.println(obj1.s1);
    }
}
