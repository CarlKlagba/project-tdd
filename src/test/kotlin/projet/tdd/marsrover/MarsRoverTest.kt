package projet.tdd.marsrover

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class MarsRoverTest{
    @Nested
    @DisplayName("Forward")
    inner class Forward{
        @Test
        internal fun `when direction is EST command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.EST)

            marsRover.execute(listOf(Command.FORWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(2,1), Direction.EST)
                )
        }

        @Test
        internal fun `when direction is SOUTH and command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.SOUTH)

            marsRover.execute(listOf(Command.FORWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(1,2), Direction.SOUTH)
                )
        }

        @Test
        internal fun `when direction is WEST and command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.WEST)

            marsRover.execute(listOf(Command.FORWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(0,1), Direction.WEST)
                )
        }

        @Test
        internal fun `when direction is North and command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.NORTH)

            marsRover.execute(listOf(Command.FORWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(1,0), Direction.NORTH)
                )
        }
    }

    @Nested
    @DisplayName("Backward")
    inner class Backward{
        @Test
        internal fun `when direction is EST command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.EST)

            marsRover.execute(listOf(Command.BACKWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(0,1), Direction.EST)
                )
        }

        @Test
        internal fun `when direction is SOUTH and command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.SOUTH)

            marsRover.execute(listOf(Command.BACKWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(1,0), Direction.SOUTH)
                )
        }

        @Test
        internal fun `when direction is WEST and command Forward is executed then should go forward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.WEST)

            marsRover.execute(listOf(Command.BACKWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(2,1), Direction.WEST)
                )
        }

        @Test
        internal fun `when direction is North and command Backward is executed then should go backward`() {
            val marsRover = MarsRover(Position(1, 1), Direction.NORTH)

            marsRover.execute(listOf(Command.BACKWARD))

            assertThat(marsRover)
                .isEqualTo(
                    MarsRover(Position(1,0), Direction.NORTH)
                )
        }
    }

}