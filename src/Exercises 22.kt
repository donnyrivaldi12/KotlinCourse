import java.lang.Exception

fun main(){
    val myBoxer = MyKickBoxer()
    Referee.checkBoxer(myBoxer)

}

class MyKickBoxer {

    var stamina = 100
    var punchPower = 110
    var punchSpeed = 120
    var kickPower = 30
    var kickSpeed = 100

    fun fight() {
        if (stamina < 50) {
            throw StaminaException()
        }

        if (punchPower < 70) {
            throw PunchPowerException()
        }

        if (punchSpeed < 90) {
            throw PunchSpeedException()
        }

        if (kickPower < 50){
            throw KickPowerException()
        }

        if (kickSpeed < 60){
            throw KickSpeedExcepion()
        }

        println("The fight is started. Let's go")

    }

    fun increaseStamina(stamina: Int) {
        this.stamina += stamina
        println("The boxer's stamina is increased")
    }

    fun increasePunchPower(punchPower: Int) {
        this.punchPower += punchPower
        println("The boxer's punch power is increased")
    }

    fun increasePunchSpeed(punchSpeed: Int) {
        this.punchSpeed += punchSpeed
        println("The boxer's punch speed is increased")
    }

    fun increaseKickPower(kickPower: Int){
        this.kickPower += kickPower
        println("The boxer's kick power is increased")
    }

    fun increaseKickSpeed(kickSpeed: Int){
        this.kickSpeed += kickSpeed
        println("The boxer's kick speed is increased")
    }
}

object Referee {

    fun checkBoxer(kickBoxer: MyKickBoxer) {
        try {
            kickBoxer.fight()
        } catch (staminaException: StaminaException) {
            println(staminaException.message)
            kickBoxer.increaseStamina(100)
        } catch (punchPowerException: PunchPowerException) {
            println(punchPowerException.message)
            kickBoxer.increasePunchPower(100)
        } catch (punchSpeedException: PunchSpeedException) {
            println(punchSpeedException.message )
            kickBoxer.increasePunchSpeed(100)
        } catch (kickPowerException: KickPowerException){
            println(kickPowerException.message)
            kickBoxer.increaseKickPower(100)
        } catch (kickSpeedException: KickSpeedExcepion){
            println(kickSpeedException)
            kickBoxer.increaseKickSpeed(90)
        } finally {
            println("Good Luck!")
        }
    }
}

// Custom Exceptions

class StaminaException : Exception("Sorry.Not enough stamina. The fight is cancelled")
class PunchPowerException : Exception("Sorry.Not enough punch power. The fight is cancelled")
class PunchSpeedException : Exception("Sorry.Not enough punch speed. The fight is cancelled")
class KickPowerException : Exception("Sorry.Not enough kick power. The fight is cancelled")
class KickSpeedExcepion : Exception("Sorry.Not enough kick speed. The fight is cancelled")