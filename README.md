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

## Project Structure
java-design-patterns/
├── src/
│ ├── main/java/com/patterns/
│ │ ├── strategy/
│ │ │ └── payment/
│ │ ├── observer/
│ │ │ ├── news/
│ │ │ └── stock/
│ │ ├── singleton/
│ │ └── examples/
│ └── test/java/com/patterns/
│ ├── strategy/
│ ├── observer/
│ └── singleton/
└── pom.xml


## Requirements
- Java 11 or higher
- Maven 3.6 or higher
- IntelliJ IDEA (recommended)

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
mvn exec:java -Dexec.mainClass="com.patterns.examples.StrategyPatternExample"

# Observer Pattern
mvn exec:java -Dexec.mainClass="com.patterns.examples.ObserverPatternExample"

# Singleton Pattern
mvn exec:java -Dexec.mainClass="com.patterns.examples.SingletonPatternExample"

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
