public class CatRunner {
    public static void main(String[] args){

        Cat cat1 = new Cat("Bob", 21, 23);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Cornelius", 7, 22);
        cat2.printCatInfo();
        cat2.introduce();

        Rectangle rect1 = new Rectangle(5, 6);
        rect1.printArea();  // calling a method on the object
        rect1.printPerimeter();
    }
}
