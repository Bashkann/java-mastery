package question02_student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        Random random = new Random();

        // 1. Rastgele öğrencileri oluştur
        for (int i = 0; i < 100; i++) {
            int randomId = 202400 + i;
            int randomGrade = random.nextInt(101);
            students[i] = new Student(randomId, randomGrade);
        }

        // 2. Notlara göre büyükten küçüğe sırala
        sortStudents(students);

        // 3. Yazdır
        System.out.println("--- Students Sorted by Grade (Descending) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Basit Sıralama Metotu (Bubble Sort)
    public static void sortStudents(Student[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                // Eğer sol taraftaki not, sağdakinden küçükse yer değiştir (Azalan sıra)
                if (list[j].grade < list[j + 1].grade) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}