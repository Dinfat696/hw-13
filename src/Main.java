public class Main {
    public static void main(String[] args) {

        Author edUsp= new Author("Эдуард", "Успенский");
        Author korChu= new Author("Эдуард", "Успенский");
        Book chcheburashka = new Book("Чебурашка", edUsp, 1934);
        Book powderfill = new Book("Айболит", korChu, 1876);
        chcheburashka.setPublishingYear(1865);

        System.out.println(chcheburashka.getBookName() + " " + chcheburashka.getAuthor().getLastName()+ " "+chcheburashka.getAuthor().getName()+ " " + chcheburashka.getPublishingYear() + " год ");
        System.out.println(powderfill.getBookName() + " "+ powderfill.getAuthor().getLastName()+ " " + powderfill.getAuthor().getName()+" "+ powderfill.getPublishingYear() + " год ");
        System.out.println();
        System.out.println(edUsp);
        System.out.println(korChu);
        System.out.println();
        System.out.println(chcheburashka + " " + edUsp);
        System.out.println(powderfill + " " + korChu);
        System.out.println();
        System.out.println(chcheburashka.equals(powderfill));
        System.out.println();
        System.out.println(edUsp.equals(korChu));




    }
}