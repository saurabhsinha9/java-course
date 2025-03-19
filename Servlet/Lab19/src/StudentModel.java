package com.jlc.model;
import java.sql.*;
import com.jlc.to.StudentTo;
import com.jlc.util.JDBCUtil;

public class StudentModel{
public static StudentTo validateLogin(String Username,String password){
StudentTo sto=null;
Connection con=null;
PreparedStatement st=null;
try{
con=JDBCUtil.getConnection();
st=con.prepareStatement("select * from login where username=? and password=?");
st.setString(1, username);
st.setString(2, password);
ResultSet rs=st.executeQuery();
if(rs.next()){
String stud_id=rs.getString(5);
if(stud_id!=null){
sto = new studentTo();
PreparedStatement ps = con.prepareStatement("select * from student where sid=?");
ps.setString(1,stud_id);
ResultSet rs1=ps.executeQuery();
if(rs1.next()){
sto.setSid(stud_id);
sto.setFname(rs1.getString(2));
sto.setLname(rs1.getString(3));
sto.setEmail(rs1.getString(4));
sto.setPhone(rs1.getString(5));
sto.setGender(rs1.getString(6));
sto.setQualification(rs1.getString(7));
sto.setUsername(rs1.getString(8));
}
rs1.close();
ps.close();
}
rs.close();
}
}catch(Exception e){
sto=null;
e.printStackTrace();
}finally{
JDBCUtil.close(con,st);
}
return sto;
}

//-------------------------------------------------------------

public static boolean registerStudent(StudentTo sto){
boolean registered = false;
Connection con=null;
PreparedStatement st=null;
try{
con=JDBCUtil.getConnection();
con.setAutoCommit(false);
st=con.prepareStatement("select max(sid) from student");
ResultSet rs=st.executeQuery();
if(rs.next()){
String str=rs.getString(1);
if(str!=null){
int id = Integer.parseInt(str.substring(4));
if(id<10){
newId = "JLC-00" + (++id);
}else if(id<100){
newId = "JLC-0" + (++id);
}else{
newId = "JLC-" + (++id);
}
}else{
newId = "JLC-001";
}
}else{
newId = "JLC-001";
}
st=con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
st.setString(1,newId);
st.setString(2,sto.getFname());
st.setString(3,sto.getLname());
st.setString(4,sto.getEmail());
st.setLong(5,sto.getPhone());
st.setString(6,sto.getGender());
st.setString(7,sto.getQualification());
int x=st.executeUpdate();
PreparedStatement ps=con.prepareStatement("insert into login(username,password,email,stud_id) values(?,?,?,?)");
ps.setString(1,sto.getUsername());
ps.setString(2,sto.getPassword());
ps.setString(3,sto.getEmail());
ps.setString(4,newId);
int y = ps.executeUpdate();
if(x>0 && y>0){
con.commit();
}else{
con.rollback();
}
}catch(Exception e){
try { con.rollback(); } catch (Exception e1){
}
registered = false;
e.printStackTrace();
}finally{
JDBCUtil.close(con,st);
}
return registered;
}

//=========================================================

public static boolean alreadyRegistered(String Username){
boolean registered = false;
Connection con=null;
PreparedStatement st=null;
try{
con=JDBCUtil.getConnection();
st=con.prepareStatement("select * from login where username=?");
st.setString(1,username);
ResultSet rs=st.executeQuery();
if(rs.next()){
String stud_id=rs.getString(4);
if(stud_id!=null){
registered = true;
}
rs.close();
}
}catch (Exception e){
registered = false;
e.printStackTrace();
}finally{
JDBCUtil.close(con,st);
}
return registered;
}

//===========================================================

public static StudentTo retrievePassword(String Username,String email){
StudentTo sto=null;
Connection con=null;
PreparedStatement st=null;
try{
con=JDBCUtil.getConnection();
st=con.prepareStatement("select * from login where username=? and email=?");
st.setString(1,username);
st.setString(2,email);
ResultSet rs=st.executeQuery();
if(rs.next()){
String stud_id=rs.getString(4);
if(stud_id!=null){
sto = new studentTo();
sto.setUsername(username);
sto.setPassword(rs.getString(3));
sto.setEmail(email);
}
rs.close();
}
}catch (Exception e){
sto=null;
e.printStackTrace();
}finally{
JDBCUtil.close(con,st);
}
return sto;
}
}