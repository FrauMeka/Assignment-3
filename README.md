# Personal Account Management

This project implements a simple personal account management system in Java.

## Features
- Deposit and withdrawal transactions
- Transaction history tracking

## How to Compile and Run
1. Clone the repository.
2. Navigate to the project directory.
3. Compile the code:


## Testing
This project includes basic test cases to ensure the functionality of the `PersonalAccount` class. The tests cover various scenarios, including:

1. **Initial Balance**: Verifies that the initial balance is 0.
2. **Deposit**: Checks that the balance updates correctly after a deposit.
3. **Withdrawal**: Ensures the balance reflects the correct amount after a withdrawal.
4. **Overdraw Attempt**: Tests that attempting to withdraw more than the available balance does not change the balance.
5. **Transaction History**: Confirms that the transaction history correctly reflects all deposits and withdrawals.

### How to Run Tests
The tests are included in the `Main` class and can be run directly from the `main` method. 

You can also create JUnit tests for more comprehensive validation. For running JUnit tests, ensure you have the JUnit library added to your project.

## License
This project is open source.
