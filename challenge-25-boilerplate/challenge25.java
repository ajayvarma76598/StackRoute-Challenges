import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;
class Challenge25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student data you want to add");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] data = new String[7];
        StudentData[] student = new StudentData[n];
        for (int i = 0; i < student.length; i++) {
            student[i] = new StudentData();
            System.out
                    .println("Enter the name,roll,marks in maths,science,english,language,social studies respectively");
            String info = scanner.nextLine();
            data = info.split(",");
            student[i].setName(data[0]);
            student[i].setRoll(Integer.parseInt(data[1]));
            student[i].setMaths(Double.parseDouble(data[2]));
            student[i].setScience(Double.parseDouble(data[3]));
            student[i].setEnglish(Double.parseDouble(data[4]));
            student[i].setLanguage(Double.parseDouble(data[5]));
            student[i].setSocialStudies(Double.parseDouble(data[6]));
        }
        for (int i = 0; i < n; i++) {
            if (student[i].getEnglish() < 35 || student[i].getScience() < 35 || student[i].getLanguage() < 35
                    || student[i].getSocialStudies() < 35 || student[i].getMaths() < 35) {
                
                System.out.println(student[i].getName() + " having roll number" + student[i].getRoll()
                        + " has to repeat the exaination");
            } else {
                System.out.println(student[i].getName() + " having roll number" + student[i].getRoll()
                        + " has successfully passed the exaination");
            }
        }
        System.out.println("\t" + "Result");
        for (int i = 0; i < n; i++) {
            System.out.println("\tName: " + student[i].getName());
            System.out.println("\tRoll Number " + student[i].getRoll());
            System.out.println("\tMaths: " + student[i].getMaths());
            System.out.println("\tEnglish: " + student[i].getMaths());
            System.out.println("\tScience: " + student[i].getScience());
            System.out.println("\tSocial Studies: " + student[i].getSocialStudies());
            System.out.println("\tLangauge: " + student[i].getLanguage());
            System.out.println("\tTotal Marks: "+ student[i].gettotal());
            System.out.println("\tGrade " + student[i].getGrades() + "\n\n");
        }
        scanner.close();
    }
}
