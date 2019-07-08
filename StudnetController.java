package MVC;
public class StudnetController {
    Studnet model;
    StudentViewer viewer;

    public StudnetController(Studnet model, StudentViewer viewer) {
        this.model = model;
        this.viewer = viewer;
    }
    
   
    public String getModelName() {
        return model.getName();
    }

    public void setModelName(String name) {
        model.setName(name);
    }

    public int getModelId() {
        return model.getId();
    }

    public void setModelId(int id) {
        model.setId(id);
    }
    
    
    public void updateView(){
        viewer.showData(model.getName(), model.getId());
    }
        
    
}
