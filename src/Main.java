public class Main {

    public static void main(String[] args){
        Author oscarWilde = new Author("Oscar","Wilde");
        Book dorianGray  = new Book("The picture of Dorian Gray", 1890, oscarWilde);
        Author alanMilne = new Author("Alan","Milne");
        Book winnieThePooh = new Book("Winnie-The-Pooh",1926, alanMilne);

        System.out.println (dorianGray);
        System.out.println (winnieThePooh);
    }
    }
