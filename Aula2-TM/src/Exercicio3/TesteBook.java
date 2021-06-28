package Exercicio3;

public class TesteBook {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "9780545582889", "Rowling, J. K.");
        System.out.println(book);
        book.emprestimo();
        System.out.println(book);
    }
}
