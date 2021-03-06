package com.zblog.core.dal.entity;

import com.zblog.core.util.constants.CommentConstants;

public class Comment extends BaseEntity{
  private String postid;
  /* 评论者邮箱 */
  private String email;
  /* 评论者网址 */
  private String url;
  /* 评论者IP */
  private String ip;
  /* 内容 */
  private String content;
  /* 评论状态 */
  private String stutas = CommentConstants.TYPE_WAIT;
  /* 评论者的userAgent */
  private String agent;
  /* 父评论ID */
  private String parent;

  public String getPostid(){
    return postid;
  }

  public void setPostid(String postid){
    this.postid = postid;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getUrl(){
    return url;
  }

  public void setUrl(String url){
    this.url = url;
  }

  public String getIp(){
    return ip;
  }

  public void setIp(String ip){
    this.ip = ip;
  }

  public String getContent(){
    return content;
  }

  public void setContent(String content){
    this.content = content;
  }

  public boolean isApproved(){
    return stutas .equals(CommentConstants.TYPE_APPROVE);
  }

  public String getStutas(){
    return stutas;
  }

  public void setStutas(String stutas){
    this.stutas = stutas;
  }

  public String getAgent(){
    return agent;
  }

  public void setAgent(String agent){
    this.agent = agent;
  }

  public String getParent(){
    return parent;
  }

  public void setParent(String parent){
    this.parent = parent;
  }

}
