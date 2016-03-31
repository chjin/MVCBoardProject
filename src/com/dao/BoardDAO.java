package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by cjw on 2016-03-31.
 * 디비에 CRUD를 실제 요청하는 클래스
 */
public class BoardDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private final String URL="jdbc:oracle:thin:@211.238.142.72:1521:ORCL";

    //1.드라이버 등록-오라클 디비를 쓰기위해 드라이버 객체를 생성자에서 초기화함.
    public BoardDAO(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //2. 이제 해당 드라이버에서 제공하는 여러 기능을 쓰기위해 디비와 접속함.
    public void getConnection(){
        try{
            connection= DriverManager.getConnection(URL,"scott5","tiger5");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    //3. 당근 다 사용하고나선 커넥션을 끊어줘야 하므로 디비와의 연결해제 기능 정의.
    public void disConnection(){
        try{
            //연결해제에는 연결하기위해 필요한 리소스를 종료해주면 됨.
            //1) 쿼리문을 전송하는 스트림 객체인 preparestatement
            //2) 디비와의 커녁션 객체자체
            if(preparedStatement!=null) preparedStatement.close();
            if(connection!=null) connection.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    //4. 기능.


}



















































