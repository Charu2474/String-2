import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        String str1 = v.nextLine();
        StringBuilder ans = new StringBuilder();
        String[] str = str1.split(" ");
        for(int i=0;i<str1.length();i++) 
        {
            char c = str1.charAt(i);
            if(Character.isUpperCase(c)) 
            {
                ans.append((char)(c + 2));
            }
            else if(Character.isLowerCase(c)) 
            {
                ans.append((char)(c + 2));
            }
            else if(Character.isDigit(c)) 
            {
                ans.append((char)(c + 2));
            }
            else
            {
                ans.append(c);
            }
        }
        System.out.println(ans.toString());
    }
}
