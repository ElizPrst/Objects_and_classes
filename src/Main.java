public class Main {

    public static void main(String[] args){
        Author oscarWilde = new Author("Oscar","Wilde");
        Book dorianGray  = new Book("The picture of Dorian Gray", 1890, oscarWilde);
        Author alanMilne = new Author("Alan","Milne");
        Book winnieThePooh = new Book("Winnie-The-Pooh",1926, alanMilne);

        System.out.println ("Название книги '" + dorianGray.getNameOfTheBook()+"'");
        System.out.println ("Автор книги " + dorianGray.getAuthor());
        System.out.println ("Год издания " + dorianGray.getPublicationYear());
        dorianGray.setPublicationYear(1889);
        System.out.println ("Исправленный год издания " + dorianGray.getPublicationYear());

        System.out.println ("-------------------" );

        System.out.println ("Название книги '" + winnieThePooh.getNameOfTheBook()+"'");
        System.out.println ("Автор книги " + winnieThePooh.getAuthor());
        System.out.println ("Год издания " + winnieThePooh.getPublicationYear());
    }
    }
