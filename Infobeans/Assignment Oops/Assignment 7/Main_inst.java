class Institution 
{
    private String name;
    private String location;

    public Institution(String name, String location) 
	{
        this.name = name;
        this.location = location;
    }

    public String getName() 
	{
        return name;
    }

    public String getLocation() 
	{
        return location;
    }

    public void displayDetails() 
	{
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }
}

class School extends Institution 
{
    private int numOfStudents;

    public School(String name, String location, int numOfStudents) 
	{
        super(name, location);
        this.numOfStudents = numOfStudents;
    }

    public void displaySchoolDetails() 
	{
        displayDetails();
        System.out.println("Number of Students: " + numOfStudents);
    }
}

class College extends Institution 
{
    private String coursesOffered;

    public College(String name, String location, String coursesOffered) 
	{
        super(name, location);
        this.coursesOffered = coursesOffered;
    }

    public void displayCollegeDetails() 
	{
        displayDetails();
        System.out.println("Courses Offered: " + coursesOffered);
    }
}

class University extends Institution 
{
    private String researchPrograms;

    public University(String name, String location, String researchPrograms) 
	{
        super(name, location);
        this.researchPrograms = researchPrograms;
    }

    public void displayUniversityDetails() 
	{
        displayDetails();
        System.out.println("Research Programs: " + researchPrograms);
    }
}

public class Main_inst 
{
    public static void main(String[] args) 
	{
        School school1 = new School("Indore Public School", "Indore", 1200);
        School school2 = new School("Emerald Heights International School", "Indore", 2500);
        School school3 = new School("Shishukunj International School", "Indore", 2000);
        School school4 = new School("Delhi Public School", "Indore", 1800);

        College college = new College("Indore Christian College", "Indore", "Science, Commerce, Arts");
        University university = new University("Devi Ahilya Vishwavidyalaya", "Indore", "AI, Data Science, Management");

        school1.displaySchoolDetails();
        school2.displaySchoolDetails();
        school3.displaySchoolDetails();
        school4.displaySchoolDetails();
        college.displayCollegeDetails();
        university.displayUniversityDetails();
    }
}
