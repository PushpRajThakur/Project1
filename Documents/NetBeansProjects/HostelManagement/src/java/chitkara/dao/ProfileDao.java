/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitkara.dao;

/**
 *
 * @author PushpRajThakur
 */
public class ProfileDao {
  
    
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String uid;
    private String father_name;
    private String mother_name;
    private String address;
    private String mobno;
    private String branch;
    private String hostel;
    private int room;
    private int rank;
    private int year;
    public int getId(){
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getFirst_name(){
        return first_name;
    }
    public void setFirst_name(String first_name)
    {
        this.first_name=first_name;
    }
    public String getLast_name(){
        return last_name;
    }
        public void setLast_name(String last_name)
    {
        this.last_name=last_name;
    }
       public String getE_mail() {
        return email;
    }
    public void setE_mail(String email)
    {
        this.email=email;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid)
    {
        this.uid=uid;
    }
       public String getFather_name(){
        return father_name;
    }
        public void setFather_name(String father_name)
    {
        this.father_name=father_name;
    }
           public String getMother_name(){
        return mother_name;
    }
        public void setMother_name(String mother_name)
    {
        this.mother_name=mother_name;
    }
    public String getAddress(){
        return address;
    }
        public void setAddress(String address)
    {
        this.address=address;
    }
           public String getMob_no(){
        return mobno;
    }
        public void setMob_no(String mobno)
    {
        this.mobno=mobno;
    }
           public String Branch(){
        return branch;
    }
        public void Branch(String branch)
    {
        this.branch= branch;
    }
           public String getHostel(){
        return hostel;
    }
        public void setHostel(String hostel)
    {
        this.hostel=hostel;
    }
           public int getRoom(){
        return room;
    }
        public void setRoom(int room)
    {
        this.room=room;
    }
                  public int getRank(){
        return rank;
    }
        public void setRank(int rank)
    {
        this.rank=rank;
    }
                  public int getYear(){
        return year;
    }
        public void setYear(int year)
    {
        this.year=year;
    }

    
    
}
