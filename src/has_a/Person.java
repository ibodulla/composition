package has_a;

/**
 * Ibodulla Ibodullaev created on 16.08.2019 inside the package - has_a
 */
public class Person {

    //composition has-a relationship
    private Job job;

    public Person() {
        this.job = new Job();
        job.setSalary(1000L);
    }

    public long getSalary() {
        return job.getSalary();
    }
}