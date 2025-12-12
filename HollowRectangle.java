public class HollowRectangle
{
    public static void FloydTriangle(int n)
    {
        int m = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(m);
                m++;
            }
            System.err.println("");
        }
    }

    public static void InvertRect(int row, int col)
    {
        for(int i=1;i<=row;i++)
        {
           for(int j=1; j<=row-i ;j++)
           {
            System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           System.out.println("");
        }
    }

    public static void HollowRect(int row, int col)
    {
        //outerLoop
        for(int i = 1; i<=row; i++)
        {
            for(int j=1; j<=col; j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        // HollowRect(6, 9);
        // InvertRect(6,9);
        FloydTriangle(4);
    }
}