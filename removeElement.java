import java.util.Arrays; 
public class removeElement {
    

 
public static void main(String[] args) {
   int[] my_array = {1,2,3,45,6,7,8,9,11};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  
   int removeIndex = 4;
   Arrays.sort(my_array);

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }

    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
 }
    

