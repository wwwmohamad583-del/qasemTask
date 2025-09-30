import java.time.LocalDate;
import java.time.Period;


public class Person  {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private String gender;


    public Person(String name, String dateOfBirthstr, String gender) {
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirthstr);
        this.gender = gender;
        this.age = calculateAge(this.dateOfBirth);
    }
    //contrucuer

private  int calculateAge(LocalDate dop) {
     LocalDate now = LocalDate.now();
     return Period.between(dop, now).getYears();

}
//getters
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }


    public String getGender() {
        return gender;
    }




}
