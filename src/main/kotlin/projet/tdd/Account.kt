package projet.tdd

class Account(val transactionRepository: TransactionRepository, val statementPrinter: StatementPrinter) {
    fun deposit(amount: Amount, date: Date){
        transactionRepository.save(Deposit(amount, date))
    }

    fun withdrawal(amount: Amount, date: Date) {
        transactionRepository.save(Withdrawal(amount, date))
    }

    fun printStatement() {
        val transactions = transactionRepository.getTransactions()
        statementPrinter.printStatement(transactions)
    }
}
