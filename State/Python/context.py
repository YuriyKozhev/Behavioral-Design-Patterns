from state import State

class Context(object):
    def __init__(self) -> None:
        pass

    def request(self, state: State) -> None:
        state.handle()

if __name__ == "__main__":
    context = Context()
    