package com.zhihu.design.pattern.creational.prototype;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/23 8:25
 */
public class Mail implements Cloneable {
    
    private String name;
    private String emailAddress;
    private String content;
    
    public Mail(){
        System.out.println("Mail Class Constructor");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Override
    public String toString() {
        return "Mail{" +
            "name='" + name + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            ", content='" + content + '\'' +
            '}' + " " + super.toString();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
