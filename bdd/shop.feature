Feature: 用户购买商品  
  
  Scenario: 用户成功购买商品  
    Given 用户已登录  
    And 购物车中有一件商品  
    When 用户点击“购买”按钮  
    And 填写了正确的收货地址和支付方式  
    Then 系统应扣除商品金额  
    And 显示购买成功的提示信息  
    And 购物车中该商品数量应减少到0  
    And 订单列表应新增一条订单记录  
  ![image](https://github.com/user-attachments/assets/f25875aa-8424-4a15-a0fb-92da3e71d6b4)
  
  Scenario: 用户购买商品时库存不足  
    Given 用户已登录  
    And 购物车中有一件商品且库存为0  
    When 用户点击“购买”按钮  
    Then 系统应显示库存不足的提示信息  
    And 购物车中该商品数量不变  
    And 不应生成新的订单记录
