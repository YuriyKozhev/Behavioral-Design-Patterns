from concrete_memento import ConcreteMemento


class Originator(object):
    def __init__(self, content_a: str = "a", content_b: str = "b") -> None:
        print(f'Creating originator with content_a = {content_a}, content_b = {content_b}')
        self._content_a = content_a
        self._content_b = content_b

    def set_content(self, content_a: str, content_b: str) -> None:
        print(f'Setting originator content_a = {content_a}, content_b = {content_b}')
        self._content_a = content_a
        self._content_b = content_b

    def get_content(self) -> tuple[str,str]:
        return (self._content_a, self._content_b)
    
    def create_state(self) -> ConcreteMemento:
        print(f'Creating originator state with content_a = {self._content_a}, content_b = {self._content_b}')
        return ConcreteMemento(self._content_a, self._content_b)
    
    def restore_state(self, memento: ConcreteMemento):
        try:
            print(f'Restoring originator state with name = {memento.get_state_name()}')
            self._content_a, self._content_b = memento.get_state()
        except:
            return


if __name__ == "main":
    originator = Originator()
    originator.create_state()