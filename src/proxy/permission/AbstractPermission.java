package proxy.permission;
/**抽象主题 */
public interface AbstractPermission {
    void viewNote();
    void modifyUserInfo();
    void publishNote();
    void modifyNote();
    void setLevel();
}
