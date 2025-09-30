
public class JsonPrinter  implements Printer {

        @Override
        public void print (Person person){
            String json = "{\n"
                    + "\t\"name\": \"" + person.getName() + "\",\n"
                    + "\t\"age\": " + person.getAge() + ",\n"
                    + "\t\"gender\": " + person.getGender() + "\n"
                    + "\t\"dateOfBirth\": " + person.getDateOfBirth() + "\n"
                    + "}";
            System.out.println("JSON:");
            System.out.println(json);

        }
    }
