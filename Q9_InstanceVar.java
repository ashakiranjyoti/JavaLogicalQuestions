// Java Program to demonstrate Instance Variable
import java.io.*;
class InsVar {
    private String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public static void main(String[] args)
    {
        InsVar obj = new InsVar();
        obj.setName("John");
        System.out.println("Name " + obj.getName());
    }
}
