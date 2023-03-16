import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int dem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println("nhap y");
        y= scanner.nextInt();
        for (int i=2;i<=y;i++){
            double j=Math.sqrt(i);
            if (i==Math.pow(j,2)){
                dem++;
            }
        }
        System.out.println(dem);
    }
}