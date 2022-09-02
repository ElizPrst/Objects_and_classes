public class Book {

    String nameOfTheBook;
    int publicationYear;
    String author;


public Book(String nameOfTheBook, int publicationYear, String author){
        this.nameOfTheBook=nameOfTheBook;
        this.publicationYear =publicationYear;
        this.author =author;


    }
    public String getNameOfTheBook(){
        return this.nameOfTheBook;
    }
    public String getAuthor(){
    return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
}
    public void setPublicationYear(int publicationYear) {
        this.publicationYear=publicationYear;
    }
}



