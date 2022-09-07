public class Main {
    public static void main(String[] args) {
        var author1 = new Author("Name1", "Surname1");
        var author2 = new Author("Name2", "Surname2");
        var author3 = new Author("Name2", "Surname2");
        var book1 = new Book("Book1", author1, 2020);
        var book2 = new Book("Book2", author2, 2013);
        var book3 = new Book("Book2", author3, 2000);
        book3.setPublicationYear(2019);

        System.out.println(book1.getName()+" "+ book1.getPublicationYear()+ " " + book1.getAuthor());
        System.out.println(book2.getName()+" "+ book2.getPublicationYear()+ " " + book2.getAuthor());
        System.out.println(book3.getName()+" "+ book3.getPublicationYear()+ " " + book3.getAuthor());
    }
}