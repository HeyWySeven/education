package com.oracle.vo;

import java.util.Date;

public class TbStudent {
    private Integer stuid;

    private String name;

    private String sex;

    private Integer classid;

    private Integer degreeid;

    private Integer teacherid;

    private String idcard;

    private String tel;

    private String ftel;

    private String mtel;

    private Integer schoolid;

    private String major;

    private String grade;

    private Integer classguideid;

    private Integer jobguideid;

    private String address;

    private String intendcity;

    private String workcity;

    private String company;

    private String job;

    private Date endclasstime;

    private Date worktime;

    private String salary;

    private Integer salaryofyear;

    private Integer recommendtypeid;

    private Integer stateid;

    private String comment;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(Integer degreeid) {
        this.degreeid = degreeid;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFtel() {
        return ftel;
    }

    public void setFtel(String ftel) {
        this.ftel = ftel == null ? null : ftel.trim();
    }

    public String getMtel() {
        return mtel;
    }

    public void setMtel(String mtel) {
        this.mtel = mtel == null ? null : mtel.trim();
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getClassguideid() {
        return classguideid;
    }

    public void setClassguideid(Integer classguideid) {
        this.classguideid = classguideid;
    }

    public Integer getJobguideid() {
        return jobguideid;
    }

    public void setJobguideid(Integer jobguideid) {
        this.jobguideid = jobguideid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIntendcity() {
        return intendcity;
    }

    public void setIntendcity(String intendcity) {
        this.intendcity = intendcity == null ? null : intendcity.trim();
    }

    public String getWorkcity() {
        return workcity;
    }

    public void setWorkcity(String workcity) {
        this.workcity = workcity == null ? null : workcity.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Date getEndclasstime() {
        return endclasstime;
    }

    public void setEndclasstime(Date endclasstime) {
        this.endclasstime = endclasstime;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public Integer getSalaryofyear() {
        return salaryofyear;
    }

    public void setSalaryofyear(Integer salaryofyear) {
        this.salaryofyear = salaryofyear;
    }

    public Integer getRecommendtypeid() {
        return recommendtypeid;
    }

    public void setRecommendtypeid(Integer recommendtypeid) {
        this.recommendtypeid = recommendtypeid;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}