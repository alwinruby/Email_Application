package emailapp;

public class EmailApp {
    public static void main(String[] args){
        Email eml = new Email("Dilip", "Patel");

//        eml.setAlternateEmail("dpatel@gmail.com");
//        System.out.println(eml.getAlternateEmail());
        System.out.println(eml.showInformation());
    }
}
