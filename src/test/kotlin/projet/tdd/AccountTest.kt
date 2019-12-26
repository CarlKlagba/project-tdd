package projet.tdd

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class AccountTest{

    @Test
    internal fun `should save the deposit when deposit`() {
        //GIVEN
        val accountPrinter = mockk<AccountPrinter>()
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
        val accountPrinter = mockk<AccountPrinter>()
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


}