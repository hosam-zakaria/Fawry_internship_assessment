# Smart Traffic Radar System 🚦

A simple Java Object-Oriented Programming (OOP) project that simulates a traffic radar system. The system observes passing vehicles, applies traffic rules, detects violations, and generates traffic fines.

## Features

- Detects speeding violations.
- Detects seatbelt violations.
- Supports adding new traffic rules without modifying the existing system.
- Generates fines for violating vehicles.
- Calculates the total fine amount for each vehicle.
- Displays all detected violations.
- Counts the occurrence of each violation type.

## Project Structure

```
ScrRadar/
│── Main.java
│── RadarSystem.java
│── Observation.java
│── Fine.java
│── Rule.java
│── SpeedRule.java
│── SeatbeltRule.java
└── Violation.java
```

## Class Overview

| Class | Responsibility |
|-------|----------------|
| `Main` | Demonstrates the system. |
| `RadarSystem` | Stores rules, processes observations, and generates fines. |
| `Observation` | Represents a detected vehicle. |
| `Rule` | Interface for all traffic rules. |
| `SpeedRule` | Checks if the speed exceeds the allowed limit. |
| `SeatbeltRule` | Checks whether the driver is wearing a seatbelt. |
| `Violation` | Represents a traffic violation and its fine amount. |
| `Fine` | Stores all violations for a vehicle and calculates the total fine. |

## Implemented Rules

### Speed Rule

- Private Cars → Maximum speed: **80 km/h**
- Trucks → Maximum speed: **60 km/h**

Fine:
- **300 EGP**

### Seatbelt Rule

If the driver is not wearing a seatbelt:

Fine:
- **100 EGP**

## Example

Input Observation

```java
Observation car1 = new Observation(
    "ABC1234",
    "23/7/2026",
    "PRIVATE",
    94,
    "not"
);
```

Output

```
Traffic fine for car ABC1234
Total amount: 400 EGP
Violations:
- Seatbelt not fastned  : 100 EGP
- speed of 94 exceeded max allowed 80 : 300 EGP
```

## OOP Concepts Used

- Encapsulation
- Abstraction
- Interfaces
- Polymorphism
- Composition
- Open/Closed Principle (New rules can be added by implementing the `Rule` interface.)
  
## How to Run

1. Clone the repository

```bash
git clone https://github.com/hosam-zakaria/Fawry_internship_assessment
```

2. Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, VS Code).

3. Compile and run:

```bash
 javac ScrRadar/*.java
 java ScrRadar.Main   
```

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Java Collections (ArrayList, HashMap)
