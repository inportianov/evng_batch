

class ChdClass
{
       static int a = 10;

       public static void inc()
       {
          a += 1;
       }
}

class MainClass 
{
     public static void main(String args[])
       {
            ChdClass a = new ChdClass();
            ChdClass b = new ChdClass();
            ChdClass c = new ChdClass();
            
            ChdClass.inc();
            ChdClass.inc();
            ChdClass.inc();            

            System.out.println(a);
       }
}