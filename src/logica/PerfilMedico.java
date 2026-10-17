package logica;

public class PerfilMedico  extends FrecuenciaCardiaca{

    private double weight;
    private int height;
    private String gender;

    public PerfilMedico(String firstName, String lastName, int dayBirth, int monthBirth,
                        int yearBirth , double weight,
                        int height , String gender) {
        super(firstName, lastName, dayBirth, monthBirth, yearBirth);

        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showBMI(){
        double mHeight = height * 0.01;

        double BMI = weight / (mHeight * mHeight);
        if(BMI < 18.5){
            System.out.println("Tu porcentaje de BMI es: " + BMI + " Peso bajo");
        }
        if(BMI >= 18.5 && BMI < 25){
            System.out.println("Tu porcentaje de BMI es: " + BMI + " Peso normal");
        }
        if(BMI >= 25 && BMI < 30){
            System.out.println("Tu porcentaje de BMI es: " + BMI + " Sobrepeso");
        }
        if(BMI >= 30){
            System.out.println("Tu porcentaje de BMI es: " + BMI + " Obesidad");
        }

    }

    public void showFullName(){
        System.out.println("Hola " + getFirstName() + getLastName());
    }

    public void showHegihtWeight(){
        System.out.println("Pesas: " + getWeight() + " Mides: " + getHeight());
    }


}
