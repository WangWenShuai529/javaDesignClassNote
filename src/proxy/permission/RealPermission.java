package proxy.permission;

public class RealPermission implements AbstractPermission{
    
    @Override
    public void viewNote() {
        // TODO Auto-generated method stub
        System.out.println("this adminstrator is viewing the note");
        
    }

    @Override
    public void modifyUserInfo() {
        // TODO Auto-generated method stub
        System.out.println("modifyUserInfo ");
        
    }

    @Override
    public void publishNote() {
        // TODO Auto-generated method stub
        System.out.println("publishNote ");
        
    }

    @Override
    public void modifyNote() {
        // TODO Auto-generated method stub
        System.out.println("modifyNote");
        
    }

    @Override
    public void setLevel() {
        // TODO Auto-generated method stub

        
    }
    
}
