/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montegrande_task3a;

/**
 *
 * @author 3rd Year Account
 */
class Janitor extends Employee{
    
    Janitor(){
        System.out.println("Constructor of Janitor has been loaded.");
    }
    void setName(String name){
        this.name= ("Mr ." +name);
    }
    String displayName(){
        return this.name;
    }
}
