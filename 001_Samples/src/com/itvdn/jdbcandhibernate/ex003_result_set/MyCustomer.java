package com.itvdn.jdbcandhibernate.ex003_result_set;

public class MyCustomer {
    private int cust_id;
    private String cust_name;
    private String cust_tel_number;

    public MyCustomer(int cust_id, String cust_name, String cust_tel_number) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_tel_number = cust_tel_number;
    }

    public int getCust_id() {
        return cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getCust_tel_number() {
        return cust_tel_number;
    }
}
