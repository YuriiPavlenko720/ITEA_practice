package HW_16_05;

import java.util.Date;

public class Employee {
    private int id;
    private String emp_name;
    private String emp_phone_number;
    private String emp_marital_status;
    private Date emp_birth;
    private String emp_address;
    private String emp_position;
    private int emp_salary;

    public Employee(int id, String emp_name, String emp_phone_number,
                    String emp_marital_status, Date emp_birth, String emp_address,
                    String emp_position, int emp_salary) {
        this.id = id;
        this.emp_name = emp_name;
        this.emp_phone_number = emp_phone_number;
        this.emp_marital_status = emp_marital_status;
        this.emp_birth = emp_birth;
        this.emp_address = emp_address;
        this.emp_position = emp_position;
        this.emp_salary = emp_salary;
    }

    public int getId() {
        return id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_phone_number() {
        return emp_phone_number;
    }

    public String getEmp_marital_status() {
        return emp_marital_status;
    }

    public Date getEmp_birth() {
        return emp_birth;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public int getEmp_salary() {
        return emp_salary;
    }
}
