
package montegrande_task3a;


public class Employee {
    String name;
    
    Employee(){
        System.out.println("Constructor of Employee has been loaded.");
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name= name;
    }
    void displayName(String name){
        System.out.println(name);
    }
}
