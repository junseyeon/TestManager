import java.util.Date;

/**
 * Created by 정효은 on 2018-11-27.
 */

public class a {
    private String key;
    private String txt, title;
    private Date createDate, updateData;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateData() {
        return updateData;
    }

    public void setUpdateData(Date updateData) {
        this.updateData = updateData;
    }

    public String getTitle() {
        if(txt != null) {
            if(txt.indexOf("\n") > -1) {
                return txt.substring(0, txt.indexOf("\n"));
            } else {
                return txt;
            }
        }
        return title;
    }
}
