import java.util.*;
public class PangramChecking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        boolean check = pangramcheck(input);

        if(check){
            System.out.println("This input is pangram");
        } else{
            System.out.println("This input is not pangram");
        }

    }

    public static boolean pangramcheck(String s) {
        boolean[] arr = new boolean[26];

        s=s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[ch-'a']=true;
            }
        }

        for(int i=0;i<26;i++){
            if(!arr[i]){
                return false;
            }
        }

        return true;
    }
}