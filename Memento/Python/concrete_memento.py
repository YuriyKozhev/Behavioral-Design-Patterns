from memento import Memento
from random import sample
from string import ascii_letters


class ConcreteMemento(Memento):
    def __init__(self, content_a: str, content_b: str) -> None:
        self._CONTENT_A = content_a
        self._CONTENT_B = content_b
        self._name: str = "".join(sample(ascii_letters, 10))

    def get_state(self) -> tuple[str, str]:
        return (self._CONTENT_A, self._CONTENT_B)

    def get_state_name(self) -> str:
        return self._name


if __name__ == "__main__":
    cm = ConcreteMemento('a', 'b')
    print(cm.get_state_name())
    print(cm.get_state())
