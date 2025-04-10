# Exercise 5 – Logging with Log4j2

## Why are logging libraries used?

- They allow us to create structured logs about program execution.
- Logging helps to identify errors and monitor the application’s behavior.
- Logs can be written to different outputs (e.g., files, console).
- Log levels help filter relevant messages depending on the environment (e.g., development, production).
- Log4j is one of the most widely used logging frameworks in the Java ecosystem.

---

## What log levels are available in Log4J and what do they mean?

Log levels help categorize the severity and intent of log messages. Below is a description of each level along with a code example:

---

### TRACE  

Very detailed debugging information, often used for tracing the exact flow of execution.  
**Example:**

```java
logger.trace("Entered calculate() with values x=5, y=2");
```

---

### DEBUG  

Used during development to understand what's happening in the code.  
**Example:**

```java

logger.debug("Calculated sum: 7");
```

---

### INFO  

Provides general application status updates, such as completed actions.  
**Example:**

```java
logger.info("User logged in successfully");
```

---

### WARN

Indicates that something unexpected happened, but the application can continue running.  
**Example:**

```java
logger.warn("Config file not found, using defaults");
```

---

### ERROR  

A significant problem occurred that affects program functionality.  
**Example:**

```java
logger.error("Failed to save file");
```

---

### FATAL

A severe error that will likely lead to application shutdown.  
**Example:**

```java
logger.fatal("Out of memory, shutting down system");
```

---

## What configuration options does Log4j provide?

- Configuration is typically done via a `log4j2.xml` file.
- You can define:
  - **Log levels** per class or package
  - **Appenders** to specify where logs are written (e.g., console, file, rolling file)
  - **Layouts** to format log entries (e.g., timestamp, message, log level)
- Supports log rotation based on file size or time
- Log4j can also be configured using other formats:
  - `.json`
  - `.yaml`
  - `.properties`
- In this project:
  - The `log4j2.xml` file is excluded from version control
  - A `log4j2.xml.template` file is provided for others to configure their own settings
