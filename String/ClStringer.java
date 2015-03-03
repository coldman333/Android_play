package test.strs;


/**
 * Created by vova on 17.02.2015.
 */
public class ClStringer {

    public static void main(String[] args) {
        System.out.println("Arguments number N=" + getArgs(new String[]{ "123", "+12","-10"," sss","_sss","sss","99"}));
    }

    public static String getArgs(String[] args) {

        char chArr[];
        for( int i = 0; i< args.length; i++){
            chArr = args[i].toCharArray();
            if(chArr[0] == '-' ||  chArr[0] == '+'  || Character.isDigit(chArr[0])){
                System.out.println(i+ " is a Integer = " + args[i]);
            } else if(Character.isLetter(chArr[0])) {
                 System.out.println(i+ " is a string = " + args[i]);
            } else  if(Character.isSpaceChar(chArr[0])) {
                System.out.println(i+ " is  start  in  Space Char  = " + args[i]);
            } else {
                System.out.println(i+ " we  can't  recognize this  = " + args[i]);
            }

        }
        return " " + args.length;
    }



}
