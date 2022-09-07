import java.util.Objects;

public class Book {
    private String nameOfTheBook;
   private int publicationYear;
   private Author author;


    public Book(String nameOfTheBook, int publicationYear, Author author){
        this.nameOfTheBook=nameOfTheBook;
        this.publicationYear =publicationYear;
        this.author =author;


    }
    public String getNameOfTheBook(){
        return this.nameOfTheBook;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
}
    public void setPublicationYear(int publicationYear) {
        this.publicationYear=publicationYear;
    }

    @Override
    public String toString() {
        return "Название книги- " +this.nameOfTheBook + " Автор- " + this.author+ " год публикации- "+ this.publicationYear;

    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Book book =(Book) o;
        return publicationYear==book.publicationYear&& Objects.equals(nameOfTheBook, book.nameOfTheBook)&& Objects.equals(author, book.author);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nameOfTheBook, author,publicationYear);

}

}




