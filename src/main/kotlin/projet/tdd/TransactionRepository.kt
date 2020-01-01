package projet.tdd

interface TransactionRepository {
    fun save(transaction: Transaction): Unit
    fun getTransactions(): List<Transaction>
}

