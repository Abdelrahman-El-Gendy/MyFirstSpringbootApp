# MyFirstSpringbootApp

## Overview

This is a simple Spring Boot application for managing student records. It provides RESTful APIs to perform CRUD operations on student data, including creating, reading, updating, and deleting student information.

## Features

- Create new student records  
- Retrieve all students or check for existing students by email  
- Update student information (name and email)  
- Delete student records  
- Automatic age calculation based on date of birth  
- Data persistence using JPA and H2 database (default)

## Technologies Used

- Java 17+  
- Spring Boot 3.x  
- Spring Data JPA  
- Hibernate  
- Maven (for dependency management)
  
## Project Structure

src/main/java/org/example/myfirstspringbootapp/<br>
├── MyFirstSpringbootAppApplication.java &nbsp;&nbsp;&nbsp;&nbsp;# Main application class<br>
└── student/<br>
&nbsp;&nbsp;&nbsp;&nbsp;├── Student.java &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Student entity/model<br>
&nbsp;&nbsp;&nbsp;&nbsp;├── StudentConfig.java &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Configuration for initial data<br>
&nbsp;&nbsp;&nbsp;&nbsp;├── StudentController.java &nbsp;&nbsp;# REST API endpoints<br>
&nbsp;&nbsp;&nbsp;&nbsp;├── StudentRepository.java &nbsp;&nbsp;# Data access layer<br>
&nbsp;&nbsp;&nbsp;&nbsp;└── StudentService.java &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Business logic layer

## API Endpoints

| Method | Endpoint               | Description                   |
|--------|------------------------|-------------------------------|
| GET    | `/api/v1/student`      | Get all students              |
| POST   | `/api/v1/student`      | Create a new student          |
| PUT    | `/api/v1/student/{id}` | Update a student's information |
| DELETE | `/api/v1/student/{id}` | Delete a student              |

## Request/Response Examples

### Create Student (POST `/api/v1/student`)

```json
{
    "name": "John Doe",
    "dob": "2000-01-01",
    "email": "john.doe@example.com"
}


