package DSA;
import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) throws IOException {
		System.out.println((int) 'a');
		

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

	//sort an array according to the other
	public static void sortA1byA2_B(int arr1[], int n, int arr2[], int m){

		//hashmap to store the frequency of the elements
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap();

		for(int i=0; i<n; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
		}

		int index =0;

		for(int i=0; i<m; i++){
			if(map.containsKey(arr2[i])){
				
				int freq = map.get(arr2[i]);

				for(int j=0; j<freq; j++){
					arr1[index++]= arr2[i];
				}

			}
		}

		for(Map.Entry entry: map.entrySet()){

		}


	}

	static void printArray(int arr[], int size){
		for(int i=0; i<size; i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println("");
	}

	//sorting elements of an Array by Frequency
	//question link: https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0
	//solution
	private static void PrintFrequency(int arr[]){
		ArrayList<Integer> list = new ArrayList<>();
		
		for(Integer in: arr){
			list.add(in);
		}
		
		int max  = Collections.max(list);
		
		int ar[] = new int[max];
		
		for(Integer in: arr){
			ar[in-1]++;
		}
		
		list.clear();
		
		for(Integer in: ar){
			list.add(in);
		}
		
		for(Integer in: list){
			int index = list.indexOf(Collections.max(list));
			int count = list.get(index);
			for(int i=0; i<count; i++){
				System.out.print((index+1) +" " );
			}
			list.set(index,0);
		}
		System.out.println();
	}

	//Longest consecutive subsequence
	//question link:- https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

	static int findLongestConseqSubseq(int arr[], int N){

		int curr = 1;
		int max = 1;

		//creating an empty tree set to store each element
		TreeSet<Integer> tree = new TreeSet<>();

		for(int i=0; i<N; i++){
			tree.add(arr[i]);
		}

		Iterator it = tree.iterator();

		int i =0;
		while(it.hasNext() && i<N){
			arr[i++] = (int) it.next();
		}

		for( i=0; i<N-1; i++){
			if(arr[i]+1 == arr[i+1]){
				curr++;
				max = Math.max(max, curr);
			}else{
				curr=1;
			}
		}

		return max;
		
	}

	//check if two arrays are equal or not
	//question link: https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1

	static boolean check(long A[], long B[], int N){

		//store element of array A along with the frequency of element
		TreeMap<Long,Integer> map1 = new TreeMap<>();

		//store elment of array B along with the frequency of element
		TreeMap<Long, Integer> map2 = new TreeMap<>();

		for(int i=0; i<N; i++){
			map1.put(A[i], map1.getOrDefault(A[i], 0)+1);
			map2.put(B[i], map2.getOrDefault(B[i], 0)+1);
		}

		Set<Map.Entry<Long,Integer>> entries = map1.entrySet();

		for(Map.Entry<Long,Integer> entry: entries){
			long key1 = entry.getKey();
			
			if( map2.containsKey(key1)){
				int value2 = map2.get(key1);
				int value1 = map1.get(key1);
				if(value1 != value2){
					return false;
				}
			}else{
				return false;
			}
		}
		return true;
	}

	//subarrays with given Sum
	//question link: https://practice.geeksforgeeks.org/problems/subarray-range-with-given-sum2804/1

	static int subArraySum_B(int arr[], int n, int sum){

		int count =0;

		for(int i=0; i<n; i++){
			int curr =arr[i];

			for(int j=i; j<n; j++){
				curr+= arr[j];
				if(curr == sum)
				count++;
			}
		}
		
		return count;
	}

	//check if string is rotated by two places
	//question link:- https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1
	
	public static boolean isRotated(String str1, String str2)
    {
        //str2 to be rotated
        
        
        StringBuilder str = new StringBuilder();
        
        for(int i=2; i<str2.length(); i++){
            str.append(str2.charAt(i));
        }
        
        //appending the character at 0 index and 1st index
        str.append(str2.charAt(0));
        str.append(str2.charAt(1));
        
        
        String result = str.toString();

		System.out.println("Result string "+ result);
		System.out.println("str1 "+str2);
        
        
        for(int i=0; i<result.length() && i<str1.length(); i++ ){
            
            if(result.charAt(i) != str1.charAt(i)){
                return false;
            }
        }
        
        return true;
    }

	//utility function to print string array
	static void printStringArray(String arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("");
	}

	//Reverse words in a given string
	//question link:- https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

	 static String reverseWords(String S)
    {
        String splits[] = S.split("\\.");
		System.out.println(splits.length == 0);
		printStringArray(splits);
		
        
        StringBuilder str = new StringBuilder();
        
        for(int i=splits.length-1; i>=0; i--){
            str.append(splits[i]);
            
			if(i!=0){
				str.append(".");
			}
        }
        
        return str.toString();
    }

	//Sum of numbers in String
	//question link:- https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1

	static long findSum(String str){
		long sum =0;

		String num[] = str.split("[a-z]");
		for(int i=0; i<num.length; i++){
			if(!num[i].equals("")){
				sum += Integer.parseInt(num[i]);
			}
		}
		return sum;
	}


	//Smallest window in a string containing all the characters of another string
	//question link:- https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
	public static String smallestWindow(String s, String p ){
		  int no_of_chars = 256;

		//Function to find smallest
		//window containing
		//all characters of 'pat'

		//length of String s
		int lenS = s.length();

		//length of String p
		int lenP = p.length();

		//check if string's length is
		//less thatn pattern's 
		//length. If yes then no such
		//window can exist

		if(lenS < lenP){
			return "-1";
		}

		int hash_pat[] = new int[no_of_chars];
		int hash_str[] = new int[no_of_chars];

		//store occurence ofs 
		//characters of pattern
		for(int i=0; i<lenP; i++){
			hash_pat[p.charAt(i)]++;
		}

		int start =0, start_index = -1,min_len = Integer.MAX_VALUE;

		//start traversing the string
		//count of characters
		int count =0;
		for(int j=0; j<lenS; j++){
			
			//count occurrences of characters
			//of string
			hash_str[s.charAt(j)]++;

			//If string's char matches
			//with pattern's char
			//then increment count

			if(hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)]){
				count++;
			}

			//If all the characters are matched
			if(count == lenP){
				//Try to minimize the window
				while(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)] || hash_pat[s.charAt(start)] == 0){
					if(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)])
					hash_str[s.charAt(start)]--;

					start++;
				}

				//update window size
				int len_window = j-start+1;
				if(min_len > len_window){
					min_len = len_window;
					start_index = start;
				}

			}
		}

		//If no window found
		if(start_index == -1){
			return "-1";
		}

		return  s.substring(start_index, start_index+min_len);
	}
	
}
