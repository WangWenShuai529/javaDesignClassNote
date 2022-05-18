package proxy.permission;

public class PermissionProxy implements AbstractPermission {
    private AbstractPermission permission = new RealPermission();
    int level = 0;

    @Override
    public void viewNote() {
        // TODO Auto-generated method stub
        switch (level) {
            case 0:
                System.out.println("guest is viewing note.");
                break;
            case 1:
                permission.viewNote();
                break;
            default:
                System.out.println("something is wrong for your system");

        }

    }

    @Override
    public void modifyUserInfo() {
        // TODO Auto-generated method stub
        switch(level){
            case 0:System.out.println("guest is viewing note.");
            break;
            case 1:permission.modifyUserInfo();break;
            default:System.out.println("something is wrong for your system");}
        
    }

    @Override
    public void publishNote() {
        // TODO Auto-generated method stub
        switch(level){
            case 0:System.out.println("guest is viewing note.");
            break;
            case 1:permission.publishNote();break;
            default:System.out.println("something is wrong for your system");}

    }

    @Override
    public void modifyNote() {
        // TODO Auto-generated method stub
        switch(level){
            case 0:System.out.println("guest is viewing note.");
            break;
            case 1:permission.modifyNote();break;
            default:System.out.println("something is wrong for your system");}

    }

    @Override
    public void setLevel() {
        // TODO Auto-generated method stub

    }

}
