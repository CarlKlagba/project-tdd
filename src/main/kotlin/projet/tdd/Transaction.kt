package projet.tdd

interface Transaction{
    val amount: Amount
    val date: Date
}

data class Deposit(override val amount: Amount, override val date: Date): Transaction
data class Withdrawal(override val amount: Amount, override val date: Date): Transaction

