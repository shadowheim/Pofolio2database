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
    InstructorID INTEGER,
    Name VARCHAR
    FOREIGN KEY (Instructor) REFERENCES
);
CREATE TABLE IF NOT EXISTS Instructor (
    InstructorID INTEGER PRIMARY KEY autoincrement,
    Name VARCHAR,
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

insert into Instructor (Name) values ('Line'), ('Ebbe');

INSERT INTO Course (
    NAME,
    InstructorID
) values
(SD 2019 autumn, 0),(SD 2020 spring, 0),(ES1 2019 autumn, 1);

INSERT INTO Grades (StudentID, CourseID, InstructorID, Grade);