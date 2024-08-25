import pytest
import sys  
import os  
  
# 获取当前文件的目录  
current_dir = os.path.dirname(os.path.abspath(__file__))  

# 获取当前文件的父目录路径  
parent_dir = os.path.dirname(current_dir)  

# 假设src目录与当前文件（test_fibonacci.py）在同一级别  
src_dir = os.path.join(parent_dir, 'src')  
# 将src目录添加到sys.path中，以便可以导入其中的模块  
sys.path.insert(0, src_dir)  
  
# 现在可以导入src目录下的fibonacci模块了  
from fibonacci import fibonacci  

def test_fibonacci_zero():  
    assert fibonacci(0) == 0  
  
def test_fibonacci_one():  
    assert fibonacci(1) == 1  
  
def test_fibonacci_two():  
    assert fibonacci(2) == 1  
  
def test_fibonacci_three():  
    assert fibonacci(3) == 2  
  
def test_fibonacci_four():  
    assert fibonacci(4) == 3  
  
def test_fibonacci_large_number():  
    # 选择一个较大的数字进行测试，确保算法在较大输入时也能正确工作  
    # 这里选择了第10个斐波那契数，因为55是一个相对容易验证的结果  
    assert fibonacci(10) == 55  
  
def test_fibonacci_negative_number():  
    # 假设我们想要函数对于负数的输入抛出异常或者返回特定的值  
    # 这里我们假设它应该返回0（或者你可以根据需求修改）  
    assert fibonacci(-1) == 0  
