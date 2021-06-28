package Exercicio3;

// Adicione a linha @Override logo acima do cabeçalho do método toString.
// Em seguida, renomeie o método para: tostring (tudo em letras minúsculas). O que acontece?
// Ocorre um erro: java: method does not override or implement a method from a supertype

public class Book {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean disponivel;

    public Book(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponivel = true;
    }

    public Book() {
    }

    public void emprestimo() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        String disponibilidade = this.disponivel ? "Disponível" : "Alugado";
        return titulo + ", " + isbn + ", " + autor + ", " + disponibilidade;
    }
}
