package onepos;

public class Reviewed extends AbstractEvent {


    private Long id;
    private String reviewId;
    private String status;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return reviewId;
    }

    public void setProductId(String productId) {
        this.reviewId = productId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() { return content;}
    public void setContent(String content) { this.content = content;}
}