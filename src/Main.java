public class Main {
    static void main(String[] args) {
        Person person=new Person("mohammad", "2000-05-15", "male");
Printer printer=new JsonPrinter();
printer.print(person);
    Printer printer1=new XmlPrinter();
    printer1.print(person);
    }

}

