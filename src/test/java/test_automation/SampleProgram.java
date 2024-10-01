package test_automation;

//Class name should start with a capital letter
//Whatever logic , execute or implemenet it should be present inside main


import static java.lang.StringTemplate.STR;

public class SampleProgram {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        // shortcuts for calling main method --> sout + enter
        // running program in intellj --> CTRL + SHIFT + F10
        // IN JAVA we follow BDDMAS Rule for aritmetic operations:
        // Bracket of division multiplication addtion subtraction
        //System.out.println("test"); // this print the tex in the console and cursor is moved to the a new line
        //System.out.print("test"); // this print the tex in the console and cursor is in the same line
        int a = 30 + 1;
        //System.out.println("This is the number: " + a);
        // Note: below we're not using "+" concatenaton anymore
        System.out.println(STR."number obtained is: \{a}");




    }
}
