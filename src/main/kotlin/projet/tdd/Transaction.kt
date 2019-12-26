package projet.tdd

sealed class Transaction(amount: Amount, date: Date)

data class Deposit(val amount: Amount, val date: Date): Transaction(amount, date)
data class Withdrawal(val amount: Amount, val date: Date): Transaction(amount, date)