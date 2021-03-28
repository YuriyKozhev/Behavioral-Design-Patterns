from context import Context
from concrete_strategy_a import ConcreteStrategyA
from concrete_strategy_b import ConcreteStrategyB

if __name__ == "__main__":
    csA = ConcreteStrategyA()
    csB = ConcreteStrategyB()
    context = Context(csA)
    context.request()
    context.set_strategy(csB)
    context.request()