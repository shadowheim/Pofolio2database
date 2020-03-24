DROP TABLE IF EXISTS Students;
DROP TABLE IF EXISTS Grades;
DROP TABLE IF EXISTS Course;

CREATE table IF NOT EXISTS Students (
    StudentID INTEGER primary key autoincrement,
    Name VARCHAR,
    City VARCHAR
);
CREATE table IF NOT EXISTS Grades
(
    GradeID      INTEGER primary key autoincrement ,
    CourseID     INTEGER,
    StudentID    INTEGER,
    InstructorID INTEGER,
    Grade        INTEGER,
    foreign key (CourseID) REFERENCES Course (CourseID),
    foreign key (StudentID) REFERENCES Students (StudentID)
);
CREATE table IF NOT EXISTS Course (
    CourseID INTEGER primary key autoincrement,
    Name VARCHAR
);
INSERT INTO Students (Name, City) values
    ('Aisha Lincoln', 'Nykøbing F'),
    ('Anya Nielsen', 'Nykøbing F'),
    ('Benjamin Jensen' , 'Camas'),
    ('Berta Bertelsen' , 'Billund'),
    ('Albert Antonsen','Sorø'),
    ('Eske Eriksen','Eskildstrup'),
    ('Olaf Olesen','Odense'),
    ('Salma Simonsen','Stockholm'),
    ('Theis Thomasen','Tølløse'),
    ('Janet Jensen','Jyllinge')
INSERT INTO Grades (StudentID, )