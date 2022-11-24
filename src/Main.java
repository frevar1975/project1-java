public class Main {
    public static void main(String[] args) {
        int resultant = 0;
        resultant= suma (3,2,3);
        System.out.println(resultant);
        Coche Micoche = new Coche();
        Micoche.addpuerta(2);
   }
    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
    }
   final class Coche{
       public int puertas = 4;
       public void addpuerta(int nuevapuerta)
       {
           this.puertas= puertas + nuevapuerta;
           System.out.println(puertas);
       }
   }

