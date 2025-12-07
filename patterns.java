public class patterns{
    public static void main(String args[])
    {
        //character pattern print
        char ch='A';
        int n=4;
        int k = 1;
        for(int i = 0;i<n;i++)
        {
            for(int j=0; j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
}