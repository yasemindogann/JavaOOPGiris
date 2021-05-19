package ikinciDersOdev1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "JAVA", "Yazılım Geliştirme Kampı'Java' ", "Engin Demiroğ");
		Course course2 = new Course(2, "C#", "Yazılım Geliştirme Kampı'C#'", "Engin Demiroğ");
		Course course3 = new Course(3, "PYTHON", "Yazılım Geliştirme Kampı'PYTHON' ", "Engin Demiroğ");
		Course course4 = new Course(4, "PHP", "Yazılım Geliştirme Kampı'PHP'", "Engin Demiroğ");
		
		
		Course[] course = { course1, course2, course3, course4 };
		
		for(Course kurs: course) {
			System.out.println(kurs.courseName+" "+ kurs.courseDetail+ " "+ kurs.courseTeacher);
		}
		
		System.out.println("********************");
		
		System.out.println(course.length);
		
		System.out.println("********************");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1); 
		
		courseManager.deleteCourse(course2);
		
		courseManager.addCourse(course3);
		
		courseManager.contentDelete(course4);

    }

}