from memento import Memento
from originator import Originator


class Caretaker(object):
    def __init__(self) -> None:
        self._states: List[Memento] = list()

    def save(self, state: Memento) -> None:
        print(f"Saving originator state with name = {state.get_state_name()}")
        self._states.append(state)

    def load(self) -> Memento:
        print(f"Loading previous originator state")
        try:
            return self._states.pop()
        except:
            print("Originator is in initial state")


if __name__ == "__main__":
    caretaker = Caretaker()
    

    