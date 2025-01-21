package org.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @Column(length = 10, nullable = false)
    private String phoneNumber;

    @Column(length = 100)
    private String password;

    @Column(length = 100)
    private String name;

    @Column
    private String birthDay;

    @Column(nullable = false)
    private int age;

    @Column(length = 5)
    private String gender;

    @Column(length = 100)
    private String email;

    @Column
    private String dateIn;

    @Column
    private float salary;

    @Column
    private float workDay;

    @Column
    private float bonus;

    @Column
    private float punish;

    @Column
    private float sumSalary;

    // Constructor
    public User() {}

    public User(String phoneNumber, String password, String name, String birthDay, int age, String gender,
                String email, String dateIn, float salary, float workDay, float bonus, float punish) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.dateIn = dateIn;
        this.workDay = workDay;
        this.bonus = bonus;
        this.punish = punish;
        this.salary = salary;
        this.birthDay = birthDay;
        this.sumSalary = (this.salary * workDay + bonus) - punish;
    }

    // Getters and Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateIn() {
        return dateIn;
    }
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public float getWorkDay() {
        return workDay;
    }
    public void setWorkDay(float workDay) {
        this.workDay = workDay;
    }

    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getPunish() {
        return punish;
    }
    public void setPunish(float punish) {
        this.punish = punish;
    }

    public float getSumSalary() {
        return sumSalary;
    }
    public void setSumSalary(float sumSalary) {
        this.sumSalary = sumSalary;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
