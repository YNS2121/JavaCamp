
package kodlama.io;



public class Main {
   
    public static void main(String[] args) {
    
        Student student = new Student(3,"Yaren","Solmaz");
        Instructor instructor = new Instructor(21,"Engin","Demiroğ","engin@gamail.com");
        
        
        StudentManager studentManager = new StudentManager();
        studentManager.Add(student);

        InstructorManager instructorManeger = new InstructorManager();
        instructorManeger.Add(instructor);
        
        
        
        
        
        /* User user = new Student(3,"Yaren","Solmaz");
     User user1 = new Instructor(21,"Engin","Demiroğ","engin@gamail.com");
     Course course = new Course(3,"Java",27,"software");
     
    /* System.out.println("Welcome " +  user.getName());
     System.out.println("Welcome " + user1.getName());
     System.out.println("Course added " + course.getName() + " From " + course.getCategory());*/

    /* User[] users={user,user1};
     for(User person : users){
         System.out.println(user.getName());
         System.out.println(user1.getName());
     }
     UserManager userManager= new UserManager();
          
     userManager.Add(user);
     userManager.Add(user1);*/
     
     
     
    }

    
    
}
