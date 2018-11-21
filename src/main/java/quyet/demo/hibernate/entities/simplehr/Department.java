package quyet.demo.hibernate.entities.simplehr;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "department" ,
        uniqueConstraints = @UniqueConstraint(columnNames = "DEPT_NO"))
public class Department {
    @Id @Column(name = "DEPT_ID")
    private long deptId;

    @Column(name = "DEPT_NAME" , nullable = false) @NotNull
    private String deptName;

    @Column(name = "DEPT_NO" , unique = true) @NotNull
    private String deptNo;

    @Column(name = "LOCATION")
    private String location;


    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptNo='" + deptNo + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
