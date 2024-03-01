package arrays;

public class Classroom {
    public static void main(String[] args){
        //Different ways of declaring an array
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        double[] mathScores = new double[4];
        // Changing the values of an array
        mathScores[0] = 94.5;
        mathScores[2] = 76.8;
        //'length' method to compute the length of an array
        System.out.println("The number of students in the class is "+ students.length);
    }
}
