package kuy8;

public class booleanToString {

    public static String convert(boolean b) {
        // return b ? "true" : "false";

        if(b==true){
            return  "true";
        }
       else return "false";
    }

    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
        System.out.println(convert(3>2));
    }
}
