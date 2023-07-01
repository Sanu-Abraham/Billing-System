# Billing System

The Billing System is a simple command-line application implemented in Java that allows you to manage a menu and generate bills based on user orders and quantities.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Add new items to the menu with their names and rates.
- Display the current menu with item details.
- Calculate and print bills based on user-selected orders and quantities.
- Handle invalid input and provide a user-friendly interface.

## Prerequisites

To run the Billing System, ensure that you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE) 8 or higher

## Installation

1. Clone the repository or download the source code.
2. Ensure that you have Java JDK and JRE installed on your system.
3. Compile the Java source code files using the following command:

   ```
   javac BillingSystem.java
   ```

## Usage

1. Run the application by executing the following command:

   ```
   java BillingSystem
   ```

2. The application will display a menu with the available options:

   ```
   What do you want to do?
   1. Add a new item to the menu
   2. Calculate & print bill
   3. Exit
   Enter choice:
   ```

3. Choose one of the options by entering the corresponding number and pressing Enter:

   - **Add a new item to the menu**: Enter the name and rate of the new item when prompted. The item will be added to the menu.
   - **Calculate & print bill**: Enter the indexes of the items you want to order, separated by commas (e.g., `1,3`). Then, enter the quantity for each item. The application will calculate and print the bill.
   - **Exit**: Choose this option to terminate the program.

## Contributing

Contributions to the Billing System project are always welcome. If you have any ideas, suggestions, or bug fixes, please create a pull request or open an issue.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
