public class authorApp {
    public static void main(String[] args) {

        Author author1 = new Author();
        Author author2 = new Author("John", "Jon");
        author1.printData();
        author2.printData();

        author1.setFirstName("Jack");
        author1.printData();
        author2.setLastName("Johnson");
        author2.printData();
    }
}

class Author{
    public String firstName;
    public String lastName;


    public Author(){
        firstName = "";
        lastName = "";
    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void printData(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
    }


}