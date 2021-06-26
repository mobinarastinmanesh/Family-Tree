import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataBase implements  AutoCloseable{
    private PreparedStatement preparedStatement ;
    private Connection connection;
    public DataBase() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                "rastin" , "java123");
        connection.setAutoCommit(false);
    }
    //////////////////////////////////////////////////table/////////////////////////////////////////////////////////////
    public  void create()throws Exception{
        preparedStatement=connection.prepareStatement("CREATE TABLE persons(name1 varchar2(30),id1 varchar2(30),gender1 varchar2(30) , birth1 varchar2(30),death1 varchar2(30)," +
                                                           "weight varchar2(30) ,relation varchar2(30)," +
                                                                                "name2 varchar2(30),id2 varchar2(30),gender2 varchar2(30) , birth2 varchar2(30),death2 varchar2(30))");
        preparedStatement.executeUpdate();
        connection.commit();
    }


    ///////////////////////////////////////////////////////////////////////insert///////////////////////////////////////
    public void insert(Edge edge)throws Exception{


        preparedStatement=connection.prepareStatement("insert into persons(name1,id1,gender1,birth1,death1,weight,relation,name2,id2,gender2,birth2,death2)values(?,?,?,?,?,?,?,?,?,?,?,?)");

        preparedStatement.setString(1,edge.source.name);
        preparedStatement.setString(2,edge.source.id);
        preparedStatement.setString(3,edge.source.gender);
        preparedStatement.setString(4,edge.source.birth);
        preparedStatement.setString(5,edge.source.death);

        preparedStatement.setString(6,String.valueOf(edge.weight));
        preparedStatement.setString(7,edge.relation);

        preparedStatement.setString(8,edge.destination.name);
        preparedStatement.setString(9,edge.destination.id);
        preparedStatement.setString(10,edge.destination.gender);
        preparedStatement.setString(11,edge.destination.birth);
        preparedStatement.setString(12,edge.destination.death);


        preparedStatement.executeUpdate();

        connection.commit();


    }
    ////////////////////////////////////////////////////report//////////////////////////////////////////////////////////
    public ArrayList<Edge> report()throws Exception{
        preparedStatement=connection.prepareStatement("select * from persons");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Edge> list  = new ArrayList<>();
        while (resultSet.next()){
            Person person1 =new Person();
            Person person2 =new Person();
            Edge edge = new Edge();

            person1.name=resultSet.getString("name1");
            person1.id=resultSet.getString("id1");
            person1.gender=resultSet.getString("gender1");
            person1.birth=resultSet.getString("birth1");
            person1.death=resultSet.getString("death1");

            person2.name=resultSet.getString("name2");
            person2.id=resultSet.getString("id2");
            person2.gender=resultSet.getString("gender2");
            person2.birth=resultSet.getString("birth2");
            person2.death=resultSet.getString("death2");

            edge.source=person1;
            edge.destination=person2;
            edge.relation=resultSet.getString("relation");
            edge.weight= Integer.parseInt(resultSet.getString("weight"));

            list.add(edge);
        }
        for(int i=0 ; i<list.size() ; i++){
            System.out.println(list.get(i).source.name +"    "+ list.get(i).destination.name + "   " + list.get(i).weight );
        }
        return list ;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void commite()throws Exception{
        connection.commit();
    }


}
