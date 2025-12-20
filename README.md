# 📱 Project: OOP with Android, SQLite, and JUnit Tests

Welcome to the repository for **Aula 03 of the Android Development Course with Java**. This project is a practical and robust application designed to demonstrate key concepts of Object-Oriented Programming (OOP), data persistence using a local **SQLite** database, and the importance of automated testing with **JUnit**.

The application serves as a control panel for testing **CRUD** (Create, Read, Update, Delete) operations on three main entities: `Address`, `Supplier`, and `Product`.

---

## ✨ Key Features

The application's layout is organized into clear sections, each with a specific purpose:

### 📊 Mock Data Management
- **🔄 Populate Data:** Inserts a set of test (mock) data into the database tables, allowing for quick feature testing.
- **🗑️ Clear Data:** Deletes all records from all tables, ideal for resetting the test environment.
- **📈 Display Statistics:** Shows summary information about the current data in the database (e.g., number of products, suppliers, etc.), which is displayed in the Logcat.

### 🧪 UI-Driven CRUD Tests
This section allows you to run a full CRUD test cycle for each entity directly from the app's interface. Each button performs the following actions and logs the results to **Logcat**:
1.  **Create:** Inserts a new record.
2.  **Read:** Fetches and validates the newly inserted record.
3.  **Update:** Modifies the record and verifies the change.
4.  **Delete:** Removes the record and confirms its deletion.

- **📍 Test Address CRUD:** Executes the complete cycle for the `Address` entity.
- **🏢 Test Supplier CRUD:** Executes the complete cycle for the `Supplier` entity.
- **📦 Test Product CRUD:** Executes the complete cycle for the `Product` entity.

### 🔗 Special Tests
- **🔗 Test Relationships:** A dedicated button to verify the integrity of relationships between tables (foreign keys), ensuring that a product is correctly associated with a supplier, for instance.

### 🚀 Automated JUnit Testing
A section dedicated to showcasing the power of automated testing, allowing you to run test suites directly from the app.
- **🚀 Run All JUnit Tests:** Triggers the entire test suite.
- **🧪 Unit Tests:** Executes only tests that validate small, isolated units of code.
- **🔗 Integration Tests:** Runs tests that verify the interaction between different components (e.g., the DAO class and the database).
- **📦 Complete Suite:** Groups and runs all defined test scenarios.
- **📈 Tests with Statistics:** Runs tests focused on verifying data counts and statistics.
- **🔍 Check Test Availability:** Verifies if the test environment is correctly set up.
- **📋 Show Test Information:** Displays metadata about the available tests.

---

## 🛠️ Technologies and Concepts Applied

- **Language:** Java
- **Architecture:** Object-Oriented Programming (OOP) applied in an Android context.
- **Database:** SQLite for local data persistence.
- **Testing:**
    - Instrumentation tests with JUnit to validate business logic and database operations.
- **UI:** XML with `ConstraintLayout` and `ScrollView`.
- **Logging:** Extensive use of `Logcat` to display results and debug the application flow.

---

## 🔍 How to Use and Check Results

1.  **Clone the repository:**
    
