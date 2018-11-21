package quyet.demo.hibernate.entities.simplehr;


public class SalaryGrade {

    private long grade;
    private double highSalary;
    private double lowSalary;


    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }


    public double getHighSalary() {
        return highSalary;
    }

    public void setHighSalary(double highSalary) {
        this.highSalary = highSalary;
    }


    public double getLowSalary() {
        return lowSalary;
    }

    public void setLowSalary(double lowSalary) {
        this.lowSalary = lowSalary;
    }

}
