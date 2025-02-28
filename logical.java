public class logical {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y && x > z) {
            System.out.println("x is the biggest");
        } 
        else if (y > x && y > z) {  // Fixed else-if syntax
            System.out.println("y is the biggest");
        } 
        else {  // If neither x nor y is the biggest, then z is biggest
            System.out.println("z is the biggest");
        }
    }
}

    

