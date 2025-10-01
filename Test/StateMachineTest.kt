import CoffeeMachineState.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StateMachineTest {

    @BeforeEach
    fun setUp() {
        StateMachine.currentState = Idle
    }
    @Test
    fun `SirviendoconAzucar a Idle es válida`() {
        StateMachine.currentState=SirviendoconAzucar
        StateMachine.setState(Idle)
        assertEquals(/* expected = */ SirviendoconAzucar, /* actual = */ StateMachine.currentState)
    }


}



