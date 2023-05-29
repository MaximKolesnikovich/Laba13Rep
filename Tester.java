package ru.javacore;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    double salary;
    public Tester()
    {
        this("Maxim","Kolesnikovich", 4 , "S" , 10000);
    }
    public Tester(String name, String surname)
    {
        this(name, surname, 6, "A", 100);
    }
    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary)
    {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void print()
    {
        System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary);
    }
    public void print(int number)
    {
        System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary + " " + number);
    }
    public void print(int number, boolean otpusk)
    {
        System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary + " " + number + " " + otpusk);
    }
    public static void staticMethod()
    {
        System.out.println("Метод");
    }

}
