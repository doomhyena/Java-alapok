public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1.Feladat:");
        System.out.println(Math.pow(5, 3)); // 5^3
        System.out.println("2.Feladat:");
        System.out.println(Math.pow(5, 4+2)); // 5^4+2
        System.out.println("3.Feladat:");
        System.out.println(Math.sqrt(Math.pow(6, 3))); // 6^3 és ez a gyök alatt
        System.out.println("4.Feladat:");
        System.out.println(Math.sqrt(Math.pow(5, 2) + 2));  // 5^2 + 2 és ez a gyök alatt
        System.out.println("5.Feladat:");
        System.out.println((-2 + Math.sqrt(4 - 4 * 1 * 1)) / (2 * 1) + " és " + (-2 - Math.sqrt(4 - 4 * 1 * 1)) / (2 * 1));
    }
}
