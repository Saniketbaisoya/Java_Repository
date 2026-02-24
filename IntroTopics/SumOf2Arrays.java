import java.util.ArrayList;

public class SumOf2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {9, 9};
        int[] arr2 = {9, 9, 9, 9};

        /**
         * carry = 0;
         * while( i>=0 || j >=0 ) {
         *      j = 9
         *      sum = 9 + 9 + carry = 18
         *      rem = 8; -> sum % 10; 
         *      carry = 1; -> sum / 10;
         *      ans.add(0, rem);
         *      i--, j--;
         * }
         * i & j bahar hogye apne array se....
         * Now abb agr carry mai ek value bchegi toh usko bhi push krege ans ke andr
         * if(carry != 0) ans.add(0, carry);
         */
        System.out.println(sumOf2Array(arr1, arr2));
    }

    public static ArrayList<Integer> sumOf2Array(int[] arr1, int[] arr2){
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        ArrayList<Integer> ans = new ArrayList<> ();
        int carry = 0;
        while( i >= 0 || j >= 0){
            int sum = 0;

            if(i>= 0){
                sum += arr1[i];
            }
            if(j>= 0){
                sum += arr2[j];
            }
            
            sum += carry;
            int rem = sum % 10;
            carry = sum / 10;

            ans.add(0, rem);
            i--;
            j--;
        }
        if(carry != 0) ans.add(0, carry);
        return ans;
    }
}
