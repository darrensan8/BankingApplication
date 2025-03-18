# Java Banking System

## Overview
A simple Java-based banking system that manages checking and savings accounts. This application reads account information from a CSV file, creates new accounts, and allows users to perform transactions such as deposits, withdrawals, transfers, and interest calculations.

## Features
- **Account Management** – Supports both checking and savings accounts, each with unique properties.
- **CSV Integration** – Reads account details from a CSV file for batch account creation.
- **Interest Calculation** – Applies interest rates dynamically based on account type.
- **Transaction Handling** – Supports deposits, withdrawals, and transfers.
- **Randomized Security Features** – Generates unique account numbers, debit card details, and safety deposit box credentials.

## How It Works
1. The program reads account details (name, SSN, account type, and initial deposit) from a CSV file.
2. It creates a new account (checking or savings) based on the input data.
3. Each account is assigned:
   - A unique **account number**
   - An **interest rate** based on the account type
   - Security credentials such as **debit card details** or **safety deposit box access**  
4. Users can:
   - Perform deposits, withdrawals, and transfers.
   - View their account balance and details.

## File Structure
- BankAccountApp.java - Main application entry point
- Account.java - Abstract class defining shared account properties and methods
- Checking.java - Defines checking account functionality, including debit card details
- Savings.java - Defines savings account functionality, including safety deposit box details
- CSV.java - Utility class for reading CSV files
- InterestBaseRate.java - Interface defining base interest rate calculations
