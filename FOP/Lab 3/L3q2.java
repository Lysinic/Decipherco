
package tutorial3;

public class L3q2 {
    public static void main(String[] args) {
        int r = (int)(Math.random()*5);
        
        switch(r){
            case 0:
                System.out.printf("%d is zero", r);
                break;
            case 1:
                System.out.printf("%d is one", r);
                break;
            case 2:
                System.out.printf("%d is two", r);
                break;
            case 3:
                System.out.printf("%d is three", r);
                break;
            case 4:
                System.out.printf("%d is four", r);
                break;
            case 5:
                System.out.printf("%d is five", r);
                break;
        }
    }
}
