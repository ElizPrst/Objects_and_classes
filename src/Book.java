public class Book {

    String nameOfTheBook;
    int publicationYear;
    Author author;


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

    }




