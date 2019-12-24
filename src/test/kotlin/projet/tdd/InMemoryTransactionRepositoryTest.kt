package projet.tdd

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InMemoryTransactionRepositoryTest{
    @Test
    internal fun `should save the deposit`() {
        //GIVEN
        val transactionRepository = InMemoryTransactionRepository()

        //WHEN
        transactionRepository.save(Deposit(Amount("1234"), Date("10-09-23")))

        //THEN
        assertThat(transactionRepository.getTransactions())
            .contains(Deposit(Amount("1234"), Date("10-09-23")))
    }
}