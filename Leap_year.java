import java.util.Scanner;
public class Leap_year {

    void check(int n)
    {
        if(n%4==0 || n%400==0)
        {
            System.out.println("The year "+n+" is a leap year");
        }
        else
        {
            System.out.println("The year "+n+" is not a leap year");
        }
    }
    public static void main(String args[])
    {
        Leap_year l=new Leap_year();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        l.check(n);
    }

    }
