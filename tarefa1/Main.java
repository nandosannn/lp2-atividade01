import src.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);

        System.out.println(r1);

        Rectangle r2 = new Rectangle();   // construtor padrão 
        System.out.println(r2); // Testar setters e getters 
        r1.setLength(5.6f); 
        r1.setWidth(7.8f); 
        System.out.println(r1);   // toString() 
        System.out.println("length is:" + r1.getLength()); System.out.println("width is: " + r1.getWidth()); // Teste getArea() e getPerimeter() 
        System.out.printf("a área é: %.2f%n", r1.getArea()); 
        System.out.printf("o perímetro é: %.2f%n", r1.getPerimeter()); 
    }
}
