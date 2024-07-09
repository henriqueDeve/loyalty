package org.sistem.entity;

import java.util.List;

public class Customer {

    private String name;
    private String cpf;
    private String age;
    private String phone;
    private String email;
    private List<Account> account;
    private List<Score> scores;
    private Long total;
    private List<Product> recurringProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<Product> getRecurringProducts() {
        return recurringProducts;
    }

    public void setRecurringProducts(List<Product> recurringProducts) {
        this.recurringProducts = recurringProducts;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
