package array;

import java.util.Scanner;

class main {
    
    public static void main(String[] args) {
        Double[][] a = {
            {18.5, 20.3, 19.8, 21.2, 22.1, 18.9, 20.0}, // Week 1
            {19.1, 21.0, 20.4, 22.2, 23.0, 19.5, 21.1}, // Week 2
            {20.0, 22.1, 21.7, 23.4, 24.0, 21.3, 22.5}, // Week 3
            {21.0, 23.0, 22.5, 24.5, 25.1, 22.0, 23.2}  // Week 4
        };
    //    Scanner sc = new Scanner(System.in); 
    //     System.out.println("enter the temp for four week :");
        
    //     for(int i=0;i<4;i++)
    //     {
    //         for(int j=0;j<7;j++)
    //         {
    //             a[i][j] = sc.nextDouble();
    //         }
        
    //     }

        for(int i=0;i<a.length;i++)
        {
            System.out.println("week : " + (i+1));
            Statistics.average(a[i]);
        
        }
    }

}

// output : 
// week : 1
// 20.114285714285717
// week : 2
// 20.900000000000002
// week : 3
// 22.142857142857142
// week : 4
// 23.04285714285714
// PS C:\Users\rcc.SYSTEMA21\Desktop>