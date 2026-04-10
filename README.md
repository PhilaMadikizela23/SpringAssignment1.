# SpringAssignment1 - CSC313 Assignment 1

University of Fort Hare  
CSC313 – Object-Oriented Programming  
Assignment 1: Spring Boot Project with CRUD and Validation  
Submission Date: 10 April 2026  

Repository: https://github.com/SpringAssignment/SpringAssignment1  
(Replace YOUR-USERNAME with your actual GitHub username)

## Group Members
- Phila Madikizela - 202310277 
- Member 2 Full Name - Student Number  
- Member 3 Full Name - Student Number  
- Member 4 Full Name - Student Number  

(Please replace the lines above with your real names and student numbers)

## What is in this Repository
This is a complete Spring Boot web application for the MAT (Mathematics) Department.  
It fully meets all requirements for Part A and Part B of the assignment.

- Part A: Basic Spring Boot API + GitHub setup (50 marks)  
- Part B: Full CRUD operations + Validation (50 marks)

The application has a nice web dashboard where you can view courses and do Create, Read, Update and Delete operations easily.

## How to Run the Application
1. Open the project in IntelliJ IDEA  
2. Run the file SpringAssignment1Application.java  
3. Wait until you see the message "Started SpringAssignment1Application" in the console  
4. Open your web browser and go to:  
   http://localhost:8080

This is the main CRUD website (Dashboard).  
You can also test:  
- http://localhost:8080/api/courses/test  
- http://localhost:8080/h2-console (to see the database)

## What We Built (Part A)
- Created a Spring Boot application  
- Made HTTP endpoints that return exactly:  
  - 2 Foundation courses  
  - 5 Undergraduate courses  
  - 4 Honours courses (all MAT codes)  
- Used Git and GitHub for version control  
- Added all group members and lecturer to the repository  
- Pushed everything to GitHub

## What We Built (Part B)
- Full CRUD operations:  
  - Create: Add new courses  
  - Read: View all courses  
  - Update: Edit courses (including changing the course code)  
  - Delete: Remove courses  
- Input validation using @NotBlank  
- Persistent database (H2) so data is not lost when you restart the app  
- Clean and simple GUI dashboard for easy use

## Easy and Hard Parts of the Assignment
Easy parts:  
- Setting up Spring Boot and GitHub  
- Creating the basic controller and endpoints  
- Adding initial courses  

Hard parts:  
- Making full CRUD work properly  
- Updating the course code (because it is the primary key)  
- Connecting everything to a real database  
- Making the GUI connect smoothly with the backend  

## CRUD Attempts We Made
- First attempt: Used ArrayList (data disappeared when restarting the app)  
- Second attempt: Added database with JPA and H2  
- Third attempt: Fixed the update function so course code can be changed  
- Final version: Everything works perfectly with database and nice GUI

## Summary
This project has everything the assignment asked for:  
- Spring Boot application  
- Correct number of courses  
- Full working CRUD  
- Validation  
- GitHub with all members and lecturer having access  
- Easy-to-use web dashboard at http://localhost:8080

Thank you for checking our work.  
You can test the full application by running it and opening http://localhost:8080.

Last updated: 10 April 2026
