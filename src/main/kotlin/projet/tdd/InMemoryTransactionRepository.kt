package projet.tdd

class InMemoryTransactionRepository: TransactionRepository {
    private val transactions: MutableList<Transaction> = mutableListOf()

    override fun save(transaction: Transaction) {
        transactions.add(transaction)
    }

    internal fun getTransactions(): List<Transaction> {
        return transactions
    }
}