public class Libro {
    // Atributos privados
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor
    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos Get y Set
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString
    @Override
    public String toString() {
        return "El libro con ISBN " + isbn + ", titulado \"" + titulo + "\", creado por el autor " + autor
                + ", tiene " + numeroPaginas + " páginas.";
    }

    public static void main(String[] args) {
        // Crear dos objetos Libro con valores personalizados
        Libro libro1 = new Libro("978-3-16-148410-0", "Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("978-0-14-044926-6", "Don Quijote de la Mancha", "Miguel de Cervantes", 1023);

        // Mostrar la información de ambos libros
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        // Comparar el número de páginas y mostrar cuál tiene más
        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("El libro \"" + libro1.getTitulo() + "\" tiene más páginas.");
        } else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
            System.out.println("El libro \"" + libro2.getTitulo() + "\" tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}
