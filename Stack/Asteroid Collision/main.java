//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for(int val : asteroids){
            if(val > 0){
                stack.push(val);
            }else{
                while(stack.size() > 0&& stack.peek() > 0&& stack.peek() < -val){
                    stack.pop();
                }
                if(stack.size() > 0 && stack.peek() == -val){
                    stack.pop();
                }
                else if(stack.size() > 0 && stack.peek() > -val){
                    
                }else{
                    stack.push(val);
                }
            }
        }
        
        int ans[] = new int[stack.size()];
        int i =ans.length-1;
        while(i>=0){
            ans[i] = stack.pop();
            i--;
        }
        return ans;
    }
}