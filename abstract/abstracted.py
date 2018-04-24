from abc import ABCMeta, abstractmethod
import abstract


class Animal:
    __metaclass__ = ABCMeta

    @abstractmethod
    def say_something(self):
          return "I'm an animal!"

class Cat(Animal):
    def say_something(self):
        s = super(Cat, self).say_something()
        return "%s - %s" % (s, "Miauuu")
c = Cat()
print(c.say_something())

