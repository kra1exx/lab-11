public class Rectangle {
    private int a, b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;}
    public void print() {
        System.out.println(a + " " + b);}
    public void perimetr() {
        System.out.println("Perimetr: " + (a + b) * 2);}
    public void square() {
        System.out.println("Square: " + a * b);}
}