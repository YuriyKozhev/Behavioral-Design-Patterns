from memento import *

class Originator(object):
    def __init__(self, content: str = "") -> None:
        self.content = content

    def set_content(self, content) -> None:
        print(f'Setting originator content with value = {content}')
        self.content = content

    def get_content(self) -> str:
        return self.content
    
    def create_state(self) -> Memento:
        print(f'Creating originator state with value = {self.content}')
        return Memento(self.content)
    
    def restore_state(self, memento: Memento):
        print('Restoring originator state')
        self.content = memento.get_saved_state()

if __name__ == "main":
    originator = Originator()
    originator.create_state()