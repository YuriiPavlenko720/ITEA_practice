package HW_16_05;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        DB_Employees db_emp = new DB_Employees();
        List<Employee> employees = db_emp.getAllEmployees();

        System.out.println("Номери телефонів та місце проживання всіх співробітників:");
        for (Employee emp : employees) {
            System.out.println(emp.getId() + ". " + emp.getEmp_name() + ": " +
                    emp.getEmp_phone_number() + ", " + emp.getEmp_address());
        }

        System.out.println(".................................");
        System.out.println("Номери телефонів та дата народження всіх неодружених співробітників:");
        for (Employee emp : employees) {
            if (emp.getEmp_marital_status().equals("Single")) {
                System.out.println(emp.getId() + ". " + emp.getEmp_name() + " (" +
                        emp.getEmp_birth() + "): " + emp.getEmp_phone_number());
            }
        }

        System.out.println(".................................");
        System.out.println("Номери телефонів та дата народження всіх менеджерів:");
        for (Employee emp : employees) {
            if (emp.getEmp_position().equals("Manager")) {
                System.out.println(emp.getId() + ". " + emp.getEmp_name() + " (" +
                        emp.getEmp_birth() + "): " + emp.getEmp_phone_number());
            }
        }
    }
}
