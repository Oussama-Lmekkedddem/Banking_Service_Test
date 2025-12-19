# Banking System

This is a simple Java banking system that allows users to perform deposits and withdrawals, and print a statement of their transactions.

## Features

- Deposit money into an account.
- Withdraw money from an account.
- Print a transaction statement showing date, amount, and balance.

## Running the Project

1. Clone the repository

Clone this repository to your local machine:

```bash
git clone https://github.com/Oussama-Lmekkedddem/Banking_Service_Test.git
cd Banking_Service_Test
```

2. Compile the Java classes:
```bash
   javac -d out/ src/com/banking/exception/*.java src/com/banking/model/*.java src/com/banking/service/*.java src/com/banking/util/*.java src/com/banking/Main.java

```

3. Run the Main class:
```bash
   java -cp out com.banking.Main
```

### Example Output
```bash
   Date       || Amount  || Balance
   14/01/12   ||   -500  ||   2500
   13/01/12   ||   2000  ||   3000
   10/01/12   ||   1000  ||   1000
```






