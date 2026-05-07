public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("2 + 3 = " + c.add(2, 3));
        System.out.println("Reverse of hello = " + StringUtils.reverse("hello"));
    }
}