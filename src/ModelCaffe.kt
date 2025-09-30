
//Comentando el codigo
/**
 * I coffee machine state
 *
 * @constructor Create empty I coffee machine state
 */
interface ICoffeeMachineState {
    //Metodo que se llama al entrar en un estado
    fun onEnter(stateMachine: StateMachine)


}

/**
 * Coffee machine state
 *
 * @constructor Create empty Coffee machine state
 */

sealed class CoffeeMachineState: ICoffeeMachineState {
    //Estados de la maquina de cafe
    /**
     * Idle
     *
     * @constructor Create empty Idle
     */
        object Idle : CoffeeMachineState(){//Estado inicial
            override fun onEnter(stateMachine: StateMachine){//Al entrar en el estado Idle
                println("[Idle]Estando en Idle ...")//Mensaje de estado
                stateMachine.setState(MakingCoffee)
            }
        }

    /**
     * Making coffee
     *
     * @constructor Create empty Making coffee
     */
        object MakingCoffee : CoffeeMachineState(){//Estado de haciendo cafe
            override fun onEnter(stateMachine: StateMachine){
                println("[Making]Empezando a hacer cafe....")
                stateMachine.setState(ServingCoffee)
            }

        }

    /**
     * Serving coffee
     *
     * @constructor Create empty Serving coffee
     */
        object ServingCoffee : CoffeeMachineState(){//Estado de sirviendo cafe
            override fun onEnter(stateMachine: StateMachine){
                println("[Serving]Sirviendo cafe...")
                stateMachine.setState(SirviendoconLeche)
                }

            }

    /**
     * Sirviendocon leche
     *
     * @constructor Create empty Sirviendocon leche
     */
            object SirviendoconLeche : CoffeeMachineState() {//Estado de sirviendo con leche
                override fun onEnter(stateMachine: StateMachine) {
                    println("[SirviendoLeche]Sirviendo con leche...")
                    stateMachine.setState(SirviendoconAzucar)
                }

            }

    /**
     * Sirviendocon azucar
     *
     * @constructor Create empty Sirviendocon azucar
     */
            object SirviendoconAzucar : CoffeeMachineState(){//Estado de sirviendo con azucar
                override fun onEnter(stateMachine: StateMachine){
                    println("[SirviendoAzucar]Sirviendo con azucar...")
                    //stateMachine.setState(Idle)

             }

        }

    /**
     * Error
     *
     * @property message
     * @constructor Create empty Error
     */
        data class Error(val message: String) : CoffeeMachineState(){//Estado de error
            override fun onEnter(stateMachine: StateMachine) {
                TODO("NO implementado")
            }
        }
    }
