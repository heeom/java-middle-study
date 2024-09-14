package org.example.collections.compare;


public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(MyUser other) {
        return this.age - other.getAge(); // age 오름차순
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }
}
