class Aggregate(object):
    def __init__(self, data: list[int] = []):
        self._data = data

    def add_item(self, n: int):
        self._data.append(n)
        
    def __getitem__(self, params) -> ...:
        return self._data.__getitem__(params)

    def __len__(self) -> int:
        return self._data.__len__()