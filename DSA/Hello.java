package DSA;
import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) throws IOException {
		int arr[] ={1,0,0,1,0,1,1};
		int n = arr.length;
		System.out.println(countSubarrWithEqualZeroAndOneOptimized(arr, n));
		

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

		System.out.print("Inside the find Min operation");

		//Initialize the sumRow[]
		//and sumCol[] array to 0

		int []sumRow = new int[n];
		int []sumCol = new int[n];

		//calculate sumRow[] and 
		//sumCol[] array
		//loop 1
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.println("Inside loop 1");
				sumCol[j] += matrix[i][j];
				sumRow[i] += matrix[i][j];
			}
		}

		//Find maximum sum value
		//in either row or in column
		//loop 2
		int maxSum =0;
		for(int i=0; i<n; i++){
			System.out.println("Inside loop 2");
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

	//search in row wise sorted and column wise sorted matrix

	public static int matSearch(int mat[][], int N, int M, int X)
    {
        for(int i=0; i<N; i++){
           
           //Line 40 index out of bound 
            if(X>=mat[i][i] || X<=mat[i][M-1]){
               if(rowSearch(mat,i,M,X)){
                   return 1;
               } 
            }else if(X>=mat[i][i] || X<=mat[N-1][i]){
                if(columnSearch(mat,i,N,X)){
                    return 1;
                }
            }
            
        }
        return 0;
    }
    
    // will search for the element in the row
    static boolean rowSearch(int mat[][], int i,  int m, int x){
        
        for(int j=i; j<m; j++){
            if(mat[i][j] ==x){
                return true;
            }
        }
        return false;
    }
    
    //will search for the element in the column
    static boolean columnSearch(int mat[][], int j, int n, int x){
        for(int i=j; i<n; i++){
            if(mat[i][j] == x){
                return true;
            }
        }
        
        return false;
    }

	//Count Non-Repeated Elements
	static int countNonRepeated(int arr[], int n){
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		int count =0;

		for(Map.Entry entry: map.entrySet()){
			if((int) entry.getValue() == 1){
				count++;
			}
		}

		return count;
	}

	//Print Non-Repeated Elements
	static void printNonRepeated(int arr[], int n){
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0; i<n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		for(Map.Entry entry: map.entrySet()){
			if((int) entry.getValue() == 1){
				System.out.print(entry.getKey()+" ");
			}
		}

		System.out.println("");
	}


	//Intersection of two Arrays

	static int NumberofElementsInIntersection(int arra[],int arrb[], int n, int m){
		Math.negateExact()

		//n is the size of arra
		//m is the size of arrb

		if(n<=m){
			HashSet<Integer> set = new HashSet<>();

			for(int i=0; i<n;i++){
				set.add(arra[i]);
			}

			int count =0;

			for(int i=0; i<m; i++){
				if(set.contains(arrb[i])){
					count++;
				}
			}

			return count;
		}


		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<m; i++){
			set.add(arrb[i]);
		}

		int count =0;

		for(int i=0; i<n; i++){
			if(set.contains(arra[i])){
				count++;
			}
		}

		

		return count;

	}

	//count pairs with given sum
	static int getPairsCount(int arr[], int n, int k){

		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0; i<n; i++){
			if(!hm.containsKey(arr[i])){
				hm.put(arr[i], 0);
			}

			hm.put(arr[i], hm.get(arr[i])+1);
		}

		int twice_count =0;

		for(int i=0; i<n; i++){
			Integer.toString(1);
		}
		return twice_count;
	}

	//Subarray with 0 sum
	static boolean SubarrayExists(int arr[], int n){
		HashSet<Integer> hs = new HashSet<>();

		int sum =0;

		for(int i=0; i<n; i++){
			//Add current element to sum
			sum+= arr[i];

			//Return true in following cases
			//a) current element is 0
			//b) sum of elements from 0 to i is 0
			//c) sum is already present in hash Map

			if(arr[i] == 0 || sum == 0 || hs.contains(sum)){
				return true;
			}

			hs.add(sum);
		}

		return false;
	}

	//BruteForce Approach
	//Subarrays with equal 1 and 0
	static int countSubarrWithEqualZeroAndOne(int arr[], int n){

		//store the count of 0 
		int count_0 =0;

		//store the count of 1
		int count_1 = 0;

		//number of pairs
		int pairs =0;

		for(int i=0; i<n; i++){

			for(int j=i; j<n; j++){
				if(arr[j] == 1){
					count_1++;
				}

				if(arr[j] == 0){
					count_0++;
				}

				if(count_0 == count_1){
					pairs++;
				}
			}

			count_0=0;
			count_1 =0;
		}
		return pairs;
	}

	//optimised approach of Count subarrays equal numbers of 1 and 0
	// time:- o(n) space:- o(n)

	static int countSubarrWithEqualZeroAndOneOptimized(int arr[], int n){
		//um implemented as hash table to store
		//frequency of values obtained through cumulative sum

		Map<Integer,Integer> um = new HashMap<>();

		int curr_sum =0;

		//Traverse original array and compute cumulative
		//sum and increase count by 1 for this sum
		//in 'um'. Adds '-1' when arr[i] =0;

		for(int i=0; i<n; i++){
			curr_sum+= (arr[i] == 0)?-1:arr[i];
			um.put(curr_sum, um.get(curr_sum)== null?1:um.get(curr_sum)+1);
		}

		int count =0;

		//traverse the hash table 'um'
		for(Map.Entry<Integer,Integer> itr: um.entrySet()){
			
			//if there are more than one prefix subarrays
			//with a particular sum
			if(itr.getValue()>1){
				count+= ((itr.getValue()* (itr.getValue()-1))/2);
			}
		}

		//add the subarrays starting from 1st element and 
		//have equal number of 1's and 0's
		if(um.containsKey(0))
		count+=um.get(0);

		//required count of subarrays
		return count;
	}
	
}
