from strategy import Strategy

class ConcreteStrategyB(Strategy):
    def __init__(self):
        super().__init__()

    def execute(self) -> None:
        print("execute Strategy B")