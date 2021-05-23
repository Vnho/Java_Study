package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 学生管理系统
 */
public class StudentManage {
    public static void main(String[] args) {
        // 创建集合对象,用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();
        // 用循环完成再次回到主界面
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");

            // 键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            // 用switch语句完成操作的选择
            switch (line) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    // System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    // System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    // System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    // break;
                    System.exit(0);
            }
        }
    }

    // 添加学生方法
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地:");
        String address = sc.nextLine();

        // 创建学生对象,把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到集合中
        array.add(s);

        // 给出提示添加成功
        System.out.println("添加学生成功");
    }

    // 查看学生方法
    public static void findAllStudent(ArrayList<Student> array) {
        // 判断集合中是否有数据,如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("暂无学生信息!请重新输入");
            // 为了让程序不再向下执行,给出return
            return;
        }

        // 显示表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        // 将集合中数据去除按照对应格式显示学生信息, 年龄显示补充"岁"
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    // 删除学生方法
    /*public static void deleteStudent(ArrayList<Student> array) {
        // 键盘录入要删除的学生id
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生id");
        String sid = sc.nextLine();

        // 遍历集合将对应学生对象从集合中删除
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }

        // 给出提示删除成功
        System.out.println("删除学生成功!");
    }*/

    // 删除学生方法/查找id不存在
    public static void deleteStudent(ArrayList<Student> array){
        // 键盘输入要删除的学生学号,显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号");
        String sid = sc.nextLine();

        // 在删除/修改学生操作之前,对学号是否存在进行判断
    }

    // 修改学生方法
    public static void updateStudent(ArrayList<Student> array) {
        // 键盘录入要修改学生学号,显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号:");
        String sid = sc.nextLine();

        // 键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生新地址:");
        String address = sc.nextLine();

        // 创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 遍历集合修改对应学生信息
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }

        // 给出修改成功提示
        System.out.println("修改学生成功!");
    }
}
