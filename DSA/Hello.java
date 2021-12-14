package DSA;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Hello {
    public static void main(String[] args) throws IOException {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		ArrayDeque<Integer> queue = insert(arr, n);	
		PrintArrayDeque(queue);	

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

	//Node class
	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	//Remove duplicates from an unsorted Linked list
	//question link: https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

	//Check if Linked List is Palindrome
	//question link: https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

	static boolean isPalindrome(Node head){

		if(head.next == null){
			return true;
		}

		//size of the linked list
		int size =0;

		Node curr = head;

		while(curr != null){
			curr = curr.next;
			size++;
		}

		System.out.println("size"+size);

		boolean iseven = false;
		if(size % 2 == 0){
			iseven = true;
		}

		int lef_size = size/2;
		int left_sum =0;
		curr = head;

		int index =0;
		while(curr != null && index != lef_size){
			left_sum += curr.data;
			curr = curr.next;
			index++;
		}

		System.out.println("left sum" + left_sum);

		if(!iseven){
			System.out.println("size is odd");
			curr = curr.next;
			index++;
		}

		int right_sum =0;

		while(curr != null && index != size){
			right_sum += curr.data;
			curr = curr.next;
			index++;
		}

		System.out.println("Right sum "+ right_sum);

		if(left_sum == right_sum){
			return true;
		}
		return false;
	}

	//LRU CACHE implementation
	static class LRUcache{
		static LinkedHashMap<Integer,Integer> map;
		private final int CAPACITY;

		LRUcache(int cap){
			this.CAPACITY = cap;
			map = new LinkedHashMap<Integer,Integer>(cap,0.75f, true){
				protected boolean removeEldestEntry(Map.Entry eldest){
					return size() > CAPACITY;
				}
			};

		}

		public static int get(int key){
			return map.getOrDefault(key, -1);
		}

		public static void set(int key, int value){
			map.put(key, value);
		}
	}

	

	//Add two numbers represented by linked lists
	//question link: https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
	
	static Node addTwoLists(Node first, Node second){
		Node temp1 = first;
		Node temp2 = second;

		int f_num = temp1.data;
		int s_num = temp2.data;

		temp1 = temp1.next;
		while(temp1 != null){
			int data = temp1.data;
			f_num= (f_num*10)+data;
			temp1 = temp1.next;
		}

		temp2 = temp2.next;
		while(temp2 != null){
			int data = temp2.data;
			s_num = (s_num*10)+data;
			temp2 = temp2.next;
		}

		int result = f_num+s_num;
		String num = Integer.toString(result);
		
		Node output = null;
		Node curr = null;

		for(int i=0; i<num.length(); i++){
			Node insert = new Node(num.charAt(i) - 48);
			if(output == null && curr == null){
				output=curr=insert;
			}else{
				curr.next = insert;
				curr = curr.next;
			}
		}

		return output;
	}


	//utility function for printing all the nodes of linked list
	static void printLinkedList(Node head){
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

	static class Nodearb{
		int data;
		Nodearb next,arb;

		Nodearb(int data){
			this.data = data;
			next=arb = null;
		}
	}

	//clone a linked list with next and random pointer
	//question link: https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1

	Nodearb copyList(Nodearb head){
		Nodearb curr = head;

		//Inserting new nodes between the original linkedList
		while(curr != null){
			Nodearb temp = curr.next;
			curr.next = new Nodearb(curr.data);
			curr.next.next = temp;
			curr= temp;
		}

		curr = head;

		//Setting Random pointers of new nodes
		while(curr != null){
			curr.next.arb = (curr.arb != null) ? curr.arb.next:null;
			curr = curr.next.next;
		}

		Nodearb orig = head,copy=head.next;
		Nodearb temp = copy;

		//Separating both the linkedListr

		while(orig != null){
			orig.next = orig.next.next;
			copy.next = (copy.next != null) ? copy.next.next
		}
	}

	//Nth number made of prime digits
	//question link:- https://practice.geeksforgeeks.org/problems/nth-number-made-of-prime-digits4319/1

	public static String primeDigits(int n){
		
		int rem;
		String num = "";
		while(n > 0){
			//remainder for check element position
			rem = n %4;
			switch(rem){
				//if number is 1st position in tree
				case 1:
				num+='2';
				break;

				case 2:
				num+= '3';
				break;

				case 3:
				num+='5';
				break;

				case 0:
				num+='7';
				break;

			}
			if(n % 4 == 0){
				n--;
			}
			n = n/4;
		}
		return new StringBuilder(num).reverse().toString();
	}

	//case-specific sorting of Strings
	public static String caseSort(String str)
    {
       String cap="";
       String low="";
       
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) >='A' && str.charAt<= 'Z' ){
               cap+=str.charAt(i);
           }else{
               low+=str.charAt(i);
           }
       }
       
       char l[] = low.toCharArray();
       char u[] = cap.toCharArray();
       
       Arrays.sort(l);
       Arrays.sort(u);
       
       int low_index =0;
       int cap_index =0;
       
       String result = "";
       
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) >='A' && str.charAt(i)<='Z'){
               result+=u[cap_index++];
           }else{
               result+=l[low_index++];
           }
       }
       
       return result;
    }

	//Lexicographic Rank of A String
	//question link: https://practice.geeksforgeeks.org/problems/rank-the-permutations2229/0/?fbclid=IwAR1-LviPWYNxRrzmmpjsLuUgrKK4ODge33xxDaiF8NjNFbo9CWbF4OZd3xc#	
	static int findRank(String str){
		int len = str.length();
		int mul = fact(len);
		int rank =1;
		int countRight;

		for(int i=0; i<len; i++){
			mul/=len-i;

			//count number of chars smaller
			//than str[i] from str[i+1] to
			//str[len-1]
			countRight = findSmallerInRight(str, i, len-1);
			rank+=countRight * mul;
		}

		return rank;

	}

	//A utility function to count smaller
	//characters on right of arr[low]
	static int findSmallerInRight(String str, int low,int high){
		int countRight=0,i;
		
		for(i=low+1; i<=high; i++){
			if(str.charAt(i) <str.charAt(low))
			++countRight;
		}
		return countRight;
	}

	//utility function for calculating factorial
	static int fact(int num){
		if(num == 1 || num == 0){
			return 1;
		}

		return num*fact(num-1);
	}

	//Search Pattern(Rabin-Karp Algorithm)
	//question link: https://practice.geeksforgeeks.org/problems/31272eef104840f7430ad9fd1d43b434a4b9596b/1/

	static ArrayList<Integer> search(String pat, String S){

		ArrayList<Integer> result = new ArrayList<>();

		int M = pat.length();
		int N = S.length();

		for(int i=0; i<=N-M; i++){
			int j;

			for(j=0; j<M; j++){
				if(S.charAt(i+j) != pat.charAt(j)){
					break;
				}
			}

			if(j==M){
				result.add(i+1);
			}
		}

		return result;
	}

	//utility function to print arraylist of integer
	static void printArrayListOfInteger(ArrayList<Integer> result){
		for(int i=0; i<result.size(); i++){
			System.out.print(result.get(i)+" ");
		}
		System.out.println("");
	}

	//Rabin karp Algorithm for pattern Searching
	static ArrayList<Integer> searchRKP(String pat, String S){
		ArrayList<Integer> result = new ArrayList<>();

		//d is the number of characters in the input alphabet
		int d = 256;

		//q is a prime number
		int q = 101;

		//length of the pat string
		int M = pat.length();

		//length of the S string
		int N = S.length();

		int i,j;
		int p=0; //hash valuee for pattern
		int t=0; //hash value for txt;
		int h =1;

		//The value of h would be "pow(d,M-1)%q"
		for( i=0; i<M-1; i++){
			h =(h*d)%q;
		}

		//calculate the hash value of pattern and first
		//window of text
		for(i=0; i<M; i++){
			p = (d*p +pat.charAt(i))%q;
			t = (d*t +S.charAt(i))%q;
		}

		//Slide the pattern over text one by one
		for( i=0; i<=N-M; i++){
			//check the hash values of current window of text
			//and pattern. If the hash values match then only
			//check for characters on by one
			if(p == t){
				//check for characters one by one
				for(j=0; j<M; j++){
					if(S.charAt(i+j) != pat.charAt(j)){
						break;
					}
				}

				if(j==M){
					result.add(i+1);
				}
			}

			//Calculate hash value for next window of text: remove
			//leading digit, add trailing digit
			if(i<N-M){
				t = (d*(t-S.charAt(i)*h) +S.charAt(i+M))%q;
				
				//we might get negative value of t, converting it 
				//to positive
				if(t<0){
					t=(t+q);
				}
			}
		}
		return result;
	}

	//Search Pattern (KMP-Algorithm)
	//question link:- https://practice.geeksforgeeks.org/problems/search-pattern0205/1

	static ArrayList<Integer> searchKMP(String pat, String txt){
		ArrayList<Integer> result = new ArrayList<>();

		//length of the pat String
		int M = pat.length();

		//length of the txt string
		int N = txt.length();

		//create lps[] that will hold the longest 
		//prefix suffix values for pattern

		int lps[] = new int[M];


		//preprocess the pattern (calculate lps[] )
		//array
		computeLPSArray(pat, M, lps);

		int i=0; //index for txt;
		int j=0; //index for pat;

		while(i<N){
			if(pat.charAt(j) == txt.charAt(i)){
				j++;
				i++;
			}

			if(j==M){
				result.add(i-j+1);
				j=lps[j-1];
			}

			//mismatch after j matches
			else if(i<N && pat.charAt(j) != txt.charAt(i)){
				//Do not match lps[0..lps[j-1]] characters,
				//they will match anyway
				if(j != 0)
				j= lps[j-1];
				else
				i = i+1;
			}
		}
		
		return result;
	}

	//utility function for KMP pattern searching algorithm
	static void computeLPSArray(String pat, int M, int lps[]){
		//length of the previous longest prefix suffix
		int len =0;
		int i=1;
		lps[0] = 0;//lps[0] is always 0

		//the loop calculates lps[i] for i =1 to M-1
		while(i<M){
			if(pat.charAt(i) ==pat.charAt(len)){
				len++;
				lps[i] =len;
				i++;
			}else{
				// (pat[i] != pat[len])

				//This is tricky. Consider the example.
				//AAACAAAA and i =7. the idea is similar
				//to search step.

				if(len != 0){
					len = lps[len-1];

					//Also, note that we do not increment 
					//i here
				}else{
					//if(len ==0)
					lps[i] =len;
					i++;
				}
			}
		}
	}

	//Stock span Problem
	//question link:- https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
	public static int[] calculateSpan(int price[], int n){
		int result[] = new int[n];

		//span value of first day is always 1
		result[0]=1;

		//intializing span value
		for(int i=1; i<n; i++){
			result[i] =1;
			for(int j=i-1; (j>=0) && (price[i]>= price[j]); j--){
				result[i]++;
			}
		}

		return result;
	}

	//Naive Approach
	//Maximum rectangular area in a histogram
	//question link:- https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
	public static long getMaxArea(long hist[], long n){
		int size = (int) n;

		Long area = Long.MIN_VALUE;

		for(int i=0; i<size; i++){
			int j;
			//max area in this window
			Long curr_arr  = Long.MIN_VALUE;

			//minimum height of the pillar in this window
			Long min_height =  Long.MAX_VALUE;
			for(j=i; j<size; j++){
				min_height = Math.min(min_height, hist[j]);
			}

			curr_arr = min_height*(j-i+1);
			area = Math.max(curr_arr, area);
			curr_arr=Long.MIN_VALUE;
			min_height = Long.MAX_VALUE;

			
		}
		return area;
	}

	//Naive Approach
	//The Celebrity Problem
	//question link:- https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1

	static void celebrity(int M[][], int n){

	}

	//Naive Approach
	//Maximum of minimum for every window size (Hard)
	//question link:- https://practice.geeksforgeeks.org/problems/maximum-of-minimum-for-every-window-size3453/1
	static int[] maxOfMin(int[] arr, int n){
		//returning result
		int[] result = new int[n];

		//number of possible window
		int possible_window =1;

		for(int i=n; i>=1; i--){

			//list will store all the possible window size
			ArrayList<ArrayList<Integer>> list = new ArrayList<>();

			for(int j=0; j<possible_window; j++){
				list.add(new ArrayList<>());
			}
			int last_index = i-1;
			ArrayList<Integer> min_list;

			for(int j=0; j<possible_window; j++){
				ArrayList<Integer> alist = list.get(j);

				for(int k=last_index; k>=n-i+1; k--){
					alist.add(arr[k]);
				}

				list.set(j, alist);

				


			}



			//increasing possible window size
			possible_window++;

		}

		return result;
	}

	//Queue Operation
	//Question link:- https://practice.geeksforgeeks.org/problems/queue-operations/1
	static int findFrequency(Queue<Integer> queue, int k){
		Queue<Integer> temp = new LinkedList<Integer>();

		int count =0;
		while(!queue.isEmpty()){

		}
		for(int i=0; i<temp.size(); i++){
			queue.add(temp.poll());
		}

		return count;
	}

	//Naive Approach
	//Generate Binary numbers
	//question link:- https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1
	static ArrayList<String> generate(int N){
		ArrayList<String> result = new ArrayList<>();

		for(int i=0; i<N; i++){
			result.add(Integer.toString(i,2));
		}

		return result;
	}

	//utility function to print ArrayList of String values
	static void printArrayListOfString(ArrayList<String> list){
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) +" ");
		}
		System.out.println("");
	}

	//Optimized solution 
	//Generated binary Numbers
    //question link:- https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1
	static ArrayList<String> generateOptimized(int N){
		Queue<String> queue = new LinkedList<>();
		ArrayList<String> result = new ArrayList<>();

		queue.add("1");

		while(N-- > 0){
			String s1 = queue.poll();
			result.add(s1);

			queue.add(s1+"0");
			queue.add(s1+"1");
		}

		return result;
	}

	//Optimized solution 
	//Circular tour
	//question link: https://practice.geeksforgeeks.org/problems/circular-tour/1

	int tour(int petrol[], int distance[]){
		int n = petrol.length;

		int start =0;
		int end =1;

		int curr_petrol = petrol[start] - distance[start];
		//If current amount of petrol in truck becomes less than 0, then
		//remove the starting petrol pump from tour
		while(end != start || curr_petrol<0){
			//If current amount of petrol in truck become less than 0, then
			//remove the starting petrol pump from tour

			while(curr_petrol<0 && start != end){
				
			}

		}

		//Return starting point
		return start;
	}

	//utility function to print arrayDeque
	static void PrintArrayDeque(ArrayDeque<Integer> arrayDeque){
		for ( Integer i : arrayDeque) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}


	//Insertion in dequeue
	static ArrayDeque<Integer> insert(int arr[], int n){
		ArrayDeque<Integer> result = new ArrayDeque<>();
		for(int i=0; i<n; i++){
			result.add(arr[i]);
		}

		return result;
	}

}
