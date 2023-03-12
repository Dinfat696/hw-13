public class Main {
    public static void main(String[] args) {

        Author edUsp= new Author("Эдуард", "Успенский");
        Author korChu= new Author("Эдуард", "Успенский");
        Book chcheburashka = new Book("Чебурашка", edUsp, 1934);
        Book powderfill = new Book("Айболит", korChu, 1876);
        chcheburashka.setPublishingYear(1876);

        System.out.println(edUsp);
        System.out.println(korChu);
        System.out.println();
        System.out.println(chcheburashka);
        System.out.println(powderfill);
        System.out.println();
        System.out.println(chcheburashka.equals(powderfill));//сравнил название книги
        System.out.println();
        System.out.println(edUsp.equals(korChu));//сравнил автора
        System.out.println();
        System.out.println(chcheburashka.getPublishingYear()==(powderfill.getPublishingYear()));//сравнил год
        System.out.println();
        System.out.println(edUsp.hashCode());
        System.out.println(korChu.hashCode());
        System.out.println();
        System.out.println(chcheburashka.hashCode());
        System.out.println(powderfill.hashCode());






    }
}