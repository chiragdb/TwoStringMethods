public class TwoStringMethods {
    public static void main(String[] args) {
        abcTest("labcdeffdsafdl");
        alternateStrings("hi", "there");
    }

    public static boolean abcTest(String input) {
        int locationOfDot = input.indexOf(".");
        String checkABC = input.substring(locationOfDot + 1, locationOfDot + 4);
        if (checkABC.equals("abc")){
            return false;
        }
        return true;
    }

    public static String alternateStrings(String str1, String str2) {
        String output = "";
        int smallValue = findSmallest(str1.length(), str2.length());
        for (int i = 0; i < smallValue; i++ ){
            output = output + str1.substring(i, i + 1) + str2.substring(i, i + 1);
        }
        if (str1.length() > str2.length()){
            output = output + str1.substring(smallValue);
        }
        if (str2.length() > str1.length()){
            output = output + str2.substring(smallValue);
        }
        return output;
    }

    public static int findSmallest(int length1, int length2){
        int smallest = 0;
        if (length1 > length2) {
            smallest = length2;
        } else {
            smallest = length1;
        }
        return smallest;
    }
}


