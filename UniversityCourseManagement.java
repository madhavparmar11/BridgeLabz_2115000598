class CourseType {
    int typeId;
    CourseType(int typeId) {
        this.typeId = typeId;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(int typeId) {
        super(typeId);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(int typeId) {
        super(typeId);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(int typeId) {
        super(typeId);
    }
}

class Course<T extends CourseType> {
    T courseType;
    String name;
    
    Course(T courseType, String name) {
        this.courseType = courseType;
        this.name = name;
    }
}

class CourseManager {
    static void displayCourses(Course<? extends CourseType>[] courses) {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i].name);
        }
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> exam = new Course<>(new ExamCourse(1), "Mathematics");
        Course<AssignmentCourse> assignment = new Course<>(new AssignmentCourse(2), "History");
        Course<ResearchCourse> research = new Course<>(new ResearchCourse(3), "Physics");

        Course<?>[] courses = {exam, assignment, research};
        CourseManager.displayCourses(courses);
    }
}
