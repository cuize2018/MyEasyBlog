package com.xk.myeasyblog.pojo;

public class BlogEntity extends BaseEntity {

    private String idBlog;

    private String vluBlogTitle;

    private Integer idAuthor;

    private String  vluBlogContent;

    private String vluType;

    public String getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(String idBlog) {
        this.idBlog = idBlog;
    }

    public String getVluBlogTitle() {
        return vluBlogTitle;
    }

    public void setVluBlogTitle(String vluBlogTitle) {
        this.vluBlogTitle = vluBlogTitle;
    }

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getVluBlogContent() {
        return vluBlogContent;
    }

    public void setVluBlogContent(String vluBlogContent) {
        this.vluBlogContent = vluBlogContent;
    }

    public String getVluType() {
        return vluType;
    }

    public void setVluType(String vluType) {
        this.vluType = vluType;
    }
}
