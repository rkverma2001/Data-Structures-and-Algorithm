/* 
Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.
Examples:
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9

TC : O(n)
SC: O(n)

</aside>
*/

import javax.sound.midi.Soundbank;

public class Min_and_max_element {

    static int[] getMinMax(int arr[], int n) {
        int i;
        int max = 0;
        int min = 0;

        if(n == 1) {
            max = arr[0];
            min = arr[0];

            return new int[] {max, min};
        }

        if(arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        }

        else {
            max = arr[1];
            min = arr[0];
        }

        for(i=2; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            else if(arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[] {max, min};
    }

    public static void main(String[] args) {

        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        int[] minmax = getMinMax(arr, arr_size);

        System.out.println("Minimum element is :" + minmax[1]);
        System.out.println("Maxmum element is :" + minmax[0]);
        
    }
    
}