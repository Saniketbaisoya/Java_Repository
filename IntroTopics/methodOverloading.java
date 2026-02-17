
public class methodOverloading {
    
    public static void main(String[] args) {
        
        System.out.println(function(20));
        System.out.println(function(20.0000));
        System.out.println(function("20.00000"));

    }

    public static String function(int a){
        return String.format(String.format("%d", a ));
    }

    /**
     * @param a = 20.0000 ayega
     * @return string = 20.000 String format mai convert hokr 20 ke decimal ke baad upto 3 precision value....
     * Now 20 ke decimal(.) ke baad 3 precision value isliye ayi kyuki %f mai .3 hai jo yeah btata hai ki upto 3 precision tk hi print hoga
     * i.e -> "%.3f"
     */
    public static String function(double a){
        return String.format("%.3f", a);
    }

    /**
     * Now yha Double.parseDouble(a) isliye kiya kyuki a string mai hai and usko double se parse krvake return krege....
     */
    public static String function(String a){
        return String.format("%.3f", Double.parseDouble(a));
    }
}
