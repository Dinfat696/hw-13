public class Author {
    private String name;
    private String lastName;

    public Author(String name, String firstName) {
        this.name = name;
        this.lastName = firstName;
    }

    public String getName() {
        return this.name;
    }


    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Имя фамилия автора " + this.getName() + " " + this.getLastName();
    }
}