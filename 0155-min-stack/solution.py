class MinStack:

    def __init__(self):
        self.stack = []

    def push(self, value: int) -> None:
        
        curr = value 
        if self.stack :
            curr = min(value, self.stack[-1][1])
        self.stack.append((value, curr))


    def pop(self) -> None:
        if self.stack :
            self.stack.pop()

    def top(self) -> int:
        return self.stack[-1][0] if self.stack else -1

    def getMin(self) -> int:
        return self.stack[-1][1] if self.stack else -1


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(value)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
