package proxy.permission;

public class App {
    public static void main(String[] args) {
        AbstractPermission aPermission=new PermissionProxy();
        aPermission.viewNote();
        aPermission.modifyNote();
        aPermission.publishNote();
        System.out.println("----------------");
    }
    
}
