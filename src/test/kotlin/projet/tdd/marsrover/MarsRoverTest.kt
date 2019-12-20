package projet.tdd.marsrover

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class MarsRoverTest{
    @Test
    internal fun `should execute the command`() {
        val position = Position(1, 1)
        val direction = Direction.NORTH
        val marsRover = MarsRover(position, direction)
        val command: Command= mockk<Command>()
        every { command.execute(any(), any()) } returns Position(1,1)

        marsRover.execute(listOf(command))

        verify { command.execute(direction, position) }
    }
}