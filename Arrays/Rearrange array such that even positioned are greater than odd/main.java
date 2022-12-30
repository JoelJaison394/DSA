//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    ArrayList<Integer> assign(int a[], int n)
    {
        // Complete the function
        ArrayList<Integer> list = new ArrayList<>(n);
        Arrays.sort(a);
        for (int i = 1, j = n-1; i < j; i++, j--){
            list.add(a[i]);
            list.add(a[j]);
        }
        return list;
    }
  
    
}