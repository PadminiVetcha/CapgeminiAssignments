import java.util.List;

public class News
{
	private int newsId;
	private String postedByUser;
	private List<String> commentByUser;
	private List<String> comment;
	public News(int newsId, String postedByUser, List<String> commentByUser, List<String> comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public List<String> getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(List<String> commentByUser) {
		this.commentByUser = commentByUser;
	}
	public List<String> getComment() {
		return comment;
	}
	public void setComment(List<String> comment) {
		this.comment = comment;
	}
	public String toString()
	{
		return "News{" +
                "NewsId='" + newsId + '\'' +
                ", PostedByUser='" + postedByUser + '\'' +
                ", CommentByUser=" +commentByUser +
                ", Comment=" + comment +
                '}';
	}
}
