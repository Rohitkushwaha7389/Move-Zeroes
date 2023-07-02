mport java.util.Scanner;
class Fabonaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter Second number");
        int n2=sc.nextInt();
        System.out.print(n1+"  "+n2+"  ");
       // System.out.print("Enter Second number");

        int i;
       for(i=0; i<=30; i++){
      int t;
      t=n2;
      n2=t+n1;
      n1=t;
      System.out.print(n2 +"  ");

        
       }
    }
}
