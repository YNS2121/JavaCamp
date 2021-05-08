
package kodlama.io;


public class Instructor extends User {
    private String email;
   

   
    public Instructor(int id, String name, String surname,String email) {
        super(id, name, surname);
        this.email=email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
