# Grading System

Write a programme which will keep track of a students grades
You will need two classes

- Student
- Subject

below is a breakdown of what each class should do:

### Subject:

   #### attributes
   - subject name
   - list of scores (for every test that a student has sat)
   #### methods
   - constructor: sets the subject name and initialises the list of scores to an empty array of floats of length 10
   - getTestScore: takes in an integer index as a parameter and returns the score a student got for a particular exam
   - setScore - takes in a test index and a score and updates the score array with the score that a student got in a particular exam

### Student
   #### attributes
  - student name
  - list of subjects that the student does (length 3)
  #### methods
  - constructor : updates student name and initialises the list of subjects that the student studies
  - getStudentGrades: returns a string representing the students grades in the three subjects. (use the Arrays.toString() function which you looked at in codeacademy for this)
