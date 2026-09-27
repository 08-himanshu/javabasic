package shauryax.methodUserInput.add;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("h\t");
        int hk = scan.nextInt();
        System.out.println("hgs\t");
        int hk2 = scan.nextInt();

        test check = new test();
        check.First();
        int Sec = check.Second(hk, hk2);
        System.out.println("Sec =\t"+ Sec);

    }
    public void First(){
        int k = 83;
        int j = 92;
        int s = k + j;
        System.out.println("hks = "+ s);
    }
    public int Second( int hk, int hk2) {
        int l = hk;
        int m = hk2;
        int u = l + m;
        return u;
    }
}
