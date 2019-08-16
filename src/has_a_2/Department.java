package has_a_2;

import java.util.List;

/**
 * Ibodulla Ibodullaev created on 16.08.2019 inside the package - has_a_2
 */
class Department
{

    String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {

        this.name = name;
        this.students = students;

    }

    public List<Student> getStudents()
    {
        return students;
    }
}