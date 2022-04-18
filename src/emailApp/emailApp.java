package emailApp;

public class emailApp {

	public static void main(String[] args) {
Email  em1 = new Email("Will", "Smith");
em1.setAlternateEmail("IloveJava@java.com");
System.out.println(em1.getAlternateEmail());
	}

}
