package com.company;

public enum GradeType {
    Student ("StudentID"),
    Course ("CourseID");

    private String type;

    GradeType(String type) {
        this.type = type;
    }

    public static GradeType fromInt(char type){
        switch (type) {
            case 'y': return GradeType.Student;
            case 'n':
            default: return GradeType.Course;
        }
    }

    String getType() {
        return type;
    }
}
