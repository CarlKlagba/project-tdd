package projet.tdd.marsrover

enum class Command {
    FORWARD {
        override fun execute(direction: Direction, position: Position): Position =
            when (direction) {
                Direction.SOUTH -> position.addOnY()
                Direction.WEST -> position.minusOnX()
                Direction.EST -> position.addOnX()
                Direction.NORTH -> position.minusOnY()
            }
    },
    BACKWARD {
        override fun execute(direction: Direction, position: Position): Position =
            when (direction) {
                Direction.SOUTH -> position.minusOnY()
                Direction.WEST -> position.addOnX()
                Direction.EST -> position.minusOnX()
                Direction.NORTH -> position.minusOnY()
            }
    },
    RIGHT {
        override fun execute(direction: Direction, position: Position): Position {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    LEFT {
        override fun execute(direction: Direction, position: Position): Position {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };


    abstract fun execute(direction: Direction, position: Position): Position
}
