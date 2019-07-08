package MVC;


public class MVCPatterndemo {

    public static void main(String[] args) {
        Studnet s = new Studnet();
        StudentViewer v = new StudentViewer();
        StudnetController c = new StudnetController(s, v);
        c.setModelName("ahmad");
        c.setModelId(233323233);
        
          c.setModelName("aaaa");
        c.setModelId(233323233);
        
              c.updateView();

    }
}
