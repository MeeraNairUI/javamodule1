package javarecord;

import java.util.List;

public record Student(String name, int id, List<Integer> grades) {
	
	public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    public boolean hasPassingGrade() {
        for (int grade : grades) {
            if (grade >= 60) {
                return true;
            }
        }
        return false;
    }

}
