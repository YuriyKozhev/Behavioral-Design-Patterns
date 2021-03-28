from state import State

class ConcreteStateA(State):
    def __init__(self):
        super().__init__()

    def handle(self) -> None:
        print("handle State A")


if __name__ == "__main__":
    concrete_state_a = ConcreteStateA()
    concrete_state_a.handle()