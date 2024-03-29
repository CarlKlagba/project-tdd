package projet.tdd


import io.mockk.verify
import org.junit.jupiter.api.Test

class AccountAcceptenceTest {
    @Test
    internal fun acceptenceTest() {
        val displayInterface: DisplayInterface = MockDisplayInterface()
        val transactionRepository: TransactionRepository = InMemoryTransactionRepository()
        val statmentPrinter = StatementPrinter(displayInterface)
        val account = Account(transactionRepository, statmentPrinter)

        account.deposit(Amount("1000"), Date("10-01-2012"))
        account.deposit(Amount("2000"), Date("13-01-2012"))
        account.withdrawal(Amount("500"), Date("14-01-2012"))

        account.printStatement()

        verify {
            displayInterface
                .print("""
            date       || credit   || debit    || balance
            14/01/2012 ||          || 500.00   || 2500.00
            13/01/2012 || 2000.00  ||          || 3000.00
            10/01/2012 || 1000.00  ||          || 1000.00
            """)
        }
    }

}


class MockDisplayInterface(): DisplayInterface {
    override fun print(string: String){

    }
}