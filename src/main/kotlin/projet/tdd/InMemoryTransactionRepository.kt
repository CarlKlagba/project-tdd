package projet.tdd

class InMemoryTransactionRepository: TransactionRepository {
    val transactions: MutableList<Deposit> = mutableListOf()

    override fun save(deposit: Deposit) {
        transactions.add(deposit)
    }
}