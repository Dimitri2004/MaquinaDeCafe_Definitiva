import javax.swing.plaf.nimbus.State

/**
 * Ejemplo de una máquina de café con estados usando Kotlin.
 * Incluye estados como Idle, MakingCoffee, ServingCoffee, SirviendoconLeche y SirviendoconAzucar.
 * La máquina puede hacer café, servirlo con leche o azúcar, y manejar errores.
 * @author Dima
 * @version 1.0
 */
fun main(){
    println("--- Encendiendo la máquina ---")
    StateMachine.setState(CoffeeMachineState.Idle)
    println("--- Making Coffee ---")
    StateMachine.setState(CoffeeMachineState.MakingCoffee)
    println("\n--- Sirviendo cafe ---")
    StateMachine.setState(CoffeeMachineState.ServingCoffee)
    println("\n--- Sirviendo cafe con leche ---")
    StateMachine.setState(CoffeeMachineState.SirviendoconLeche)
    println("\n--- Sirviendo cafe con azucar ---")
    StateMachine.setState(CoffeeMachineState.SirviendoconAzucar)


}

