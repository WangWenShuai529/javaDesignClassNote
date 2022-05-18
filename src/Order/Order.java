package Order;

public class Order implements IOrderForPortal,IOrderForOtherSys,IOrderForAdmin {


    // 下面是实现接口的方法
    @Override
    public String deleteOrder() {
        return "running delete order!!!";
    }

    @Override
    public String updateOrder() { 
        return "running update order!!!";
    }

    @Override
    public String insertOrder() { 
        return "running insert order!!!";
    }

    @Override
    public String getOrder() {
        return "running get order!!!";
    }
    
    
}
