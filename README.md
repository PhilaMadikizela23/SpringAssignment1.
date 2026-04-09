# SpringAssignment1
### PART A: INTRODUCTION TO JAVA FRAMEWORKS – SPRING BOOT PROJECT

* We created a GitHub account and then created a new remote repository called **SpringAssignment1** to host our Spring Boot project online.

* We created a Spring Boot application using our IDE to expose an HTTP endpoint that can be accessed through a web browser.

* We created a controller class and mapped a method to an HTTP endpoint so that when a user opens **localhost:8080** in the browser, the system returns course information from the Computer Science Department.

* We displayed the following course data:

  * 2 Foundation courses offered in the Computer Science Department
  * 5 Undergraduate courses offered in the Computer Science Department
  * 4 Honours courses offered in the Computer Science Department

* We initialized the project folder as a Git repository to enable version control and track changes in the project.

* We added all the project files to the staging area using Git.

* We committed the staged files to save the current version of the project.

* We copied the remote repository URL from GitHub.

* We added the remote repository URL to connect the local project to GitHub.

* We pushed the local project to GitHub so that it can be accessed and reviewed online.

### Summary

* We created a Spring Boot application.
* We exposed an HTTP endpoint to display course data in a browser.
* We used Git for version control.
* We uploaded the project to GitHub successfully.

This part helped us understand how to build a basic Spring Boot application, expose HTTP endpoints, and manage project versions using GitHub.

### PART B: INTRODUCTION TO JAVA FRAMEWORKS – SPRING BOOT PROJECT

Building on the foundation laid in Part A:

* We extended our Spring Boot application to include **CRUD operations** (Create, Read, Update, Delete) for course information.
* We added additional HTTP endpoints and methods to allow users to create new courses, view existing courses, update course details, and delete courses from the system.
* We created methods such as **addCourse**, **getCourses**, **updateCourse**, and **deleteCourse** to handle these operations.
* We tested the endpoints using a web browser or tools like Postman to ensure that all CRUD operations work correctly.

### CRUD Functionality Implemented

* Create: We added an endpoint to allow users to add new course information.
* Read: We created an endpoint to display all available courses.
* Update: We added an endpoint to modify existing course details.
* Delete: We created an endpoint to remove a course from the system.

### Validation

* We implemented **input validation** to ensure that users enter correct and complete course information.
* We used Spring Validation (Bean Validation annotations) to validate fields such as course name, course code, and course category.
* We applied annotations like **@NotNull**, **@NotBlank**, and **@Size** to prevent invalid or empty data from being stored in the system.
* This helps maintain data integrity and prevents errors in the application.

### Collaboration and Research

* We conducted prior research on Spring Boot CRUD operations and validation to successfully implement the required features.
* We ensured that all group members and the lecturer have access to the GitHub repository for collaboration and assessment.

### Summary

* We extended the Spring Boot application from Part A.
* We implemented CRUD operations for course management.
* We added HTTP endpoints for create, read, update, and delete operations.
* We implemented validation to ensure correct input data.
* We shared the GitHub repository for collaboration and evaluation.

This part helped us understand how to build a more advanced Spring Boot application with CRUD functionality and input validation while working collaboratively using GitHub.

