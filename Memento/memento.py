from abc import ABC, abstractmethod

class Memento(object):
    @abstractmethod
    def get_state_name(self):
        pass