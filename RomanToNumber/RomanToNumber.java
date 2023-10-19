import java.util.*;
public class RomanToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String romannumber = sc.nextLine();
        sc.close();
        System.out.println(romanToNumber(romannumber));
    }

    public static int romanToNumber(String s){
        int result=0;
        int previousValue = 0;

        for(int i=s.length()-1; i>=0; i--){
            char currentChar = s.charAt(i);
            int currentValue = 0;
            switch(currentChar){
                case 'I' :
                    currentValue = 1;
                    break;
                case 'V' :
                    currentValue = 5;
                    break;
                case 'X' :
                    currentValue = 10;
                    break;
                case 'L' :
                    currentValue = 50;
                    break;
                case 'C' :
                    currentValue = 100;
                    break;
                case 'D' :
                    currentValue = 500;
                    break;
                case 'M': 
                    currentValue = 1000;
                    break;
            }
            if(currentValue < previousValue){
                result -= currentValue;
            }else{
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
    
}
