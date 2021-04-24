package cn.hcx.bean;

public class Student {
    private String bor_id;
    private String stu_name;
    private String class_name;

    public Student() {
    }

    public Student(String bor_id, String stu_name, String class_name) {
        this.bor_id = bor_id;
        this.stu_name = stu_name;
        this.class_name = class_name;
    }

    public String getBor_id() {
        return bor_id;
    }

    public void setBor_id(String bor_id) {
        this.bor_id = bor_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bor_id='" + bor_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
