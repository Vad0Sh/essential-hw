package homework4.task2;

import java.util.Scanner;

abstract class AbstractHandler {
    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();
}
class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Успешное открытие XML документа");
    }

    @Override
    public void create() {
        System.out.println("Успешное создание XML документа");

    }

    @Override
    public void change() {
        System.out.println("Успешное изменение XML документа");
    }

    @Override
    public void save() {
        System.out.println("Успешное сохранение XML документа");
    }
}
class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Успешное открытие TXT документа");
    }

    @Override
    public void create() {
        System.out.println("Успешное создание TXT документа");

    }

    @Override
    public void change() {
        System.out.println("Успешное изменение TXT документа");
    }

    @Override
    public void save() {
        System.out.println("Успешное сохранение TXT документа");
    }
}
class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Успешное открытие DOC документа");
    }

    @Override
    public void create() {
        System.out.println("Успешное создание DOC документа");

    }

    @Override
    public void change() {
        System.out.println("Успешное изменение DOC документа");
    }

    @Override
    public void save() {
        System.out.println("Успешное сохранение DOC документа");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип документа: ");
        switch (scan.next()){
          case "XML","Xml" , "xml"  -> {
          XMLHandler xml = new XMLHandler();
              System.out.println("Какое действие будем производить с XML документом?");
              Scanner scanner = new Scanner(System.in);
              switch (scanner.next()){
                  case "Open","open" -> {
                      xml.open();
                  }
                  case "Change","change" -> {
                      xml.change();
                  }
                  case "Create","create" -> {
                      xml.create();
                  }
                  case "Save", "save" -> {
                      xml.save();
                  }
                  default ->
                          System.out.println("Действие не расспознано");

              }
          }
            case "DOC","Doc", "doc"-> {
              DOCHandler doc = new DOCHandler();
                System.out.println("Какое действие будем производить с DOC документом?");
                Scanner scanner = new Scanner(System.in);
                switch (scanner.next()){
                    case "Open","open" -> {
                        doc.open();
                    }
                    case "Change","change" -> {
                        doc.change();
                    }
                    case "Create","create" -> {
                        doc.create();
                    }
                    case "Save", "save" -> {
                        doc.save();
                    }
                    default ->
                            System.out.println("Действие не расспознано");

                }
            }
            case "TXT","Txt","txt" -> {
              TXTHandler txt = new TXTHandler();
                System.out.println("Какое действие будем производить с TXT документом?");
                Scanner scanner = new Scanner(System.in);
                switch (scanner.next()){
                    case "Open","open" -> {
                        txt.open();
                    }
                    case "Change","change" -> {
                        txt.change();
                    }
                    case "Create","create" -> {
                        txt.create();
                    }
                    case "Save", "save" -> {
                        txt.save();
                    }
                    default ->
                            System.out.println("Действие не расспознано");

                }
            }
          }
        }

    }
