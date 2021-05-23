package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ѧ������ϵͳ
 */
public class StudentManage {
    public static void main(String[] args) {
        // �������϶���,���ڴ洢ѧ������
        ArrayList<Student> array = new ArrayList<Student>();
        // ��ѭ������ٴλص�������
        while (true) {
            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��:");

            // ����¼������
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            // ��switch�����ɲ�����ѡ��
            switch (line) {
                case "1":
                    // System.out.println("���ѧ��");
                    addStudent(array);
                    break;
                case "2":
                    // System.out.println("ɾ��ѧ��");
                    deleteStudent(array);
                    break;
                case "3":
                    // System.out.println("�޸�ѧ��");
                    updateStudent(array);
                    break;
                case "4":
                    // System.out.println("�鿴����ѧ��");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("ллʹ��");
                    // break;
                    System.exit(0);
            }
        }
    }

    // ���ѧ������
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ��ѧ��:");
        String sid = sc.nextLine();
        System.out.println("������ѧ������:");
        String name = sc.nextLine();
        System.out.println("������ѧ������:");
        String age = sc.nextLine();
        System.out.println("������ѧ����ס��:");
        String address = sc.nextLine();

        // ����ѧ������,�Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // ��ѧ��������ӵ�������
        array.add(s);

        // ������ʾ��ӳɹ�
        System.out.println("���ѧ���ɹ�");
    }

    // �鿴ѧ������
    public static void findAllStudent(ArrayList<Student> array) {
        // �жϼ������Ƿ�������,���û����ʾ��ʾ��Ϣ
        if (array.size() == 0) {
            System.out.println("����ѧ����Ϣ!����������");
            // Ϊ���ó���������ִ��,����return
            return;
        }

        // ��ʾ��ͷ��Ϣ
        System.out.println("ѧ��\t\t\t����\t\t����\t\t��ס��");
        // ������������ȥ�����ն�Ӧ��ʽ��ʾѧ����Ϣ, ������ʾ����"��"
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAge() + "��\t" + s.getAddress());
        }
    }

    // ɾ��ѧ������
    /*public static void deleteStudent(ArrayList<Student> array) {
        // ����¼��Ҫɾ����ѧ��id
        Scanner sc = new Scanner(System.in);

        System.out.println("������Ҫɾ����ѧ��id");
        String sid = sc.nextLine();

        // �������Ͻ���Ӧѧ������Ӽ�����ɾ��
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }

        // ������ʾɾ���ɹ�
        System.out.println("ɾ��ѧ���ɹ�!");
    }*/

    // ɾ��ѧ������/����id������
    public static void deleteStudent(ArrayList<Student> array){
        // ��������Ҫɾ����ѧ��ѧ��,��ʾ��ʾ��Ϣ
        Scanner sc = new Scanner(System.in);

        System.out.println("��������Ҫɾ����ѧ��ѧ��");
        String sid = sc.nextLine();

        // ��ɾ��/�޸�ѧ������֮ǰ,��ѧ���Ƿ���ڽ����ж�
    }

    // �޸�ѧ������
    public static void updateStudent(ArrayList<Student> array) {
        // ����¼��Ҫ�޸�ѧ��ѧ��,��ʾ��ʾ��Ϣ
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ�޸ĵ�ѧ��ѧ��:");
        String sid = sc.nextLine();

        // ����¼��Ҫ�޸ĵ�ѧ����Ϣ
        System.out.println("������ѧ��������:");
        String name = sc.nextLine();
        System.out.println("������ѧ��������:");
        String age = sc.nextLine();
        System.out.println("������ѧ���µ�ַ:");
        String address = sc.nextLine();

        // ����ѧ������
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // ���������޸Ķ�Ӧѧ����Ϣ
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }

        // �����޸ĳɹ���ʾ
        System.out.println("�޸�ѧ���ɹ�!");
    }
}
