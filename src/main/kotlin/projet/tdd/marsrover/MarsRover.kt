package projet.tdd.marsrover

data class MarsRover(var position: Position, val direction: Direction) {
    fun execute(commands: List<Command>) {
        commands.forEach{
            position = it.execute(direction, position)
        }
    }
}
