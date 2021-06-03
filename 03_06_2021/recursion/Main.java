public class Main {
    public static void main(String[] args) {
        System.out.println(F(9));
    }

    public static void getChange(int num){
        if (num>=10){
            System.out.println(10);
            getChange(num-10);
        }else if (num>=5){
            System.out.println(5);
            getChange(num-5);
        }else if (num>=2){
            System.out.println(2);
            getChange(num-2);
        }else if (num>=1){
            System.out.println(1);
            getChange(num-1);
        }
    }

    public static int F(int n)
    {
        if (n > 3)
            return F(n-2) + F(n/2);
        else
            return n;
    }

     // System.out.println(F(9))
    /*F(9) = F(7) + F(4) = 8 + 4 = 12;
    F(7) = F(5) + F(3) = 8;
    F(5) = F(3) + F(2) = 5;
    F(4) = F(2) + F(2) = 4;
    F(3) = 3;
    F(2) = 2;*/
}
