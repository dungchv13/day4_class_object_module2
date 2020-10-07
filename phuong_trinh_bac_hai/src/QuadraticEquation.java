import java.util.Scanner;

public class QuadraticEquation {
private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2)-4 * this.a * this.c;
    }
    public double getRoot1(){
        if(getDiscriminant()<0){
            return 0;
        }else{
            return (-this.b+Math.sqrt(getDiscriminant()))/(2*this.a);
        }
    }
    public double getRoot2(){
        if(getDiscriminant()<0){
            return 0;
        }else{
            return (-this.b-Math.sqrt(getDiscriminant()))/(2*this.a);
        }
    }
    public void display(){
        System.out.println(this.a+"*X*X + "+this.b+"*X + "+this.c+"= 0");
    }
}
class Giai_phuong_trinh_bac_hai {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.print("Dk a != 0,nhap a:");
            String valueA = scanner.next();
            a = Double.parseDouble(valueA);
        }while(a == 0);
        System.out.print("nhap b:");
        String valueB = scanner.next();
        double b = Double.parseDouble(valueB);
        System.out.print("nhap c:");
        String valueC = scanner.next();
        double c = Double.parseDouble(valueC);

        QuadraticEquation bac_hai = new QuadraticEquation(a,b,c);
        bac_hai.display();
        if(bac_hai.getDiscriminant() < 0){
            System.out.println("phuong trinh vo nghiem");
        }else if(bac_hai.getDiscriminant() == 0){
            System.out.println("phuong trinh co 1 nghiem x = "+bac_hai.getRoot1());
        }else{
            System.out.println("phuong trinh co 2 nghiem \n x1 = "+bac_hai.getRoot1()+"\n x2 = "+bac_hai.getRoot2());
        }

    }
}
