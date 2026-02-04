import java.util.*;
public class Program {
    public static void main(String args[]){
        String s = "Hello world 123 test Apple";
        System.out.println("The string is: "+s);
        String result = firstLettersUpper(s);
        System.out.println("The result string is: "+result);
    }
    public static String firstLettersUpper(String sentence){
        char[] arr = sentence.toCharArray();
        String builder = "";
        for (int i=0;i<arr.length;i++){
            if ((arr[i] >= 'a' && arr[i] <= 'z') || 
                (arr[i] >= 'A' && arr[i] <= 'Z')){
                    builder += Character.toUpperCase(arr[i]);
                }
            else if ((arr[i] >= '0' && arr[i] <= '9') || 
                (arr[i] == ' ')){
                    i++;
                    while((i < arr.length) && !Character.isLetter(arr[i])){
                        i++;
                        }
                    if ((i< arr.length) && ((arr[i] >= 'a' && 
                            arr[i] <= 'z') || (arr[i] >= 'A' && 
                                                    arr[i] <= 'Z'))){
                                builder += Character.toUpperCase(arr[i]);
                        }
            }
        }
        String result = builder;
        return result;
    }
}
