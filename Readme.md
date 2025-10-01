```mermaid

stateDiagram-v2
   MáquinaDeCafé --> Idle
    Idle --> MakingCoffee
    MakingCoffee --> ServingCoffee: 
    ServingCoffee --> SirviendoconLeche
    SirviendoconLeche --> SirviendoconAzucar
    SirviendoconAzucar --> Idle: Reiniciando pedido
    Idle --> Error: Pedido fallido
    Error --> Idle: Reiniciando
    
```