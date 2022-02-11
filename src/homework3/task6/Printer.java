package homework3.task6;

public class Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void print (String value){
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }
    static class myPrint extends Printer{

        public void printNew(String value) {
            System.out.println(ANSI_YELLOW + value + ANSI_RESET);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Принтер");
        myPrint myprint = new myPrint();
        myprint.printNew("Принтер наследник");
    }
}