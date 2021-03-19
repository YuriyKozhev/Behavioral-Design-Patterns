class Memento(object):
    def __init__(self, content) -> None:
        self.CONTENT = content

    def get_saved_state(self):
        return self.CONTENT