from strategy import Strategy

class ConcreteStrategyA(Strategy):
    def __init__(self):
        super().__init__()

    def execute(self) -> None:
        print("execute Strategy A")