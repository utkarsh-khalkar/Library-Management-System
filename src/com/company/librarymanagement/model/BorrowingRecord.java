package com.company.librarymanagement.model;

public class BorrowingRecord {

    private int recordID;
    private  int bookID;
    private  int memberID;
    private String borrowDate;

    private String returnDate;
    private  String status;

    public BorrowingRecord()
    {}

    public BorrowingRecord(int recordID, int bookID, int memberID, String borrowDate, String returnDate, String status) {
        this.recordID = recordID;
        this.bookID = bookID;
        this.memberID = memberID;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String toString() {
        return "BorrowingRecord{" +
                "recordID=" + recordID +
                ", bookID=" + bookID +
                ", memberID=" + memberID +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
