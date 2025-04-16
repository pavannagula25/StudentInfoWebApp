<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
<style>
    body {
        font-family: sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        margin: 0;
    }

    #container {
        background-color: #fff;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    form {
        display: flex;
        flex-direction: column;
        width: 300px;
        margin-bottom: 20px;
    }

    label {
        font-size: 1.1rem;
        margin-bottom: 8px;
        color: #333;
        text-align: left;
    }

    #input {
        padding: 12px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        font-size: 1rem;
    }

    #btn {
        background-color: #007bff; /* A more standard primary color */
        color: white;
        padding: 14px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 1.1rem;
        transition: background-color 0.3s ease;
    }

    #btn:hover {
        background-color: #0056b3;
    }

    .result-container {
        margin-top: 20px;
        padding: 15px;
        background-color: #e9ecef;
        border-radius: 4px;
        color: #383d41;
        font-size: 1.1rem;
    }
</style>
</head>
<body>
    <div id="container">
        <h1>Find Student</h1>
        <form action="Servlet" method="post"> <label for="id">Enter Student ID:</label>
            <input type="text" name="id" placeholder="Student ID" id="input" required>
            <button type="submit" id="btn">Find Student</button>
        </form>

        <%
          if(request.getAttribute("name") != null){
        %>
            <div class="result-container">
                Student Name: <%= request.getAttribute("name").toString() %>
            </div>
        <%
          }
        %>
    </div>
</body>
</html>