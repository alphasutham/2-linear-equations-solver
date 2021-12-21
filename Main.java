import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Logika persamaaan");
        System.out.println();
        System.out.println("ax + ay = a");
        System.out.println("bx + by = b");
        System.out.println();
        Scanner ii = new Scanner(System.in);


        float ax = ii.nextFloat();
        float ay = ii.nextFloat();
        float a = ii.nextFloat();
        float bx = ii.nextFloat();
        float by = ii.nextFloat();
        float b = ii.nextFloat();

        System.out.println();
        System.out.println("Bentuk persa,aam");
        System.out.println(ax+"x"+" + "+ay+"y"+" = "+a);
        System.out.println(bx+"x"+" + "+by+"y"+" = "+b);

        float cara1x,cara2,cara1y,cara1,cara2x,cara2y,hitungan2,hitungan3;

        cara1x=ax*bx;
        cara1y=ay*bx;
        cara1=a*bx;
        cara2=b*ax;
        cara2x=bx*ax;
        cara2y=by*ax;

        System.out.println();
        System.out.println("Menyamakan x");
        System.out.println(cara1x+"x"+" + "+cara1y+"y"+" = "+cara1);
        System.out.println(cara2x+"x"+" + "+cara2y+"y"+" = "+cara2);

        System.out.println();

        if (cara1x==cara2x){
            hitungan2=cara1y-cara2y;
            hitungan3=cara1-cara2;
        } else {
            hitungan2=cara1y+cara2y;
            hitungan3=cara1+cara2;
        }
        System.out.println("Eliminasi x");
        System.out.println(hitungan2+"y"+" = "+hitungan3);
        System.out.println("y"+" = "+hitungan3/hitungan2);
        System.out.println();

        System.out.println("Substitusi y");
        System.out.println(ax+"x"+" + "+(ay*hitungan3/hitungan2)+" = "+a);
        System.out.println(ax+"x"+" = "+a+" + "+((ay*hitungan3/hitungan2))*-1);
        System.out.println(ax+"x"+ "=" + (a+((ay*hitungan3/hitungan2))*-1));
        System.out.println("x = " + ((a+((ay*hitungan3/hitungan2))*-1)/ax));
        System.out.println();
        System.out.println("HP {"+"x"+" = "+(((a+((ay*hitungan3/hitungan2))*-1)/ax))+" y = " +hitungan3/hitungan2+"}" );
    }
}