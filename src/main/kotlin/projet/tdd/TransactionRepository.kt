package projet.tdd

interface TransactionRepository {
    fun save(desposit: Deposit): Unit
}

