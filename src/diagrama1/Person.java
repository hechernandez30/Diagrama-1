package diagrama1;
public class Person {
    //Definir atributos
    String name;
    String address;
    //Definir los metodos.
    public void Person(String name, String address){
        System.out.println("My name is " + name + ".");
        System.out.println("My address is " + address + ".");
    }
    public String getName(){
        System.out.println("My name is ..." + name);
        return name;
    }
    public String getAddress(){
        System.out.println("My address is ..." + address);
       return address; 
    }
    public void setAddress(String direccion){
        System.out.println("La direccion ingresada es " + direccion + ".");
    }
    public String toString(){
        System.out.println("Estoy imprimiendo desde la clase Person");
        
     return null;   
    }
}
