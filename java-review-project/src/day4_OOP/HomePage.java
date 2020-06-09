package day4_OOP;

public class HomePage extends NavBar implements LoginOptions {

    @Override
    public void clickNext() {
        System.out.println("Go to store page");
    }

    @Override
    public void signIn() {

    }

    // Elements for HomePage
}
