package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Максим Колесникович T-091" );
        Tester tester1 = new Tester();
        tester1.print();
        Tester tester2 = new Tester("Tolik","Kor");
        tester2.print(14);
        Tester tester3 = new Tester("Vasy","Pupkin",3,"B",12);
        tester3.print(15,true);
        Tester.staticMethod();
    }
}
