import unittest
from src.module import *

class TestMyModule(unittest.TestCase):
    def test_add(self):
        self.assertEqual(add(2,3), 5)

    def test_substract(self):
        self.assertEqual(substract(3,2), 1)

if __name__ == "__main__":
    unittest.main()