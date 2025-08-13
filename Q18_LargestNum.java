// Write a program to find the second largest number in an array in Java

private static int findSecondHighest(int[] array) {
 int highest = Integer.MIN_VALUE;
 int secondHighest = Integer.MIN_VALUE;

 for (int i : array) {
  if (i > highest) {
   secondHighest = highest;
   highest = i;
  } else if (i > secondHighest) {
   secondHighest = i;
  }

 }
 return secondHighest;
}
