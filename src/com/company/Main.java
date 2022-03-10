package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Student> arraylist = new ArrayList<>(List.of(new Student("Mavluda", 19, "Java"),
                new Student("Aichurok", 28, "Java"),
                new Student("Muhammed", 25, "JS"),
                new Student("Chynara", 33, "Java-5"),
                new Student("Ulan", 26, "JS-5"),
                new Student("Kunzaada", 24, "Java"),
                new Student("Almaz", 20, "JS-4"),
                new Student("Nurzhan", 24, "Java-2"),
                new Student("Nurgazy", 24, "JS"),
                new Student("Dilbara", 19, "Java"),
                new Student("Kanat", 18, "JS"),
        new Student("Maksat", 30, "JS-3"),
        new Student("Jamal", 69, "Java-3"),
        new Student("Jakip", 20, "JS"),
        new Student("Nargiza", 19, "Java-4"),
        new Student("Kuba", 17, "JS-5"),
        new Student("Barchinay", 29, "Java"),
        new Student("Tologon", 25, "JS"),
        new Student("Klara", 30, "Java"),
        new Student("Dautali", 27, "JS")));

        ArrayList<Student> java = new ArrayList<>();
        ArrayList<Student> js = new ArrayList<>();
        ArrayList<Student> ageFilter = new ArrayList<>();
        ArrayList<Student> nameFilter = new ArrayList<>();
        ArrayList<Student> moreThanThirty = new ArrayList<>();
        ArrayList<Student> studentsNameWithK = new ArrayList<>();

        for (Student student : arraylist) {
            if (student.getGroup().contains("Java")) {
                java.add(student);
            } else {
                js.add(student);
            }
        }
        for (Student student : arraylist) {
            if (student.getAge() > 18 && student.getAge() < 20) {
                ageFilter.add(student);
            }
        }
        for (Student student : arraylist) {
            if(student.getName().startsWith("A")) {
                nameFilter.add(student);
            }
        }

        for (Student student : arraylist) {
            if(student.getGroup().contains("Java") && student.getAge() > 30) {
                moreThanThirty.add(student);
            }
        }

        for (Student student : arraylist) {
            if(student.getGroup().contains("JS") && student.getName().contains("K") ||
                    student.getName().contains("k")) {
                studentsNameWithK.add(student);
            }
        }
        arraylist.removeIf(x -> x.getAge() < 18);






       //sout(java);
       // sout(js);
       // sout(ageFilter);
       // sout(nameFilter);
      //  sout(moreThanThirty);
//       sout(studentsNameWithK);
        sout((ArrayList<Student>) arraylist);

    }

    public static void sout(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

 }



