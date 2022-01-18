package basicOfJava;

public class TripletFinding {
	boolean find3Numbers(int A[], int arr_size, int sum)
    {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {
 
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {
 
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }
 
        // If we reach here, then no triplet was found
        return false;
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        TripletFinding triplet = new TripletFinding();
        int A[] = { 1, 9, 45, 6, 11, 75 };
        int sum = 95;
        int arr_size = A.length;
 
        triplet.find3Numbers(A, arr_size, sum);
    }
}


