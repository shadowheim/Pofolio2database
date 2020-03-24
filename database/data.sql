DROP TABLE IF EXISTS Students;
DROP TABLE IF EXISTS Grades;
DROP TABLE IF EXISTS Course;

CREATE TABLE IF NOT EXISTS Students (
    StudentID INTEGER primary key autoincrement,
    Name VARCHAR,
    City VARCHAR
);
CREATE TABLE IF NOT EXISTS Grades
(
    GradeID      INTEGER primary key autoincrement ,
    CourseID     INTEGER,
    StudentID    INTEGER,
    Grade        INTEGER,
    foreign key (CourseID) REFERENCES Course (CourseID),
    foreign key (StudentID) REFERENCES Students (StudentID)
);
CREATE TABLE IF NOT EXISTS Instructor (
    InstructorID INTEGER PRIMARY KEY autoincrement,
    Name VARCHAR
);
CREATE TABLE IF NOT EXISTS Course (
    CourseID INTEGER primary key autoincrement,
    InstructorID INTEGER,
    Name VARCHAR,
    foreign key (InstructorID) REFERENCES Instructor (InstructorID)
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
    ('Janet Jensen','Jyllinge');

INSERT INTO Instructor (Name) values
    ('Line'),
    ('Ebbe');

INSERT INTO Grades (CourseID, StudentID, Grade) values
    /*1 = SD2019, 2 = SD2020, 3 = ES1 */
    (3, 001, 10),
    (3, 002, 12),
    (3, 003, 10),
    (3, 004, 2),
    (3, 005, 7),
    (3, 006, 10),
    (3, 007, 12),
    (3, 008, 12),
    (3, 009, 12),
    (3, 010, 7);
INSERT INTO Course (NAME,InstructorID) values
    ('SD 2019 autumn', 1),
    ('SD 2020 spring', 1),
    ('ES1 2019 autumn', 2);