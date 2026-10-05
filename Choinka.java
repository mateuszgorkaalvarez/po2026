public class Choinka {
    public static void main(String[] args){
        String znakChoinki = "*";
        System.out.println("Argument count: " + args.length);
        for (int i=0; i<args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        for (int x=0; x<10; x++) {
            for (int y = 0; y < 10 * 2; y++) {
                if (y < (10 - x) || y > (10 + x)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakChoinki);
                }
            }
            System.out.println();
        }
    }
}
