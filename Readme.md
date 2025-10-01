```mermaid

stateDiagram-v2
    [*] --> Idle
    Idle --> MakingCoffee: Pedido seleccionado
    MakingCoffee --> ServingCoffee: Pedido sirviendo
    ServingCoffee --> SirviendoconLeche: sirviendo con leche
    SirviendoconLeche --> SirviendoconAzucar: Pedido con azucar
    SirviendoconAzucar --> Idle: reiniciando pedido
    Error --> Idle: Pedido fallido

```