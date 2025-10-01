```mermaid

stateDiagram-v2
    [*] --> Idle
    Idle --> MakingCoffee: Pedido seleccionado
    MakingCoffee --> ServingCoffee: Pedido sirviendo
    ServingCoffee --> SirviendoconLeche: Pedido con leche
    SirviendoconLeche --> SirviendoconAzucar: Pedido con azucar
    SirviendoconAzucar --> Idle: Reiniciando pedido
    Error --> Idle: Pedido fallido

```