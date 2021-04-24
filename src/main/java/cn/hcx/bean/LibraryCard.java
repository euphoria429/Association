package cn.hcx.bean;

public class LibraryCard {
    private String bor_id;
    private String status;

    public LibraryCard() {
    }

    public LibraryCard(String bor_id, String status) {
        this.bor_id = bor_id;
        this.status = status;
    }

    public String getBor_id() {
        return bor_id;
    }

    public void setBor_id(String bor_id) {
        this.bor_id = bor_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "bor_id='" + bor_id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
