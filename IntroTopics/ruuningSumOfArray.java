import java.util.ArrayList;

public class ruuningSumOfArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};

        System.out.println(sumOfArray(arr));
    }

    public static ArrayList<Integer> sumOfArray(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0, arr[0]);
        for(int i = 1; i<arr.length; i++){
            int sum = ans.get(i-1) + arr[i];
            ans.add(i, sum);
        }
        return ans;
    }
}
