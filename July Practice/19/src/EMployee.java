public class EMployee {
    int id;
    String nmae;
    long salary;

    public EMployee() {
    }

    public EMployee(int id, String nmae, long salary) {
        this.id = id;
        this.nmae = nmae;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    @Override
    public String toString() {
        return "EMployee{" +
                "id=" + id +
                ", nmae='" + nmae + '\'' +
                ", salary=" + salary +
                '}';
    }
}
