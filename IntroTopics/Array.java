public class Array {
    public static void main(String[] args) {
        // initailize then declared the memory....
        int [] arr;
        arr = new int[10];

        // intialize + decalre the memory both in one line....
        int[] arr2 = new int[10];


        // initializing during elements....
        int[] arr3 = {5,4,3,1,2};
        
        System.out.println(arr3[1] + " " + arr3[2]);
        swap(arr3);
        System.out.println(arr3[1] + " " + arr3[2]);

        System.out.println("------EF------");
        for(int val: arr3){
            System.out.print(val + " ");
        }
        System.out.println();

        // reverse function called....
        reverse(arr3);

        for(int val: arr3){
            System.out.print(val + " ");
        }
    }

    public static void swap(int[] a){
        int temp = a[2];
        a[2] = a[1];
        a[1] = temp;
    }

    /**
     * @param a now a ke pass reference hoga arr ka
     * Yani a bhi arr3 ke 0th index pr point krega and uske pass bhi arr3 ka access hoga
     * Now arr3 mai changes krne ke liye hmme uska reference hi dena hoga tb changes reflect hoge....
     * If agr mai a[i] and a[j] ko swap krne ke liye bejta hu toh jo parameter a and b receive krege unme swap hogi arr3 mai nhi
     * That's why maine array mai swap ke liye reverse ke function mai hi swap code likha taki direclty a mai change ho and voh arr3 mai dikhe....
     */
    public static void reverse(int[] a){
       int i = 0, j = a.length - 1;
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    
}
