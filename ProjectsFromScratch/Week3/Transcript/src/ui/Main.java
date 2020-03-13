package ui;

import model.Transcript;

public class Main {

    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("Zachary", 100);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        t2.addGrade("MATH 500", 4.0);
        t2.addGrade("SCHOOL 500", 4.0);

        t3.addGrade("OUTSIDE 501", 4.0);

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println(t1.getGPA());
        t1.addGrade("Bologna 601", 2.1);
        System.out.println(t1.getGPA());


    }
}
