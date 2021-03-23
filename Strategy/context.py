from strategy import Strategy

class Context(object):
    def __init__(self, strategy: Strategy) -> None:
        self._strategy = strategy

    def set_strategy(self, strategy: Strategy) -> None:
        self._strategy = strategy

    def request(self) -> None:
        self._strategy.execute()

    