<H2>TASK-4 Online Examination System</H2>
 
<h3>Project Description</h3>
 • This project is an Online Examination System that enables students to appear for exams and store their results in a database. 
 • The application has been developed using Java Swing for the user interface and integrates with a MySQL database using JDBC.
<h3>Key Features</h3>
Student Login:
 • Each student is provided with a unique user ID and password by the admin.
 • Students can log in to the system using their credentials.
Password Management:
• Students can update their password after logging in.
Exam Participation:
• Students can appear for exams set by the admin.
• The exam form includes an auto-submission feature.
Admin Functionalities:
• Admin can store and manage all information about students.
• Admin is responsible for setting up question papers for the exams.
• Admin can view and manage the results of the students.
<h3>Technologies Used</h3>
• Java Swing: Used for building the graphical user interface.
• JDBC: Java Database Connectivity is used for connecting and interacting with the MySQL database.
• MySQL: The relational database management system used to store all the data related to students, exams, and results.
• Apache NetBeans: Integrated Development Environment (IDE) used for developing and managing the project.
Setup and Installation

Prerequisites:
• JDK (Java Development Kit) installed on your system.
• MySQL server installed and running.
• Apache NetBeans IDE installed for running and debugging the Java application.

Database Setup:
• Create a database in MySQL for the project.
• Use the provided SQL script (if any) to create the necessary tables and initial data.

Configuration:
• Update the database connection settings (URL, username, password) in the Java code to match your MySQL configuration.
• Running the Application:

• Open the project in Apache NetBeans.
• Compile and run the main application file.

Usage
Admin Login:
• Use the admin credentials to log in to the admin panel.
• Add new students, set up exams, and manage student information.
Student Login:
• Students log in using the credentials provided by the admin.
• After logging in, students can update their password, appear for exams, and view their results.
• Auto-Submission Feature
The exam form includes an auto-submission feature that ensures the exam is submitted automatically once the time limit is reached. 
This helps in maintaining the integrity and fairness of the examination process.

<h3>Project Structure</h3>
src/:  Contains all the Java source files.
lib/: Contains any external libraries required for the project.
resources/:  Contains any resources such as SQL scripts or configuration files.
