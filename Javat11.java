public class Javat11 {
    public static void main(String[] args) {
        int a = 1;
        switch(a){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("a is less than 5");
                break;
            case 5:
                System.out.println("a is equal to 5");
                break;
            default: 
                System.out.println("a is greater than 5");
        }
    }
}
