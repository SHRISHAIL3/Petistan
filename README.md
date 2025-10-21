🐾 Petistan – Pet Management System

Petistan is a Spring Boot–based Pet Management System designed to demonstrate how enterprise-level backend applications are built using Java, Spring Boot, AOP, Dependency Injection, and DTOs.
It provides a structured and modular approach to managing pets and their owners, following real-world software engineering principles.

🚀 Project Overview

Purpose: Manage pets and their owners efficiently.

Goal: Demonstrate professional backend architecture and design principles.

Audience: Ideal for students, Java developers, and interview preparation.

Petistan follows a multi-layered architecture (Presentation, Service, and Data Access) ensuring separation of concerns, independent testing, and easy scalability.

🧩 Key Features

Spring Boot Architecture: Modular design with Presentation, Service, and Repository layers.

Dependency Injection (DI): Constructor-based injection for immutability and testability.

AOP Logging: Centralized method-level logging using Aspect-Oriented Programming.

DTO Pattern: Clean data transfer between layers without exposing entities.

Custom Exception Handling: Meaningful and maintainable error handling.

Configuration Management: YAML-based configuration aligned with 12-factor app principles.

Data Initialization: Automatic demo data loading using @PostConstruct.

Unit Testing: Tested with JUnit 5 and Mockito, following FIRST principles.

🧠 Design Patterns Used

Repository Pattern – Abstracts data access.

Factory Pattern – Creates pet types dynamically.

Strategy Pattern – Handles different behaviors for pet categories.

DTO Pattern – Safely transfers data between layers.

⚙️ Tech Stack

Language: Java 17+

Framework: Spring Boot

Testing: JUnit 5, Mockito

Configuration: YAML

Build Tool: Maven

IDE: IntelliJ IDEA / Eclipse

🧪 Spring Concepts Demonstrated

Inversion of Control (IoC) and Bean Lifecycle

Constructor-based Dependency Injection

Component Scanning and Bean Configuration

AOP with Before, After, and AfterThrowing Advice

Profile-based Configuration

Exception Handling with Custom Exceptions
