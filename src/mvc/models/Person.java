/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.models;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String mob;
    private String email;
    private String department;
    private String mentor;
    
    
   /* public User(){
        x=0;
    }
    
    public User(int x){
        this.x=x;
    }
    
    public void incX(){
        x++;
    }
    
    public void decX(){
        x--;
    }
    public int getX(){
        return x;
    }*/
    public String getName(){
        return this.name; 
   }
    
    public String getMob(){
        return this.mob; 
   }
    
    public String getEmail(){
        return this.email; 
   }
    public String getDepartment(){
        return this.department;
    }
    
    public String getMentor()
    {
        return this.mentor;
    }
    
    public void setData(String name, String mob,String email, String department, String mentor){
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.department = department;
this.mentor=mentor;
    }
    
 

}