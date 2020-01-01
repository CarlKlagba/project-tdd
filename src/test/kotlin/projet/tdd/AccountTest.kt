package projet.tdd

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class AccountTest{

    @Test
    internal fun `should save the deposit when deposit`() {
        //GIVEN
        val accountPrinter = mockk<StatementPrinter>()
        val transactionRepository = mockk<TransactionRepository>()
        every {
            transactionRepository.save(any())
        } returns  Unit
        val account = Account(transactionRepository, accountPrinter)

        //WHEN
        account.deposit(Amount("12345"), Date("10-10-2010"))

        //THEN
        verify{
            transactionRepository.save(Deposit(Amount("12345"), Date("10-10-2010")))
        }
    }

    @Test
    internal fun `should save the withdrawal when withdraw`() {
        //GIVEN
        val accountPrinter = mockk<StatementPrinter>()
        val transactionRepository = mockk<TransactionRepository>()
        every {
            transactionRepository.save(any())
        } returns  Unit
        val account = Account(transactionRepository, accountPrinter)

        //WHEN
        account.withdrawal(Amount("12345"), Date("10-10-2010"))

        //THEN
        verify{
            transactionRepository.save(Withdrawal(Amount("12345"), Date("10-10-2010")))
        }
    }

    @Test
    internal fun `should print statement when a deposit has been made`() {
        //GIVEN
        val statementPrinter: StatementPrinter = mockk(relaxed = true)
        val transactionRepository = mockk<TransactionRepository>()
        val transactions = listOf(Deposit(Amount("12345"), Date("10-10-2010")))
        every {
            transactionRepository.getTransactions()
        } returns  transactions

        val account = Account(transactionRepository, statementPrinter)

        //WHEN
        account.printStatement()

        //THEN
        verify {
            statementPrinter.printStatement(transactions)
        }
    }
}