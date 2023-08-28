package dersler.gun50_Review.VariableHiding;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.print(); // child classda ki name

        child.printParent();

        System.out.println();

        Parent parent = new Parent();
        parent.print(); // Parent classda ki name


    }
}
