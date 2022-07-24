package practice;

public class tasks {
    public static void main(String[] args) {

        int a=5;
        int b= (byte) a;
        System.out.println(b);

        short s = 13-(9/3*10);
        s += -10;
        boolean one = ('a' != 'b') && false;
        boolean two = one || true;
        System.out.println("s = " + s);
        System.out.println(two);

        long l=100;
        short k = (short) l;
        System.out.println("k = " + k);

        short m = 13+3*(10-6)%2;
        System.out.println(m);
        double d= 0.1;
        int calc = 13 + 50 * 2 + 70;
        System.out.println("calc = " + calc);

        double pi=3.14;
        boolean bo= 119%5==0;
        int num=0;

        if (pi > 3.14 && !bo) {
            num += 50;
        } else {
            num -=50;
        }
        if (!bo){
            num += 50;
        }
        System.out.println("num = " + num);

        double decimal = 13.142;
        int whole = (decimal <20) ? 20:10;
        System.out.println("whole = " + whole);

        String str = "5";
        System.out.println(str == "10");

        int check = 132;
        String mtr ="";
        if (check %2==0){
            mtr += check;
            if (check%5==0){
                mtr += 132;
            } else {
                mtr = "500";
            }
        } else {
            mtr += "123";
        }
        System.out.println("mtr = " + mtr);


        int one1 =5;
        int two2=2;
        if (one1-- > two2 *2) {
            System.out.println("hello");
        }

        int b1=100;
        int b2=15;

        int max =(b1>b2) ? b1+2:b2-4;

        System.out.println("max = " + max);
        }
    }

