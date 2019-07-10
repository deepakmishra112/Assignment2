import java.util.Scanner;
public class Upper_lower_character {

    void check(char ch)
    {
        if(ch>='A' && ch<='Z')
        {
            System.out.println("The character is in upper case");
        }
        else if(ch>='a' && ch<='z'){

            System.out.println("The character is in lower case");
        }
    }

    public static void main(String args[])
    {
        Upper_lower_character ulc= new Upper_lower_character();
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        ulc.check(ch);

    }

}
