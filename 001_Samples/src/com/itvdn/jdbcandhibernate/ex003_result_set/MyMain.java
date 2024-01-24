package com.itvdn.jdbcandhibernate.ex003_result_set;

import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyDBWorker worker = new MyDBWorker();
        List<MyCustomer> customers = worker.getAllCustomers();

        for (MyCustomer cust : customers) {
            System.out.println(cust.getCust_id() + " " + cust.getCust_name() + " " + cust.getCust_tel_number());
        }
    }
}
