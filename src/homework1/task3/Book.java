package homework1.task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        author.setAuthor("Лев Толстой");
        author.show();

        title.setTitle("Война и мир");
        title.show();

        content.setContent("Роман-эпопея, описывающий русское общество в эпоху войн против Наполеона в 1805—1812 годах");
        content.show();


    }
}
