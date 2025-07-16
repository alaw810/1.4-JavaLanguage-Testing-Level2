# Java Testing Exercises – Level 2

## 📄 Description

This project includes a collection of unit tests for different small Java components using the AssertJ assertion
library. The purpose is to become familiar with fluent assertions and practice good testing practices such as writing
readable, maintainable, and expressive tests.

Each exercise demonstrates a specific concept, such as comparing values and references, testing collections, working
with maps, handling exceptions, and working with Optionals.

---

### ✅ Exercises Included

- **Exercise 1**: Assert that two integer values are equal, and another that they are not.
- **Exercise 2**: Assert that two object references are the same, and another that they are not.
- **Exercise 3**: Assert that two integer arrays are identical.
- **Exercise 4**: Create an ArrayList with various custom objects and assert:
    - the insertion order
    - the presence of elements regardless of order
    - that a specific object appears only once
    - that an absent object is not contained in the list
- **Exercise 5**: Create a map and assert it contains a specific key.
- **Exercise 6**: Trigger an ArrayIndexOutOfBoundsException and assert it is thrown.
- **Exercise 7**: Create an empty Optional and assert it is indeed empty.

---

## 💻 Technologies Used

- Java 21
- Maven
- JUnit 5
- AssertJ

---

## 📋 Requirements

- Java 17 or higher (Java 21 recommended)
- Maven installed and available in your system's PATH
- An IDE like IntelliJ IDEA (optional but recommended)

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/alaw810/1.4-JavaLanguage-Testing-Level2.git
   ```

2. Navigate to the project directory:
   ```bash
   cd 1.4-JavaLanguage-Testing-Level2
   ```

3. (Optional) Open the project with IntelliJ IDEA or your preferred IDE.

---

## ▶️ Execution

To run the tests from the terminal:

```bash
mvn test
```

Alternatively, you can run the tests from your IDE using the built-in test runner.

---

## 🌐 Deployment

This project is intended for local execution and educational purposes. Deployment is not required.

---

## 🤝 Contributions
This is a learning exercise intended for individual academic practice.
However, pull requests with enhancements or improvements are welcome!

1. Fork the repo

2. Create a new branch (`git checkout -b feature/your-feature`)

3. Commit and push your changes

4. Open a Pull Request