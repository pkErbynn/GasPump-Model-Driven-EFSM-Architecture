# Gas Pump System Architecture Design and Implementation

## Goal:
The goal of this project is to design and implement two different gas pump components (GP-1 and GP-2) using the Model-Driven Architecture (MDA) framework. The core design is built upon an Extended Finite State Machine (EFSM) model and Object-Oriented (OO) design patterns to capture the behavior of both gas pump components in a generalized, decoupled structure.


The project is divided into two phases:
1.	MDA-EFSM Design – Designing the behavior of GP components using a unified Extended Finite State Machine (EFSM) model.
   - to capture the generalized behavior of both gas pump components, separating system behavior from implementation specifics, allowing scalability and flexibility.
2.	Design & Implementation – Applying OO design principles to implement the GP components based on the EFSM model using design patterns.
    -  to ensure modularity, flexibility, and scalability using 
      - State Pattern – Manages the gas pump’s state transitions (e.g., Idle, Active, Pumping, Stopped).
      - Strategy Pattern – Encapsulates various fuel types and payment methods, allowing interchangeable strategies.
      - Abstract Factory Pattern – Creates families of related objects (GP-1 and GP-2 components) without specifying concrete classes.

## Project Components

### Gas Pump 1 (GP-1)

GP-1 gas pump supports both cash and credit card payments.

![class_diagram](./Project%20Description/gp1.png)

Supported Operations:
- 	Activate(int a): Activates GP-1 with a gas price per liter.
-	Start(): Starts the transaction.
-	PayCredit(): Initiates credit card payment.
-	Reject(): Handles rejected credit cards.
-	Cancel(): Cancels the transaction.
-	Approved(): Approves credit card payment.
-	PayCash(int c): Accepts prepaid cash.
-	StartPump(): Starts dispensing fuel.
-	Pump(): Dispenses 1 liter of fuel.
-	StopPump(): Stops fuel dispensing.

### Gas Pump 2 (GP-2)
GP-2 offers more advanced features, supporting Regular, Premium, and Diesel fuel types and only cash payments.

![class_diagram](./Project%20Description/gp2.png)

Supported Operations:
-	Activate(float a, float b, float c): Activates GP-2 with prices for Regular, Premium, and Diesel.
-	Start(): Starts the transaction.
-	PayCash(int c): Accepts prepaid cash.
-	Cancel(): Cancels the transaction.
-	Regular(): Selects Regular fuel.
-	Premium(): Selects Premium fuel.
-	Diesel(): Selects Diesel fuel.
-	StartPump(): Begins fuel dispensing.
-	PumpGallon(): Dispenses 1 gallon of fuel.
-	Stop(): Stops fuel dispensing.
-	Receipt(): Prints a receipt.
-	NoReceipt(): Skips the receipt.

### Key Differences Between GP-1 and GP-2

| **Aspect**            | **GP-1**                                         | **GP-2**                                      |
|----------------------|---------------------------------------------------|----------------------------------------------|
| **Fuel Types**       | Single type of fuel                               | Regular, Premium, and Diesel fuel types      |
| **Payment Methods**  | Credit Card and Cash                              | Cash only                                    |
| **Measurement Unit** | Liters                                            | Gallons                                      |
| **Receipt Option**   | Not available                                     | Optional receipt (Receipt/NoReceipt)        |
| **Fuel Selection**   | Not required (single fuel type)                    | Required (Regular, Premium, Diesel)         |
| **Complexity**       | Simpler operations                                | More complex with additional fuel options   |
| **Pricing Activation** | `Activate(int a)` for single fuel price           | `Activate(float a, float b, float c)` for Regular, Premium, and Diesel |
| **Pump Operation**   | `Pump()` dispenses 1 liter                        | `PumpGallon()` dispenses 1 gallon           |
| **Payment Validation** | Supports credit card approval/rejection           | No credit card support                      |

### Unified Class Diagram for GasPump MDA components
Leverages the following design patterns:
- State,
- Strategy and
- Abstract Factory

![class_diagram](./Project%20Description/unified-class-diagram.png)

