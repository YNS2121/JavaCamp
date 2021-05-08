
import kodlama.io.Course;


public class CourseManager extends Course {
    
    public CourseManager(int id, String name, int price, String category) {
        super(id, name, price, category);
    }
     public void Add(String name){
        System.out.println("Course Added");
    }
}
