from state import State

class ConcreteStateB(State):
    def __init__(self):
        super().__init__()

    def handle(self) -> None:
        print("handle State B")


if __name__ == "__main__":
    concrete_state_b = ConcreteStateB()
    concrete_state_b.handle()