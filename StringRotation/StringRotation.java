import java.util.regex.*;

public class StringRotation{
    public static void main(String args[]){
        System.out.println(isSubstring("hello", "hello world"));
        System.out.println(isSubstring("h", "hello world"));
        System.out.println(isSubstring("goodbye", "hello world"));

        System.out.println("\nString Rotation part\n-----------------------");
        System.out.println(isStringRotationBruteForce("erbottlewat", "waterbottle"));
        System.out.println(isStringRotationBruteForce("monsters", "waterbottle"));
        System.out.println(isStringRotationBruteForce("bottlf", "waterbottle"));
        System.out.println(isStringRotationBruteForce("w", "waterbottle"));

        System.out.println("\nString Rotation part 2 \n-----------------------");
        System.out.println(isStringRotationOneCall("erbottlewat", "waterbottle"));
        System.out.println(isStringRotationOneCall("monsters", "waterbottle"));
        System.out.println(isStringRotationOneCall("bottlf", "waterbottle"));
        System.out.println(isStringRotationOneCall("w", "waterbottle"));
        System.out.println(isStringRotationOneCall("milkchocolate", "chocolatemilk"));

    }

    public static boolean isSubstring(String smallS, String bigS){
        if(smallS.equals("")||bigS.equals("")) return false;
        else if (smallS.length()>bigS.length()) return false;

        else{
            Pattern pattern = Pattern.compile(smallS);
            Matcher matcher = pattern.matcher(bigS);
            boolean matchFound = matcher.find();
            if(matchFound) return true;
            else return false;
        }
    }

    public static boolean isStringRotationBruteForce(String rotate, String original){
        if(rotate.length()!=original.length() || rotate.length()==0) return false;
        String rotateTemp = rotate;
        int index=-1;
        for(int i=rotate.length()-1; i>=0; i--){
            if (rotateTemp.equals("")){
                System.out.println("Empty string returning false");
                return false;
            }
            if(isSubstring(rotateTemp, original)){
                index = i;
                System.out.println("Breaking! index is "+index); 
                //System.out.println(rotate.substring(index+1));
                break;
            }
            rotateTemp = rotateTemp.substring(0,i);
            //System.out.println(rotateTemp);
        }
        if(index<0 || index > original.length()) return false;
        String possible = rotate.substring(index+1) + rotate.substring(0,index+1);
        System.out.println(possible);
        return original.equals(possible);
    }

    public static boolean isStringRotationOneCall(String rotate, String original){
        if(rotate.length()!=original.length()||rotate.length()==0) return false;

        String doubleRotate = rotate + rotate;
        System.out.println(doubleRotate);
        return isSubstring(original, doubleRotate);
    }
}