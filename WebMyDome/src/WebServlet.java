/**
 * Created by thomas.wang on 2016/12/7.
 */
import com.chenyun.jdbc.SelectDate;

import javax.servlet.http.*;
public class WebServlet extends HttpServlet {
  public void service(HttpServletRequest ret,HttpServletResponse res){
      String user = ret.getParameter("username");
      String pswd = ret.getParameter("password");
      System.out.println(user+","+pswd);
      SelectDate  sd = new SelectDate();
      sd.mains();
      System.out.println("数据库运行完毕！");
  }
}
