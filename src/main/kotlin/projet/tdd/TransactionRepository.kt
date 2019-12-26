package projet.tdd

interface TransactionRepository {
    fun save(transaction: Transaction): Unit
}

