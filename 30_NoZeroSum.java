 Define a class named Solution (standard LeetCode format)
class Solution {

 
  public int[] getNoZeroIntegers(int n) {
    
    
    for (int A = 1; A < n; ++A) {
      int B = n - A; // Calculate the corresponding B such that A + B = n

      // Check if both A and B do not contain the digit '0'
      if (!String.valueOf(A).contains("0") && !String.valueOf(B).contains("0"))
        // If valid, return them as an array
        return new int[] {A, B};
    }

    // If no such pair is found (shouldn't happen for valid n), throw an error
    throw new IllegalArgumentException();
  }
}

