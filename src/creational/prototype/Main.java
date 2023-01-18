package creational.prototype;

public class Main {

    public static void main(String[] args) {

        Mail mail = new Mail("Hello, prototype!");
        Mail clonedMail = mail.clone();

        System.out.println(clonedMail.text());
    }
}
