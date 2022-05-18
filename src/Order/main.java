package Order;

public class main {

    public static void main(String[] args) {
        IOrderForPortal orderForPortal = new Order();
        IOrderForOtherSys orderForOtherSys = new Order();
        IOrderForAdmin orderForAdmin = new Order();

        System.out.println("Portal调用方法:" + orderForPortal.getOrder());
        System.out.println("OtherSys调用方法:" + orderForOtherSys.insertOrder());
        System.out.println("Admin调用方法");

        System.out.println(orderForAdmin.getOrder() + "\n"
                + orderForAdmin.insertOrder() + "\n" +
                orderForAdmin.updateOrder() + "\n" + orderForAdmin.deleteOrder());
    }

}
