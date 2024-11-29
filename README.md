# Java Design Patterns Examples

A practical guide to Java Design Patterns with real-world examples. This repository contains implementations of common design patterns used in Java applications.

## Design Patterns Included

### Strategy Pattern
Implementation of a payment processing system demonstrating:
- Runtime algorithm selection
- Payment method switching
- Credit card and PayPal implementations

### Observer Pattern
Two practical implementations:
- Stock Market: Real-time price updates with thread-safe observers
- News Agency: Simple publisher-subscriber model

### Singleton Pattern
Three different implementations showing:
- Thread-safe configuration management
- Database connection pooling
- Enum-based singleton

### Builder Pattern
- **Description**: Facilitates the construction of complex objects step-by-step.
- **Example**: Constructs configuration objects with numerous optional parameters.
- **Usage**: Ideal for constructing objects with many parameters or configurations.

## Project Structure
```bash
java-design-patterns/
├── src/
│ ├── main/java/com/patterns/
│ │ ├── strategy/
│ │ │ └── payment/
│ │ ├── observer/
│ │ │ ├── news/
│ │ │ └── stock/
│ │ ├── singleton/
│ │ ├── builder/
│ │ └── examples/
│ └── test/java/com/patterns/
│ ├── strategy/
│ ├── observer/
│ ├── singleton/
│ └── builder/
└── pom.xml
```


## Requirements
- Java 17 or higher
- Maven 3.6 or higher
- IntelliJ IDEA Community Edition (recommended)

## Setup Instructions

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/java-design-patterns.git
    ```

2. Open in IntelliJ IDEA:
    - File -> Open -> Select project directory
    - Mark `src` directory as Sources Root
    - Ensure project structure shows packages correctly

3. Build the project:
    ```bash
    mvn clean install
    ```

## Running Examples

Each pattern has its own example class in the `com.patterns.examples` package:

```bash
# Strategy Pattern
mvn exec:java@run-strategy-example

# Observer Pattern
mvn exec:java@run-observer-example

# Singleton Pattern
mvn exec:java@run-singleton-example

# Builder Pattern Example
mvn exec:java@run-builder-example

```
### Testing
Run all tests:
```bash
mvn test
```

### Contributing
Feel free to submit issues and enhancement requests.

### License
This project is licensed under the MIT License - see the LICENSE file for details.
