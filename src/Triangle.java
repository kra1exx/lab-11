public class Triangle {
    private int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;}
    public void print() {
        System.out.println(a + " " + b + " " + c);}
    public void perimetr() {
        System.out.println("Perimetr: " + a + " " + b + " " + c);}
    public void square() {
        double p = (a + b + c) * 0.5;
        System.out.println("Square: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));}
}