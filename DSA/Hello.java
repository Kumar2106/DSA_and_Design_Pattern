package DSA;
import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) throws IOException {
		int matrix[][] = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}};
		System.out.println(findMinOperation(matrix, matrix.length));
		

    }

	static void printBoundary(int matrix[][]){

		//size of the matrix
		int n = matrix.length;
		
		for(int i=0; i<n; i++){
			System.out.print(matrix[0][i] +" ");
		}

		for(int i=1; i<n; i++){
			System.out.print(matrix[i][n-1]+" ");
		}

		for(int i=n-2; i>=0; i--){
			System.out.print(matrix[n-1][i]+" ");
		}

		for(int i=n-2; i>=1; i--){
			System.out.print(matrix[i][0]+" ");
		}
	}

	//function to exchange matrix columns
	static void exchange_matrix_columns(int arr[][]){
		//size of the matrix
		int n = arr.length;

		for(int i=0; i<n; i++){
			int temp = arr[i][0];
			arr[i][0] = arr[i][n-1];
			arr[i][n-1]= temp;
		}
	}


	//utility function to print the matrix
	static void printMatrix(int matrix[][]){
		//size of the matrix
		int n = matrix.length;

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}

	//function to interchange first row and the last row of the matrix
	static void exchange_row(int matrix[][]){

		//size of the matrix
		int n = matrix.length;

		for(int i=0; i<n; i++){
			int temp = matrix[0][i];
			matrix[0][i] = matrix[n-1][i];
			matrix[n-1][i]= temp;
		}
	}

	//function to reverse the rows recursively
	static void exchange_row_recur(int matrix[][]){
		//size of the matrix
		int n = matrix.length;

		int l =0,r=n-1;

		while(l<r){

			for(int i=0; i<n; i++){
				int temp = matrix[i][l];
				matrix[i][l]= matrix[i][r];
				matrix[i][r]= temp;
			}

			l++;
			r--;
		}
	}

	//function to traverse matrix spirally
	static void spiral_traversal(int matrix[][]){

		//rows in matrix
		int r = matrix.length;

		//columns in matrix
		int c = matrix[0].length;

		int minr =0;
		int minc =0;
		int maxr= matrix.length -1;
		int maxc = matrix[0].length -1;

		int count =0;
		int total = r*c;

		while(count<total){

			//left wall
			for(int i=minr,j=minc; i<=maxr && count<total; i++){
				System.out.println(matrix[i][j]);
				count++;
			}
			minc++;

			//bottom wall
			for(int i=maxr,j= minc; j<=maxc && count<total; j++){
				System.out.println(matrix[i][j]);
				count++;
			}
			maxr--;

			//right wall
			for(int i=maxr,j=maxc; i>=minr && count<total; i--){
				System.out.println(matrix[i][j]);
				count++;
			}
			maxc--;

			//top wall
			for(int i=minr,j=maxc; j>=minc && count<total; j--){
				System.out.println(matrix[i][j]);
				count++;
			}

			minr++;

		}
	}

	//function to find minimum
	//operation required
	//to make sum of each row
	//and column equals

	static int findMinOperation(int matrix[][], int n){

		//Initialize the sumRow[]
		//and sumCol[] array to 0

		int []sumRow = new int[n];
		int []sumCol = new int[n];

		//calculate sumRow[] and 
		//sumCol[] array
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				sumCol[j] += matrix[i][j];
				sumRow[i] += matrix[i][j];
			}
		}

		//Find maximum sum value
		//in either row or in column
		int maxSum =0;
		for(int i=0; i<n; i++){
			maxSum = Math.max(maxSum, sumRow[i]);
			maxSum = Math.max(maxSum, sumCol[i]);
		}

		int count =0;

		for(int i=0,j=0; i<n && j<n;){
			System.out.println("Caught inside the for loop");

			//Find minimum increment 
			//required in either row
			//or column
			int diff = Math.min(maxSum-sumRow[i], maxSum-sumCol[i]);

			//Add difference in
			//corresponding cell,
			//sumRow[] and sumcol[]
			//array
			matrix[i][j] +=diff;
			sumRow[i] += diff;
			sumCol[j] += diff;

			//update the count
			//variable
			count+= diff;

			//If ith row satisfied,
			//increment ith value
			//for next iteration
			if(maxSum == sumRow[i]){
				i++;
			}

			//If jth column satisfied 
			//increment jth value
			//for next iteration
			if(maxSum == sumCol[j]){
				j++;
			}
		}

		return count;
	}

	
}
