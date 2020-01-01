package projet.tdd

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class StatementPrinterTest{

    @Test
    internal fun `should print a statement for a deposit`() {
        //GIVEN
        val displayInterface = mockk<DisplayInterface>(relaxed = true)
        val statementPrinter: StatementPrinter = StatementPrinter(displayInterface)

        //WHEN
        statementPrinter.printStatement(
            listOf(
                Deposit(Amount("1000.00"), Date("10/01/2012"))
            )
        )

        //THEN
        verify {
            displayInterface.print(
                "date       || credit   || debit    || balance\n"+
                "10/01/2012 || 1000.00  ||          || 1000.00")
        }
    }

    @Test
    internal fun `should print a statement for several deposits`() {
        //GIVEN
        val displayInterface = mockk<DisplayInterface>(relaxed = true)
        val statementPrinter: StatementPrinter = StatementPrinter(displayInterface)

        //WHEN
        statementPrinter.printStatement(
            listOf(
                Deposit(Amount("1000.00"), Date("10/01/2012")),
                Deposit(Amount("500.00"), Date("10/01/2012"))
            )
        )

        //THEN
        verify {
            displayInterface.print(
                "date       || credit   || debit    || balance\n"+
                "10/01/2012 || 1000.00  ||          || 1000.00\n"+
                "10/01/2012 || 500.00  ||          || 1000.00\n")
        }

    }
}
