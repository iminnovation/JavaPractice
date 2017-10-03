package com.java.practice;

import java.util.Scanner;

class MatrixMultiplications{
 
   public static void main(String args[])
   {
 
      int row1, col1, row2, col2; 
      int sum = 0, i, j, k;
 
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
 
      System.out.println("***Enter the number of rows & columns of first matrix***");
 
      row1 = in.nextInt();
      col1 = in.nextInt();
 
      int first[][] = new int[row1][col1];
 
     System.out.println("Scan elements of first matrix");
 
      for ( i = 0 ; i < row1 ; i++ )
         for ( j = 0 ; j < col1 ; j++ )
            first[i][j] = in.nextInt();
 
      System.out.println("###Enter the number of rows & columns of second matrix###");
 
      row2 = in.nextInt();
      col2 = in.nextInt();
 
     if ( col1 != row2 )
         System.out.println("Coloumn count of first matrix doesnt match with number of rows in second matrix so the entered orders can't be multiplied with each other.");
      else
      {
         int second[][] = new int[row2][col2];
         int multiply[][] = new int[row1][col2];
         System.out.println("Scan the elements of second matrix");
 
         for ( i = 0 ; i < row2 ; i++ )
            for ( j = 0 ; j < col2 ; j++ )
               second[i][j] = in.nextInt();
 
         for ( i = 0 ; i < row1 ; i++ )
         {
            for ( j = 0 ; j < col2 ; j++ )
            {   
               for ( k = 0 ; k < row2 ; k++ )
               {
                  sum = sum + first[i][k]*second[k][j];
               }
               multiply[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Multiplication of matrices:-");
 
         for ( i = 0 ; i < row1 ; i++ )
         {
            for ( j = 0 ; j < col2 ; j++ )
               System.out.print(multiply[i][j]+"\t");
            System.out.print("\n");
         }
 
      }
 
   }
}