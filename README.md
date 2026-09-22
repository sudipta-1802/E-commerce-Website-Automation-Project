# E-commerce-Website-Automation-Project
This project is a Selenium WebDriver automation framework built using Java, TestNG, and Page Object Model (POM) design pattern. It is designed to automate and validate key functionalities of a web application such as login, product search, and cart operations in a structured and scalable way.

🎯 Features
🧪 UI Automation using Selenium WebDriver
⚙️ Test management using TestNG
🏗️ Page Object Model (POM) design pattern
🔄 Reusable and maintainable code structure
✔️ Assertions for validation of expected vs actual results
📊 Structured test execution flow
🧹 Clean separation of test logic and page actions


🛠️ Tech Stack
Java
Selenium WebDriver
TestNG
Maven (optional)
ChromeDriver

📁 Project Structure
project/
│
├── pages/        # Page classes (Locators + Actions)
│   ├── LoginPage.java
│   ├── HomePage.java
│
├── tests/        # Test classes (TestNG test cases)
│   ├── LoginTest.java
│   ├── SearchTest.java
│
├── base/         # Base setup class
│   ├── BaseTest.java
│
└── testng.xml    # Test execution suite


🚀 Test Scenarios Covered
User Login Functionality
Product Search Functionality
Add to Cart Functionality
Basic UI validations using assertions

⚙️ How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/your-username/selenium-testng-framework.git

2️⃣ Import Project
Open in IntelliJ IDEA / Eclipse
Import as Maven/Java project
3️⃣ Install Dependencies

If using Maven:
mvn clean install

4️⃣ Run Tests
Run testng.xml file
OR
Run test classes directly from IDE

🧪 Example Test Flow
Open browser
Navigate to application URL
Enter login credentials
Click login button
Validate successful login
Perform search/add to cart actions
Verify expected results

🎯 Key Concepts Used
Page Object Model (POM)
Selenium WebDriver automation
TestNG annotations (@Test, @BeforeMethod, @AfterMethod)
Assertions for validation
Reusable test framework design
