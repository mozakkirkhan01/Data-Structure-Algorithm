public class HollowRectangle
{
    public static void ZeroOneTriangle(int n)
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println("");
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

    public static void Butterfly(int n)
    {
        for(int i = 1; i<=n ; i++)
        {
            //star
            for( int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            // spaces

            for(int k =1; k<= (2*(n-i)) ; k++)
            {
                System.out.print(" ");
            }
            //star
            for(int m = 1; m<=i; m++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for( int i = n ;i>=1; i--)
        {
            for(int j = 1 ;j<=i ;j++)
            {
                System.out.print("*");
            }
            for(int k = 1 ; k<=(2*(n-i)); k++)
            {
                System.out.print(" ");
            }
            for ( int l=1; l<=i; l++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    
        //outerLoop
        // for(int i = 1; i<=row; i++)
        // {
        //     for(int j=1; j<=col; j++)
        //     {
        //         if(i==1 || i==row || j==1 || j==col)
        //         {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println("");
        // }
    
    public static void main(String args[])
    {
        // HollowRect(6, 9);
        // InvertRect(6,9);
        // FloydTriangle(4);
        // ZeroOneTriangle(4);
        Butterfly(4);
    }
}