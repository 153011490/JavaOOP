package model;

public class Student {
    private String name;
    private int age;
    private String sex;
    private Long number;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Student(String name, int age, String sex, Long number) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.number = number;
    }
}
