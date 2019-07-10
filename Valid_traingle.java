import java.util.Scanner;
public class Valid_triangle {

    void check(int n1,int n2,int n3)
    {
        if(((n1+n2)>n3) && ((n2+n3)>n1) && ((n3+n1)>n2))
        {
            System.out.println("The given triangle is a valid triangle. ");
        }
        else
        {
            System.out.println("The given triangle is not a valid triangle. ");
        }
    }
    public static void main(String args[])
    {
        Valid_triangle v=new Valid_triangle();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        v.check(n1,n2,n3);
    }

}
