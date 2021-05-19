package ikinciDersOdev1;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println("Kurs eklendi: " + course.courseName);
	}
	
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi: " + course.courseName);
	}
	
	public void contentDelete(Course course) {
		System.out.println("Kurs içeriği silindi: " + course.courseDetail);
	}
	

}
