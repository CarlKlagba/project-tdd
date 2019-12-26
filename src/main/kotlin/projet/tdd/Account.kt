package projet.tdd

class Account(val transactionRepository: TransactionRepository, val accountPrinter: AccountPrinter) {
    fun deposit(amount: Amount, date: Date){
        transactionRepository.save(Deposit(amount, date))
    }

    fun withdrawal(amount: Amount, date: Date) {
        transactionRepository.save(Withdrawal(amount, date))
    }

    fun printStatment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
