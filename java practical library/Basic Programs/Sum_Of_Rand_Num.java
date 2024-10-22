// Use While loop to generate random numbers and maintain a running sum of these values.
// Terminate when the sum exceeds 20. (Note: use Math. random() method to obtain numbers.)

import java.util.Scanner;
import java.lang.Math;
class Sum_Of_Rand_Num{

    public static void sum_of_randomnumber()
    {
        Double sum=0.0;
        while(sum <=20)
        {
            // random number from 1 to 3
            Double randnum =Math.random()*3;
            sum = sum +randnum;
            System.out.println("random number : "+ randnum + "\n" + "sum :" + sum);
            
        }
        
        
    } 
    public static void main(String[] args) {
      
    Sum_Of_Rand_Num.sum_of_randomnumber();
    }
}
// output:
// random number : 0.026767798243128693
// sum :0.026767798243128693
// random number : 2.2853520785303214
// sum :2.3121198767734503
// random number : 0.22036107589930976
// sum :2.53248095267276
// random number : 2.223972498705227
// sum :4.756453451377987
// random number : 1.0290435247655494
// sum :5.785496976143536
// random number : 0.24178091613561226
// sum :6.027277892279148
// random number : 1.9065897530452678
// sum :7.9338676453244155
// random number : 0.43553811349001437
// sum :8.36940575881443
// random number : 0.526019568110517
// sum :8.895425326924947
// random number : 2.8674997963219946
// sum :11.76292512324694
// random number : 2.488972073729558
// sum :14.251897196976499
// random number : 0.5958709810092773
// sum :14.847768177985776
// random number : 1.1141309934880241
// sum :15.9618991714738
// random number : 1.6588630806190787
// sum :17.620762252092877
// random number : 2.1068686669273813
// sum :19.727630919020257
// random number : 0.28660907882633013
// sum :20.014239997846587
// PS Z:\java> 