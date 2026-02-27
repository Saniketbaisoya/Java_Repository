public class ThisInOops {
    
    //(instance of variables)fields....
    // Now this keyword ka use krke hmm ek object ke pass jitne bhi variables or data functions hai unn sbka access kr skte hai
    // Now jb hmne object ko create kiya toh consturctor ko call krke hmne fields(i, j) mai arguments set krdiye
    // Now this ka use krke local variables ko fields mai shadowing krdiya
    // Now yha hmm this ke through sare fields and behaviours ka access kr skte hai and hmm this ko function ki trh call krke constructror ko call bhi kr skte hain
    private int i, j;
    ThisInOops(int i, int j){
        this.i = i; // 10
        this.j = j; // 20
        this.getData();
    }


    // Now iss case mai maine this ko call krke usme do parameter pas kiye i and i 
    // jisse voh contructor call hua jiske pass do parameters hai
    ThisInOops(int i){
        this(i, i);
    }

    // Now yha maine this ko call krke usme ek arg pass kiya....
    // Jisse voh constructor call hua jiske pass ek parameter hai....
    ThisInOops(){
        this(0);
    }
    
    // behaviour/ method/ member function
    void getData(){
        System.out.println(this.i+ " "+this.j);
    }
    public static void main(String[] args) {
        ThisInOops obj = new ThisInOops();


    }
}

