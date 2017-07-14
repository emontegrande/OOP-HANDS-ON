/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montegrande_task3a;

/**
 *
 * @author 3rd Year Account
 */
class VicePresident extends Employee{
    
    VicePresident(){
        System.out.println("Constructor of VicePresident has been loaded.");
    }
    void setName(String name){
        this.name= ("VP "+ name.toUpperCase());
    }
    String displayName(){
        return this.name;
    }
}
