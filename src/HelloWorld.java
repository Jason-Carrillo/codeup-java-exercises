public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello,");
        System.out.print(" World!");

        int myFavoriteNumber = 7;

        System.out.println(myFavoriteNumber);

        String myString = "3.14159";

        System.out.println(myString);

        float myNumber = 3.14F;

        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        int x = 4;
        x += 5;
        System.out.println(x);

        int a = 3;
        int b = 4;
        b *= a;

        System.out.println(b);

        int c = 10;
        int d = 2;

        c /= d;
        d -= c;

        System.out.println(d);
    }
}