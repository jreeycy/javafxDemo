import java.util.*;



   import java.util.Arrays;

    public class demo {
        public static boolean judgeDeck(String hiddenState){
        /*This method is used to judge whether a substring of deck is correct.
        But it doesn't consider the empty situation.
        * */
            if (hiddenState.length()%2!=0)return false;
            char []beforeSort=new char[hiddenState.length()/2];
            char []afterSort=new char[hiddenState.length()/2];
            char []x=hiddenState.toCharArray();
            for (int i=0,k=0;i<x.length;i+=2,k++){
                beforeSort[k]=x[i];
                afterSort[k]=x[i];
            }
            for (char c:beforeSort){
                if (c!='a' && c!='b' && c!='c' && c!='d' && c!='j' && c!='m'){
                    return false;
                }
            }
            Arrays.sort(afterSort);
            if (!Arrays.equals(beforeSort,afterSort)){
                return false;
            }
            for (int i=0;i<hiddenState.length()-4;i+=2){
                if (hiddenState.substring(i,i+1).equals(hiddenState.substring(i+2,i+3))){
                    if (Integer.parseInt(hiddenState.substring(i+1,i+2))>Integer.parseInt(hiddenState.substring(i+3,i+4)))
                        return false;
                }
            }

            return true;
        }
        public static boolean isHiddenStateWellFormed(String[] hiddenState) {
            if(hiddenState.length!=3)return false;
            if (hiddenState[1].length()==0 || hiddenState[2].length()==0 ){
                return false;
            }
            //check whether hiddenState[0] is correct
            if (hiddenState[0].length()!=0){
                if (!judgeDeck(hiddenState[0])){
                    return false;
                }
            }
            //check whether hiddenState[1] and  hiddenState[2] is correct
            if(!hiddenState[1].substring(0,1).equals("A") ){
                return false;
            }
            if(!hiddenState[2].substring(0,1).equals("B") ){
                return false;
            }
            if (hiddenState[1].length()>1){
                if (!judgeDeck(hiddenState[1].substring(1))){
                    return false;
                }
            }
            if (hiddenState[2].length()>1){
                if (!judgeDeck(hiddenState[2].substring(1)))return false;
            }
            return true;
            //FIXME TASK 3
        }

    }


