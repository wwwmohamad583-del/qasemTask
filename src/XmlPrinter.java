public class XmlPrinter extends Main implements Printer {
    @Override
    public void print(Person person) {

        String xml = "<person>"
                + "<name>"+person.getName()+"</name>\n"
                + "<age>"+person.getAge()+"</age>\n"
                + "<dop>"+person.getDateOfBirth()+"</dop>\n"
                + "<gender>"+person.getGender()+"</gender>\n"

                + "</person>";

        System.out.println("XML:");
        System.out.println(xml);
    }
}