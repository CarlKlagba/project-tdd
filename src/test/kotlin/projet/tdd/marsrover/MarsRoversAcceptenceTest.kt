package projet.tdd.marsrover

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

//https://kata-log.rocks/mars-rover-kata
class MarsRoversAcceptenceTest {

    @Test
    internal fun acceptenceTest() {
        val marsRover = MarsRover(Position(1, 1), Direction.EST)
        val commands = listOf(
            Command.FORWARD,
            Command.FORWARD,
            Command.BACKWARD,
            Command.RIGHT,
            Command.RIGHT,
            Command.LEFT,
            Command.FORWARD
        )

        marsRover.execute(commands)

        Assertions.assertThat(marsRover).isEqualTo(MarsRover(Position(2,2), Direction.SOUTH))
    }
}