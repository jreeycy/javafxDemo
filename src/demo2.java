public class demo2 {


    public static void main(String[] args) {
        String a="A";
        String b="B";
        String a1="A";
        System.out.println(a==a1);
        String w="A"+"B";
        String c="AB";
        System.out.println(a+b==c);
        System.out.println((a+b).equals(c));

        int i=5;

        int x=(i/7>=1)?i-7:i;
        int y=i/7>=1? 2:1;
        System.out.println(x);
        System.out.println("y:"+y);


    }
}
