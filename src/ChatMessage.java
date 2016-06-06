import java.io.Serializable;

public class ChatMessage implements Serializable {

    protected static final long serialVersionUID = 1112122200L;

    // WHOISIN danh sách client kết nối
    // MESSAGE nội dung tin nhắn
    // LOGOUT ngắt kết nối từ server
    static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
    private int type;
    private String message;

    ChatMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }

    int getType() {
        return type;
    }

    String getMessage() {
        return message;
    }
}
