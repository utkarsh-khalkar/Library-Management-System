package com.company.librarymanagement.model;

public class Member {

    private int memberID;
    private String memberName;
    private String memberShipDate;
    private String memberemail;

    public Member()
    {

    }

    public Member(int memberID, String memberName, String memberShipDate, String memberemail) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberShipDate = memberShipDate;
        this.memberemail = memberemail;
    }

    public Member(String memberName, String memberShipDate, String memberemail) {
        this.memberName = memberName;
        this.memberShipDate = memberShipDate;
        this.memberemail = memberemail;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberShipDate() {
        return memberShipDate;
    }

    public void setMemberShipDate(String memberShipDate) {
        this.memberShipDate = memberShipDate;
    }

    public String getMemberemail() {
        return memberemail;
    }

    public void setMemberemail(String memberemail) {
        this.memberemail = memberemail;
    }


    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                ", memberShipDate='" + memberShipDate + '\'' +
                ", memberemail='" + memberemail + '\'' +
                '}';
    }
}
