namespace MyProject.Tests;

using Microsoft.VisualStudio.TestTools.UnitTesting;
using CalculatorNamespace; // 引入被测项目的命名空间    


[TestClass]
public class CalculatorTests
{
    [TestMethod]
    public void Add_TwoNumbers_ReturnsCorrectSum()
    {
        // Arrange          
        Calculator calculator = new Calculator();
        int a = 5; int b = 7;
        int expected = 12;                // Act     
        int actual = calculator.Add(a, b);
        // Assert           
        Assert.AreEqual(expected, actual, "The sum of 5 and 7 should be 12.");
    }
}
