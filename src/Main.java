public class Main {

    public static void main(String[] args){
        Book dorianGray  = new Book("The picture of Dorian Gray", 1890);
        Book winnieThePooh = new Book("Winnie-The-Pooh",1926);
        Author oscarWilde = new Author("Oscar","Wilde");
        Author alanMilne = new Author("Alan","Milne");

        System.out.println ("Название книги '" + dorianGray.getNameOfTheBook()+"'");
        System.out.println ("Год издания " + dorianGray.getPublicationYear());
        System.out.println ("Автор книги " +  oscarWilde.getName()+" "+oscarWilde.getSurname());
    }
    }
