package logica;
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciaCardiaca {
    private  String firstName ;
    private String lastName ;
    private int dayBirth;
    private int monthBirth;
    private int yearBirth;
    private LocalDate birthDate;
    private int age;
    static int pulsesMinute = 220;


    public FrecuenciaCardiaca(String firstName, String lastName, int dayBirth, int monthBirth, int yearBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.birthDate = LocalDate.of(yearBirth,monthBirth,dayBirth);

        this.age = Period.between(birthDate, LocalDate.now()).getYears();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showHearthRange(){
        int maxRange =  pulsesMinute - age ;
        System.out.println("Tú frecuencia cardiaca máxima es: " + maxRange);
    }

    public void showAge(){
        System.out.println("Tienes " + getAge() + " años");
    }

    public void showHealthyRange(){
        double minHealth = (pulsesMinute - age) * 0.5;
        double maxHealth = (pulsesMinute - age) * 0.85;

        int minHealthy =(int) minHealth;
        int maxHealthy =(int) maxHealth;

        System.out.println("Tú rango minimo saludable de frecuencia cardiaca es " + minHealthy + " y tu rango maximo es " + maxHealthy);
    }


}
