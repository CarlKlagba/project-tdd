package projet.tdd

class Account(val transactionRepository: TransactionRepository, val accountPrinter: AccountPrinter) {
    fun deposit(amount: Amount, date: Date){
        transactionRepository.save(Deposit(amount, date))
    }

    fun withdrawal(amount: Amount, date: Date) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun printStatment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
