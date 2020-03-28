# The Code

## The Code Itself

The Java program has been made in such a way that the program asks the user what they want to know. The user is then able input a certain value that the program asked for.

Due to time constraints, we’ve opted not to make a class for SQLite interactions, but under other circumstances we would have done so. Furthermore, even though we opted for a mostly monolithic structure, it’s still scalable in terms of students can easily be assigned more courses in the database, and the code would still without fault trivers through all ungraded courses.

We’ve made use of enums to differentiate StudentID and CourseID. This way the user may decide what information from the database they want to see. We also have a while loop to check for rows and if it finds a student in course that hasn’t been graded yet (if it finds null in the database) it asks the user if they want to input a new value for the grade. Lastly we’ve made a method to calculate the average for both the course and individual students using the SQL `AVG` function.
