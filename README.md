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
* **Apache Tomcat:** Download and install Apache Tomcat (or another compatible Servlet container) to deploy and run the web application.
* **MySQL Database:**
    * Install MySQL Server.
    * Create a database named `students`.
    * Create a table named `students` with at least two columns: `id` (INT, primary key) and `name` (VARCHAR).
    * Populate the `students` table with some sample data for testing.
* **MySQL Connector/J JDBC Driver:** Download the MySQL Connector/J JDBC driver (`.jar` file). This driver needs to be accessible to your Tomcat server, usually by placing it in the `lib` directory of your Tomcat installation.

## Setup and Installation

1.  **Clone the Repository (if you haven't already):**
    ```bash
    git clone [https://github.com/pavannagula25/StudentInfoWebApp.git](https://github.com/pavannagula25/StudentInfoWebApp.git)
    cd StudentInfoWebApp
    ```

2.  **Ensure Project Structure for Deployment:** Make sure your project is structured in a way that Tomcat can recognize it as a web application (e.g., having a `WEB-INF` directory containing your `web.xml` if you have one, or relying on annotations).

3.  **Deploy to Tomcat:** Copy the web application directory (containing `index.jsp`, `WEB-INF`, etc.) to the `webapps` directory of your Apache Tomcat installation. If you package your application as a WAR file (e.g., `StudentInfoWebApp.war`), copy that file to the `webapps` directory.

4.  **Configure Database Connection:** The application is currently configured to connect to a MySQL database with the following credentials (these are hardcoded in `StudentDao.java`):
    * **URL:** `jdbc:mysql://localhost:3306/students`
    * **Username:** `root`
    * **Password:** `1234`
    **Note:** For a production application, it's highly recommended to externalize these configurations (e.g., using environment variables or a configuration file).

## How to Use

1.  **Start your Apache Tomcat server.**
2.  **Access the application in your web browser:** Open your browser and navigate to the application's context path. If you deployed the application directory directly, it might be `http://localhost:8080/StudentInfoWebApp/`. If you deployed a WAR file named `StudentInfoWebApp.war`, the context path is usually `http://localhost:8080/StudentInfoWebApp/`.
3.  **Enter Student ID:** On the `index.jsp` page, you will see a form with a field labeled "Enter Id". Enter the ID of a student you want to look up.
4.  **Click "Find Student":** Click the "Find Student" button.
5.  **View Results:** If a student with the entered ID exists in the database, their name will be displayed below the form. If no student is found, "Student Name : Not Found" will be shown.

## Potential Future Enhancements

* Implement more robust error handling and user feedback.
* Add the ability to display more student details (e.g., roll number, department).
* Implement input validation to prevent non-numeric input for the ID.
* Improve the styling and user interface.
* Explore using a more sophisticated data access layer (e.g., JPA/Hibernate).
* Implement security measures.
* Externalize database configurations.

## Author

* [pavannagula25](https://github.com/pavannagula25)

---

**To update your README on GitHub:**

1.  Go to your repository: `https://github.com/pavannagula25/StudentInfoWebApp`
2.  Click on the `README.md` file.
3.  Click the **pencil icon** (Edit this file) in the top right corner of the file content.
4.  **Replace the existing content** with the updated template above.
5.  Scroll down to the "Commit changes" section.
6.  Add a commit message (e.g., "Updated README with more details and instructions").
7.  Click the green **"Commit changes"** button.

Your README file on GitHub will now be updated with these changes. Let me know if you have any other questions!
