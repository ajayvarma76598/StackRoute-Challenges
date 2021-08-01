public class StudentData {
    private String name;
    private int roll;
    private String id;
    private double maths;
    private double english;
    private double language;
    private double socialStudies;
    private double science;
    public int getRoll() {
        return roll;
    }
    public double gettotal(){
        return (this.maths+this.english+this.language+this.socialStudies+this.science);
    }
    public double getAverage(){
        return (this.maths+this.english+this.language+this.socialStudies+this.science)/5.0;
    }
    public char getGrades(){
        double average = getAverage();
        char result = 'A';
        if (average >= 95) {
            result = 'A';
        } else if (average >= 80 && average < 90) {
            result = 'B';
        }
        else if (average >= 70 && average < 80) {
            result = 'C';
        }
        else if (average >= 60 && average < 70) {
            result = 'D';
        }
        else if (average >= 50 && average < 60) {
            result = 'E';
        }
        else if (average < 50) {
            result ='F';
        }
        return result;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getMaths() {
        return maths;
    }
    public void setMaths(double maths) {
        this.maths = maths;
    }
    public double getEnglish() {
        return english;
    }
    public void setEnglish(double english) {
        this.english = english;
    }
    public double getLanguage() {
        return language;
    }
    public void setLanguage(double language) {
        this.language = language;
    }
    public double getSocialStudies() {
        return socialStudies;
    }
    public void setSocialStudies(double socialStudies) {
        this.socialStudies = socialStudies;
    }
    public double getScience() {
        return science;
    }
    public void setScience(double science) {
        this.science = science;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
