from memento import *
from originator import *


class Caretaker(object):
    def __init__(self):
        pass

    def _print_state(self, originator: Originator) -> None:
        print(f'Originator content = {originator.get_content()}')

    def do_operations(self) -> None:
        states: List[Memento] = list()
        originator = Originator()
        originator.set_content("c1")
        states.append(originator.create_state())
        originator.set_content("c2")
        states.append(originator.create_state())
        originator.set_content("c3")
        self._print_state(originator)
        originator.restore_state(states.pop())
        self._print_state(originator)
        originator.restore_state(states.pop())
        self._print_state(originator)


if __name__ == "__main__":
    caretaker = Caretaker()
    caretaker.do_operations()

    

    