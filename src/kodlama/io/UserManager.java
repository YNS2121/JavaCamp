
package kodlama.io;

public class UserManager {
   public void Add(User user){
        System.out.println("User added " + user.getName() + " " + user.getSurname());
        
    }
     public void delete(User user){
        System.out.println("User deleted " + user.getName() + " " + user.getSurname());
        
    }
     public void update(User user){
        System.out.println("User apdated " + user.getName() + " " + user.getSurname());
        
    }
}
