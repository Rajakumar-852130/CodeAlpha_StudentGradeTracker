# PROJECT REPORT: Student Grade Tracker
**Organization:** CodeAlpha Internship  
**Project Number:** Task 1  
**Developer:** [Aapka Naam]  

---

## 1. Project Overview
The Student Grade Tracker is a Java-based web application designed to help educational institutions manage student academic records efficiently. It provides an automated way to track grades and generate real-time performance statistics.

## 2. Objectives
- To provide a user-friendly interface for grade entry.
- To automate the calculation of Class Average, Highest Score, and Lowest Score.
- To demonstrate the use of Java Collections (ArrayList) for data management.
- To implement a modern GUI using Spring Boot and Thymeleaf.

## 3. System Architecture & Tech Stack
The project follows a modern web architecture:
- **Programming Language:** Java 17+
- **Framework:** Spring Boot 3.x
- **Frontend:** HTML5, CSS3, JavaScript
- **Template Engine:** Thymeleaf
- **Data Structure:** Java ArrayList (for in-memory persistence)
- **Build Tool:** Apache Maven

## 4. Features Implemented
- **Dynamic Data Entry:** Users can add student names and marks via an interactive form.
- **Auto-Stats Engine:** The system automatically identifies the top performer, the lowest scorer, and calculates the overall average marks.
- **Professional Dashboard:** A sleek, dark-themed responsive UI with glassmorphism aesthetics.
- **Status Indicators:** Automatic 'Pass/Fail' badge generation based on scoring criteria.

## 5. Core Logic Explanation
The core business logic resides in the `GradeService.java` file. It utilizes Java Streams to process the `ArrayList` of students:
- **Average:** Calculated using `.mapToDouble(Student::getGrade).average()`.
- **Highest/Lowest:** Identified using `.max()` and `.min()` collectors on the grade stream.

## 6. Conclusion
The project successfully meets all requirements of the CodeAlpha internship task. It provides a robust and visually appealing solution for student grade management while demonstrating proficiency in Java Spring Boot development.

---
*Date: May 2026*  
*Submitted to: CodeAlpha Technical Team*
