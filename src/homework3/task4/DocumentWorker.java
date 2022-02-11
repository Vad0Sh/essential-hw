package homework3.task4;

import java.util.Scanner;

public class DocumentWorker {
    void openDocument() {
        System.out.println("Документ открыт ");
    }
    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про ");
    }
    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ключ ");
        switch (scan.next()) {
            case "Pro", "pro" -> {
                ProDocumentWorker doc = new ProDocumentWorker();
                doc.openDocument();
                doc.editDocument();
                doc.saveDocument();
            }
            case "Expert", "expert" -> {
                ExpertDocumentWorker doc1 = new ExpertDocumentWorker();
                doc1.openDocument();
                doc1.editDocument();
                doc1.saveDocument();
            }
            default -> {
                DocumentWorker doc2 = new DocumentWorker();
                doc2.openDocument();
                doc2.editDocument();
                doc2.saveDocument();
            }
        }

    }
}
 class ProDocumentWorker extends DocumentWorker {


        void editDocument () {
            System.out.println("Документ отредактирован ");
        }

        @Override
        void saveDocument () {
            System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
        }

 }
 class ExpertDocumentWorker extends ProDocumentWorker{
     @Override
     void openDocument() {
         super.openDocument();
     }

     @Override
     void editDocument() {
         super.editDocument();
     }

     @Override
     void saveDocument() {
         System.out.println("Документ сохранен в новом формате");
     }
 }



