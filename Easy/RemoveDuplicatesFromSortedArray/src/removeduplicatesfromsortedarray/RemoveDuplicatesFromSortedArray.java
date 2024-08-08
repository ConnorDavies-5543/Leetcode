/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removeduplicatesfromsortedarray;

/**
 *
 * @author Connor Robert Davies
 */
//Topics: Array, Two Pointers
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums [] = {1, 1, 2};
        System.out.println(removeDuplicates (nums));
    }
    
    public static int removeDuplicates (int[] nums){
        int k = nums.length;
        
        for (int i = 0; i < k - 1; i++) {
            //Loops through array
            if (nums[i] == nums[i+1]){
                //If there is a duplicate
                for (int j = i; j < k-1; j++) {
                    //Delete shift loop
                    nums [j] = nums [j+1];
                }
                k--; //Reduce size of array
                i--;
            }
            
        }
        
        return k;
    }
    
}
