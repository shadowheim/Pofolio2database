package com.company;

public enum GradeType {
    Student ("StudentID", "student"),
    Course ("CourseID", "course");

    private String type;
    private String raw;

    GradeType(String type, String raw) {
        this.type = type;
        this.raw = raw;
    }

    public static GradeType fromInt(char type){
        switch (type) {
            case 's': return GradeType.Student;
            case 'c':
            default: return GradeType.Course;
        }
    }

    String getType() {
        return type;
    }

    String getRaw() {
        return raw;
    }
}
