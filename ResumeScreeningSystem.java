class JobRole {
    int roleId;
    JobRole(int roleId) {
        this.roleId = roleId;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(int roleId) {
        super(roleId);
    }
}

class DataScientist extends JobRole {
    DataScientist(int roleId) {
        super(roleId);
    }
}

class ProductManager extends JobRole {
    ProductManager(int roleId) {
        super(roleId);
    }
}

class Resume<T extends JobRole> {
    T jobRole;
    int experience;
    
    Resume(T jobRole, int experience) {
        this.jobRole = jobRole;
        this.experience = experience;
    }
}

class ResumeProcessor {
    static void processResumes(Resume<? extends JobRole>[] resumes) {
        for (int i = 0; i < resumes.length; i++) {
            System.out.println(resumes[i].experience);
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer(1), 5);
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist(2), 3);
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager(3), 7);

        Resume<?>[] resumes = {seResume, dsResume, pmResume};
        ResumeProcessor.processResumes(resumes);
    }
}
