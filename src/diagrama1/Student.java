package diagrama1;

public class Student extends Person {
    String program;
    int year;
    double fee;
    
    public void Student(String name, String address, String program, int year, double fee){
        System.out.println("El nombre ingresado es " + name + ", la direccion es " + address + 
                ", el programa al que pertenece es " + program + ", los anios son " + year + 
                " y la tarifa impuesta es " + fee + ".");
    }
    public String getProgram(){
        System.out.println("El programa establecido es " + program + ".");
        return program;
    }
    public void setProgram(String program){
        System.out.println("El programa ingresado es " + program + "."); 
    }
    public int getYear(){
        System.out.println("La edad del muchacho es " + year + ".");
        return year;
    }
    public int setYear(int year){
        System.out.println("La edad que ingresaste manualmente es " + year + ".");
        return year;
    }
    public double getFee(){
        System.out.println("La tarifa establecida es " + fee + ".");
        return fee;
    }
    public void setFee(double fee){
        System.out.println("La tarifa ingresada manualmente es " + fee + ".");
    }
    public String toString(){
        System.out.println("Estoy imprimiendo en pantalla desde la clase Student.");
        return null;
    }
}
