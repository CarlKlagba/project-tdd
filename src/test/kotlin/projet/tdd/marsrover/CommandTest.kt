package projet.tdd.marsrover

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class CommandTest{
    @Nested
    @DisplayName("Forward")
    inner class Forward{
        @Test
        internal fun `when direction EST then should move on the X axis`() {
            val position = Command.FORWARD.execute(Direction.EST, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(2,1)
                )
        }

        @Test
        internal fun `when direction is SOUTH then should move on the Y axis`() {
            val position = Command.FORWARD.execute(Direction.SOUTH, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(1,2)
                )
        }

        @Test
        internal fun `when direction WEST then should move on the X axis`() {
            val position = Command.FORWARD
                    .execute(Direction.WEST, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(0,1)
                )
        }

        @Test
        internal fun `when direction NORTH then should move on the Y axis`() {
            val position = Command.FORWARD.execute(Direction.NORTH, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(1,0)
                )
        }
    }

    @Nested
    @DisplayName("Backward")
    inner class Backward{
        @Test
        internal fun `when direction is EST then should move on the X axis `() {
            val position = Command.BACKWARD.execute(Direction.EST, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(0,1)
                )
        }

        @Test
        internal fun `when direction is SOUTH then should move on the Y axis `() {
            val position = Command.BACKWARD.execute(Direction.SOUTH, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(1,0)
                )
        }

        @Test
        internal fun `when direction is WEST then should move on the X axis `() {
            val position = Command.BACKWARD.execute(Direction.WEST, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(2,1)
                )
        }

        @Test
        internal fun `when direction is NORTH then should move on the Y axis `() {
            val position = Command.BACKWARD.execute(Direction.NORTH, Position(1, 1))

            Assertions.assertThat(position)
                .isEqualTo(
                    Position(1,0)
                )
        }
    }
}