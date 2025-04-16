# StudentInfoWebApp
## Overview

This is a simple Java web application that allows users to retrieve student information by entering their unique ID (often referred to as a roll number). It demonstrates a basic implementation of a web application using Java Servlets for handling requests, JavaServer Pages (JSP) for the user interface, and Java Database Connectivity (JDBC) for interacting with a database. This project serves as a learning exercise to understand the fundamental concepts of Java web development.

## Technologies Used

* **Java:** The core programming language.
* **Servlets:** Java classes to handle client requests and responses.
* **JavaServer Pages (JSP):** Used for creating dynamic web pages.
* **JDBC:** Java API for connecting to and interacting with databases.
* **HTML:** For structuring the web page.
* **CSS:** For basic styling of the user interface.
* **MySQL:** The relational database used to store student information.
* **Apache Tomcat:** The server environment in which the web application runs.

## Prerequisites

Before you can run this application, you need to have the following installed and configured:

* **Java Development Kit (JDK):** Ensure you have a compatible JDK installed on your system.
* **Servlet Container (e.g., Apache Tomcat):** Download and install a Servlet container to deploy and run the web application.
* **MySQL Database:**
    * Install MySQL Server.
    * Create a database named `students`.
    * Create a table named `students` with at least two columns: `id` (INT, primary key) and `name` (VARCHAR).
    * Populate the `students` table with some sample data for testing.
* **JDBC Driver for MySQL:** Ensure the MySQL Connector/J JDBC driver is available to your Servlet container (usually by placing the `.jar` file in the container's `lib` directory or your project's `WEB-INF/lib` directory).

## Setup and Installation

1.  **Clone the Repository (if you haven't already):**
    ```bash
    git clone [https://github.com/pavannagula25/StudentInfoWebApp.git](https://github.com/pavannagula25/StudentInfoWebApp.git)
    cd StudentInfoWebApp
    ```

2.  **Build the Web Application (if necessary):** If you are using a build tool like Maven or Gradle, run the appropriate command (e.g., `mvn clean package` or `gradle build`). If not, ensure your project is structured correctly for deployment.

3.  **Deploy to Servlet Container:**
    * Locate the web application archive (`.war`) file if you built one, or copy the web application directory (containing `index.jsp`, `WEB-INF`, etc.) to the deployment directory of your Servlet container (e.g., `webapps` directory in Apache Tomcat).

4.  **Configure Database Connection:** The application is currently configured to connect to a MySQL database with the following credentials (these are hardcoded in `StudentDao.java`):
    * **URL:** `jdbc:mysql://localhost:3306/students`
    * **Username:** `root`
    * **Password:** `1234`
    **Note:** For a production application, it's highly recommended to externalize these configurations (e.g., using environment variables or a configuration file).

## How to Use

1.  **Start your Servlet Container (e.g., Apache Tomcat).**
2.  **Access the application in your web browser:** Open your browser and navigate to the application's context path (usually `http://localhost:8080/StudentInfoWebApp/` if
