# Java Streams Coding Questions Repository

This repository contains **must-know Java Stream API coding questions** with clean examples and explanations. It is designed for:

* Java interview preparation
* Learning functional programming with Streams
* Practicing real-world data processing patterns

---

## 📌 Repository Structure

```
java-streams-coding-questions/
│
├── src/main/java/
│   ├── strings/
│   ├── lists/
│   ├── maps/
│   ├── objects/
│   └── advanced/
│
├── README.md
└── pom.xml / build.gradle (optional)
```

Each package contains:

* Problem description
* Stream-based solution
* Alternative approaches (if useful)
* Time & space complexity notes

---

# ✅ Must-Know Java Streams Coding Questions

## 1. Count Character Occurrences in a String

**Goal:** Count how many times each character appears.

**Key Concepts:** `chars()`, `Collectors.groupingBy()`, `Collectors.counting()`

**Use Case:** Frequency analysis, text processing.

---

## 2. Find the First Non-Repeated Character in a String

**Goal:** Identify the first character that appears only once.

**Key Concepts:** `LinkedHashMap`, `filter`, `findFirst()`

**Use Case:** Interview classics, string parsing.

---

## 3. Identify Duplicate Elements in a List

**Goal:** Find elements that appear more than once.

**Key Concepts:** `groupingBy`, `counting`, `filter`.

**Use Case:** Data cleaning and validation.

---

## 4. Find Maximum and Minimum Values Using Streams

**Goal:** Get max and min values from a collection.

**Key Concepts:** `max()`, `min()`, `Comparator`.

---

## 5. Sort a List of Objects Based on a Specific Field

**Goal:** Sort objects by fields like name, age, salary.

**Key Concepts:** `Comparator.comparing()`, `sorted()`.

**Use Case:** Business data ordering.

---

## 6. Convert a List into a Map

**Goal:** Convert objects into a key-value structure.

**Key Concepts:** `Collectors.toMap()`.

**Use Case:** Fast lookups.

---

## 7. Calculate Sum and Average of Numbers

**Goal:** Compute aggregate statistics.

**Key Concepts:** `mapToInt`, `sum`, `average`, `Collectors.summarizingInt()`.

---

## 8. Find Frequency of Each Element in a List

**Goal:** Count occurrences of list elements.

**Key Concepts:** `groupingBy`, `counting()`.

---

## 9. Remove Duplicates from a List Using Streams

**Goal:** Return unique elements.

**Key Concepts:** `distinct()`.

---

## 10. Reverse a String Using Stream Operations

**Goal:** Reverse characters using Streams.

**Key Concepts:** `collect`, `StringBuilder`, `reduce()`.

---

## 11. Find the Second Highest Number in a List

**Goal:** Find the second largest value.

**Key Concepts:** `sorted()`, `distinct()`, `skip()`.

---

## 12. Check if Two Strings Are Anagrams Using Streams

**Goal:** Determine if two strings contain the same characters.

**Key Concepts:** `sorted()`, `Arrays.equals()`.

---

## 13. Group Objects by a Specific Field (e.g., Department)

**Goal:** Group employees by department.

**Key Concepts:** `Collectors.groupingBy()`.

**Use Case:** Reporting and analytics.

---

## 14. Partition a List into Even and Odd Numbers

**Goal:** Split numbers into two groups.

**Key Concepts:** `Collectors.partitioningBy()`.

---

## 15. Find the Longest String in a List

**Goal:** Identify the longest text.

**Key Concepts:** `max(Comparator.comparingInt(String::length))`.

---

## 16. Check if All Elements Match a Condition

**Goal:** Validate all elements.

**Key Concepts:** `allMatch()`.

---

## 17. Find Any / First Element from a Stream

**Goal:** Retrieve first or any element.

**Key Concepts:** `findFirst()`, `findAny()`.

---

## 18. Convert a Stream Back to List or Set

**Goal:** Collect stream results.

**Key Concepts:** `Collectors.toList()`, `Collectors.toSet()`.

---

## 19. Join a List of Strings Using a Delimiter

**Goal:** Create a single string from list values.

**Key Concepts:** `Collectors.joining()`.

---

## 20. Flatten a List of Lists Using flatMap

**Goal:** Convert nested lists into a single list.

**Key Concepts:** `flatMap()`.

---

# 🎯 Why Learn These Problems?

These questions cover:

* Functional programming mindset
* Data transformation pipelines
* Interview-level problem solving
* Real-world enterprise Java coding patterns

Mastering these will make you **highly confident in Java Streams for interviews and production code**.

---

# 🚀 How to Use This Repository

1. Clone the repo
2. Open in IntelliJ / Eclipse
3. Run each class in the `src` folder
4. Modify inputs to practice

---

# 📚 Recommended Learning Path

1. Learn lambda expressions
2. Understand functional interfaces (Predicate, Function, Consumer)
3. Practice these coding questions
4. Solve LeetCode / HackerRank Stream problems

---

# 🤝 Contributing

Feel free to:

* Add more Stream problems
* Improve solutions
* Add unit tests

Pull requests are welcome!

---

# ⭐ If You Found This Useful

Give this repository a star and share it with Java learners.

---

Happy Coding! ☕

---

## 📖 Reference & Attribution

The list of Java Stream interview questions is inspired by a LinkedIn post by **Prabhudas Narega**.  
All credit for the original question list goes to the author.

**Reference:**
- Prabhudas Narega, *Must-know Java Streams Coding Questions*  
  👉 [View the LinkedIn Post](https://www.linkedin.com/feed/update/urn:li:activity:7424353453465870337/)

Full credit for the original question list goes to **Prabhudas Narega**. This repository expands on those questions with explanations, examples, and structured code solutions.
