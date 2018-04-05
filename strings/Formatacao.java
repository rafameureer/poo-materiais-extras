public class Formatacao {
  public static void main(String[] args) {
    String s = "Minha String";
    int i = 5;
    double d = 9.998;
    System.out.printf("%s \n",s);
    System.out.printf("%d \n",i);
    System.out.printf("%f \n",d);
    System.out.printf("%.1f \n",d);
    System.out.printf("%.2f \n",d);
    System.out.printf("%.3f \n",d);
    System.out.printf("%.4f \n",d);
    System.out.printf("%s %d %.2f \n",s,i,d);
    
    System.out.println("--------------------------");
    
    System.out.println(String.format("%s",s));
    System.out.println(String.format("%d",i));
    System.out.println(String.format("%f",d));
    System.out.println(String.format("%.1f",d));
    System.out.println(String.format("%.2f",d));
    System.out.println(String.format("%.3f",d));
    System.out.println(String.format("%.4f",d));
    System.out.println(String.format("%s %d %.2f",s,i,d));
  }
}
