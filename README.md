# **Banking System Application**

## **Overview**
The **Banking System Application** is a multi-threaded Java-based project designed to simulate real-world banking transactions, such as deposits, withdrawals, and balance inquiries. It ensures **thread safety** using Java concurrency mechanisms, making it an ideal **resume project** to demonstrate expertise in **Java, multithreading, and Maven-based project structuring**.

## **Features**
- ✅ Multi-threaded banking transactions
- ✅ Thread safety using `ReentrantLock`
- ✅ Concurrent deposits and withdrawals
- ✅ Logging of transactions in the console
- ✅ Modular and scalable Maven-based project structure

## **Technologies Used**
- **Programming Language**: Java 17+
- **Development Tools**: IntelliJ IDEA, Maven, GitHub
- **Concurrency Mechanisms**: Java `ReentrantLock`
- **Logging**: Console-based output

## **Project Structure**
```
BankingSystemApplication/
│── src/
│   ├── main/java/com/bank
│   │   ├── models/        # Holds POJO classes like Account.java
│   │   ├── services/      # Contains service classes handling transactions
│   │   ├── threads/       # Holds thread classes for multithreading
│   │   ├── main/          # The main entry point for the application
│   ├── test/              # Unit tests using JUnit
│── pom.xml                # Maven dependencies
│── README.md              # Project documentation
```

## **Installation & Setup**
### **1. Clone the Repository**
```sh
 git clone https://github.com/yourusername/BankingSystemApplication.git
 cd BankingSystemApplication
```

### **2. Build the Project Using Maven**
```sh
mvn clean install
```

### **3. Run the Application**
```sh
mvn exec:java -Dexec.mainClass="com.bank.services.BankService"
```

## **Usage**
The application simulates banking transactions with concurrent execution. It executes multiple deposit and withdrawal operations on an account while ensuring thread safety.

## **Future Enhancements**
- 🛠️ Implementing **database storage** for accounts
- 🖥️ Adding **Graphical User Interface (GUI)**
- 🌐 Introducing **REST API support**

## **Contributing**
If you would like to contribute, feel free to fork the repository, create a feature branch, and submit a pull request.

## **License**
This project is licensed under the **MIT License** – feel free to modify and use it as needed.

## **Contact**
For any questions or collaborations, reach out via:
📧 Email: siddhartha.alwala@gmail.com

---
### **Happy Coding! 🚀**

