@file:Suppress("DUPLICATE_BRANCH_CONDITION_IN_WHEN")

/**
 * State machine
 *
 * @constructor Create empty State machine
 */
object StateMachine {
   public var currentState: CoffeeMachineState = CoffeeMachineState.Idle

    /**
     * Set state
     *
     * @param newState
     */
    fun setState(newState: CoffeeMachineState) {
        if (isCorrectoPedido(currentState, newState)) {
            currentState = newState
            updateState(CoffeeMachineState.Idle)

        } else {
            println("No es posible en $currentState para $newState")
        }
    }

    /**
     * Is correcto pedido
     *
     * @param from
     * @param to
     * @return
     */
    private fun isCorrectoPedido(from: CoffeeMachineState, to: CoffeeMachineState): Boolean {
        return when (from) {//Funcion que realice las transiciones entre estados
            CoffeeMachineState.Idle -> to == CoffeeMachineState.MakingCoffee
            CoffeeMachineState.MakingCoffee -> to == CoffeeMachineState.ServingCoffee
            CoffeeMachineState.ServingCoffee -> to == CoffeeMachineState.SirviendoconLeche
            CoffeeMachineState.SirviendoconLeche -> to == CoffeeMachineState.SirviendoconAzucar
            CoffeeMachineState.SirviendoconAzucar -> to == CoffeeMachineState.Idle
            is CoffeeMachineState.Error -> to == CoffeeMachineState.Idle
            else -> false
        }

    }

    /**
     * Get state
     *
     * @return
     */

    fun getState(): CoffeeMachineState {
        return currentState // Devuelve el estado actual
    }

    /**
     * Update state
     *
     * @param newState
     */
    fun updateState(newState: CoffeeMachineState) {
        println("[StateMachine] Estado actual: $currentState")
        currentState.onEnter(this)
    }

}


        /*
        fun clean() {
            println("Limpiando la máquina...")
            currentState = CoffeeMachineState.Idle
            println("Máquina limpia. Estado: $currentState")
        }
        */