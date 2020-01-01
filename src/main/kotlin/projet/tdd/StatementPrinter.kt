package projet.tdd

class StatementPrinter(val displayInterface: DisplayInterface) {
    fun printStatement(transactions: List<Transaction>) {
        displayInterface.print(
            "date       || credit   || debit    || balance\n"+
            toStatementLine(transactions.get(0))
        )
    }

    private fun toStatementLine(transaction: Transaction): String {
        return ""+ transaction.date.date +" || "+ transaction.amount.amount +"  ||          || " + transaction.amount.amount
    }


}
