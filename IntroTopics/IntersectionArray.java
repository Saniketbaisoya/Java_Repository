import java.util.ArrayList;

public class IntersectionArray {

    public static void main(String[] args) {
        int[] arr1 = {10, 19, 20, 30, 40, 40, 50};
        int[] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};

        /**
         * two pointers -> i and j;
         * Now yha || ki condition isliye nhi ayegi kyuki agr ek bhi iterator bahar hogya tbhi stop krege while loop ko
         * Yani intersection find krne ke liye dono pointers ka andr hona jarori hai that's why &&
         * while(i< arr1.length && j < arr2.length)
         * i < j i++
         * j < i j++
         * i == j {add(arr[i]),  i++ j++};
         * output => [ 20, 30, 40 ];
        */
        System.out.println(intersection(arr1, arr2));

    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i< arr1.length && j< arr2.length){
            if(arr1[i] == arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) i++;
            else j++;
            
        }
        return ans;
    }
}
