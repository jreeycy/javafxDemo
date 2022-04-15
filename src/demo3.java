import java.util.Arrays;

public class demo3 {
    public static boolean canScore(String aHand,String bHand, char player, char species) {
        int sumValueA=0;
        int sumValueB=0;
        //gameState[1][1] is player A's hand

        for (int i=1;i<aHand.length();i+=2){
            int valueA=0;
            valueA=Integer.parseInt(aHand.substring(i+1,i+2));
            if(aHand.substring(i,i+1).equals(Character.toString(species))) {
                if (valueA==8){

                    if (contain1(bHand,species))
                    {valueA=0;
                    }
                }
                System.out.println(valueA+"vA");
                sumValueA+=valueA;
            }
        }
        for (int j=1;j<bHand.length();j+=2){
            int valueB=0;
            valueB=Integer.parseInt(bHand.substring(j+1,j+2));
            if (bHand.substring(j,j+1).equals(Character.toString(species))){
                if (valueB==8){
                    if (contain1(aHand,species))valueB=0;
                }

                sumValueB+=valueB;

            }
        }
        System.out.println("A:"+sumValueA);
        System.out.println("B:"+sumValueB);
        if (player=='A'){
            if (sumValueA<sumValueB)return false;
        }
        if (player=='B'){
            if (sumValueB<sumValueA)return false;
        }

        return true;
        // FIXME TASK 9
    }
    public static boolean contain1(String xHand,char species){
        char[]hand=xHand.toCharArray();
        System.out.println(Arrays.toString(hand));
        for (int i=1;i<xHand.length();i+=2){
            System.out.print(hand[i]+"  " +hand[i+1]);
            System.out.println(hand[i]==species && hand[i+1]=='1');
            if(hand[i]==species && hand[i+1]=='1'){
                System.out.println("nihaods");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canScore("Aa3b8c3d7j4m1m3","Ba5b1b7c1c4c7c8",'A','b'));

    }
}

