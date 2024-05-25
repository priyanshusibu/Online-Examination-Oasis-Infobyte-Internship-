<H2>TASK-4 Online Examination System</H2>
 
<h3>Project Description</h3>
 • This project is an Online Examination System that enables students to appear for exams and store their results in a database.<br>
 • The application has been developed using Java Swing for the user interface and integrates with a MySQL database using JDBC.<br>
<h3>Key Features</h3><br>
Student Login:<br>
 • Each student is provided with a unique user ID and password by the admin.<br>
 • Students can log in to the system using their credentials.<br>
Password Management:<br>
• Students can update their password after logging in.<br>
Exam Participation:<br>
• Students can appear for exams set by the admin.<br>
• The exam form includes an auto-submission feature.<br>
Admin Functionalities:<br>
• Admin can store and manage all information about students.<br>
• Admin is responsible for setting up question papers for the <br>
• Admin can view and manage the results of the students.<br>
<h3>Technologies Used</h3><br>
• Java Swing: Used for building the graphical user interface.<br>
• JDBC: Java Database Connectivity is used for connecting and interacting with the MySQL database.<br>
• MySQL: The relational database management system used to store all the data related to students, exams, and results.<br>
• Apache NetBeans: Integrated Development Environment (IDE) used for developing and managing the project.<br>

 Setup and Installation Prerequisites:<br>
• JDK (Java Development Kit) installed on your system.<br>
• MySQL server installed and running.<br>
• Apache NetBeans IDE installed for running and debugging the Java application.<br>

Database Setup:<br>
• Create a database in MySQL for the project.<br>
• Use the provided SQL script (if any) to create the necessary tables and initial data.<br>

Configuration:<br>
• Update the database connection settings (URL, username, password) in the Java code to match your MySQL configuration.<br>
• Running the Application:<br>

• Open the project in Apache NetBeans.<br>
• Compile and run the main application file.<br>

Usage<br>
1. Admin Login:<br>
• Use the admin credentials to log in to the admin panel.<br>
• Add new students, set up exams, and manage student information.<br>
2. Student Login:<br>
• Students log in using the credentials provided by the admin.<br>
• After logging in, students can update their password, appear for exams, and view their results.<br>

Auto-Submission Feature<br>
• The exam form includes an auto-submission feature that ensures the exam is submitted automatically once the time limit is reached.<br>
• This helps in maintaining the integrity and fairness of the examination process.<br>

<h3>Project Structure</h3><br>
src/:  Contains all the Java source files.<br>
lib/: Contains any external libraries required for the project.<br>
resources/:  Contains any resources such as SQL scripts or configuration files.<br>
