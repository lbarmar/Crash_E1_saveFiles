package dam.pmdm.gestionficheroscrash

data class Player(
    var name: String,
    var level: String,
    var experience: String,
    var maxExperience: String,
    var achievement: List<Achievement>
)

data class Achievement(
    var name: String,
    var completed: Boolean
)
