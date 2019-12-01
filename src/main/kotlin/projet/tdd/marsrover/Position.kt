package projet.tdd.marsrover

data class Position(val x: Int, val y: Int){
    fun addOnY(): Position = Position(this.x, this.y + 1)
    fun minusOnX(): Position = Position(this.x-1, this.y)
    fun addOnX(): Position = Position(this.x+1, this.y)
    fun minusOnY(): Position = Position(this.x, this.y - 1)
}