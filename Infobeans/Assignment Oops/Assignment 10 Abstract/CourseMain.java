abstract class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void showContent();

    void displayDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class ProgrammingCourse extends Course {
    String language;

    ProgrammingCourse(String courseName, int duration, String language) {
        super(courseName, duration);
        this.language = language;
    }

  
    void showContent() {
        System.out.println("This course covers programming in " + language + ".");
    }
}

class DesignCourse extends Course {
    String tool;

    DesignCourse(String courseName, int duration, String tool) {
        super(courseName, duration);
        this.tool = tool;
    }


    void showContent() {
        System.out.println("This course focuses on design using " + tool + ".");
    }
}

public class CourseMain {
    public static void main(String[] args) {
        ProgrammingCourse pc = new ProgrammingCourse("Java Basics", 4, "Java");
        pc.displayDetails();
        pc.showContent();

        System.out.println();

        DesignCourse dc = new DesignCourse("Graphic Design", 6, "Adobe Photoshop");
        dc.displayDetails();
        dc.showContent();
    }
}
