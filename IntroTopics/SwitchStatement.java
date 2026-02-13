package IntroTopics;

public class SwitchStatement {
    public static void main(String[] args) {

        int number = 29;
        String size;
        switch (number){
            case 29:
                size = "small";
                break;

            case 42:
                size = "medium";
                break;
            case 48:
                size = "large";
                break;
            case 50:
                size = "extra large";
                break;
            default:
                size = "unknown";
                break;

        }

        System.out.println("size is : " + size);

    }
}
